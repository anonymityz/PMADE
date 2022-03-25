#  DependencyManagement

## Element Details

`DependencyManagement` is used to batch manage the versions of child dependencies and transitive dependencies. Developers can specify full information of dependencies in the `dependencyManagement` section, and all transitive dependencies with the same group and artifact ID will be unified. Developers can also manually refer to the dependencies specified in `dependencyManagement` by writing the group and artifact ID. Note that if a dependency in the `dependencyManagement` section is not referred to in the dependencies section, it will not be downloaded for compilation or execution. Failure to support parsing `dependencyManagement` information will cause in-completion of dependency information, such as versions and scopes.

## Project Design

This project is an example of element `dependencyManagement `. There is only one module. In the project, `org.springframework.boot:spring-boot-starter-log4j2:2.6.1` originally contains `org.apache.logging.log4j:log4j-core` in version `2.14.1`. But with `dependencyManagement`, they will be updated to `2.17.1` 

## Ground Truth

Settings in `dependencyManagement` may overwrite the versions of transitive dependencies.  Note that if a dependency setting in `dependencyManagement` is not used in the dependency or their transitive dependencies, is should not be list in the final dependency list.

<details>
<summary>dependencyManagement</summary>
<pre>
org.springframework.boot:spring-boot-starter-log4j2:jar:2.6.1:compile
org.apache.logging.log4j:log4j-slf4j-impl:jar:2.14.1:compile
org.slf4j:slf4j-api:jar:1.7.25:compile
org.apache.logging.log4j:log4j-api:jar:2.17.1:compile
org.apache.logging.log4j:log4j-core:jar:2.17.1:compile
org.apache.logging.log4j:log4j-jul:jar:2.14.1:compile
org.slf4j:jul-to-slf4j:jar:1.7.32:compile
</pre>
</details>