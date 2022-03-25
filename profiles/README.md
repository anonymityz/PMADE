#  Profiles Example

## Element Details

Profiles is used to dynamically modify the project settings according to different activation conditions. An activation condition could be a special flag value, a system variable, etc. If no condition is assigned, there will be a default profile. For build scan, tools should check for activation conditions and resolve related dependencies, while for pre-build scan, tools should at least support resolving the dependencies in the default profile. Failure to support profiles will result in resolving wrong dependencies or missing the dependencies. 

## Project Design

This project is an example of Maven project profiles.

There is only one module with two profiles, the two profiles contains different set of dependencies. The default profile will be activated unless you build and run it with `-Ddebug=true`, then another profile is activated, the SCA tool should detect another set of dependencies.

## Ground Truth

You should scan under the main module `profiles`. Ground truth are shown below

<details>
<summary>profiles-default</summary>
<pre>
org.apache.logging.log4j:log4j-core:jar:2.17.1:compile
org.apache.logging.log4j:log4j-api:jar:2.17.1:compile
</pre>
</details>

<details>
<summary>profiles-other</summary>
<pre>
org.springframework.boot:spring-boot-starter-log4j2:jar:2.6.1:compile
org.apache.logging.log4j:log4j-slf4j-impl:jar:2.14.1:compile
org.slf4j:slf4j-api:jar:1.7.25:compile
org.apache.logging.log4j:log4j-api:jar:2.14.1:compile
org.apache.logging.log4j:log4j-core:jar:2.14.1:compile
org.apache.logging.log4j:log4j-jul:jar:2.14.1:compile
org.slf4j:jul-to-slf4j:jar:1.7.32:compile
</pre>
</details>


