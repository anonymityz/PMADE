#  Version Example

## Element Details

*Version* element has three types of representations. *Version range* allows developers to specify version ranges within which the artifacts will be upgraded automatically. To keep the tree structure intact, SCA tools have to resolve a range into the correct version. *Variable as version* allows developers to manage the version information by variables. Developers can use a variable instead of a specified version number as the dependency version. Unstable versions (such as SNAPSHOT) are used to mark the projects that are not released to the public yet. The dependencies with unstable version itself should always be excluded, but if it is locally installed, build scan mode resolve the transitive dependencies, and we should only keep the transitive dependencies. Otherwise, we cannot derive the transitive dependencies of an unstable version package. Failure to support such a function can result in the wrong version value of dependencies. 

## Project Design

There are 3 main modules: version range and version in property. Note that to make the project runnable, you have to put the environment variable as follow

```
export vv=2.17.1
```

Also, when trigger the scan, you must add `-Dmyversion=2.17.1`. 

These two options are for `version as variable` to verify the situation when variables come from system environment or command line arguments. Furthermore, you must run `mvn install` for project `version-range`. This is for `unstable-version`'s reference.



## Ground Truth

You can scan the project under the main folder `version` or go into sub-modules to scan one by one. Ground truth are shown below

<details>
<summary>version-range</summary>
<pre>
junit:junit:jar:4.3.1:compile
org.apache.logging.log4j:log4j-core:jar:2.17.0:compile
org.apache.logging.log4j:log4j-api:jar:2.17.0:compile
</pre>
</details>

<details>
<summary>version-as-variable</summary>
<pre>
junit:junit:jar:4.3.1:compile
javax.servlet.jsp:jsp-api:jar:2.1:compile
org.apache.logging.log4j:log4j-core:jar:2.17.1:compile
org.apache.logging.log4j:log4j-api:jar:2.17.1:compile
</pre>
</details>
<details>
<summary>unstable-version</summary>
<pre>
junit:junit:jar:4.3.1:compile
org.apache.logging.log4j:log4j-core:jar:2.17.0:compile
org.apache.logging.log4j:log4j-api:jar:2.17.0:compile
</pre>
</details>