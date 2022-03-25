#  Parent

## Element Details

Defines the inheritance relationship between projects from bottom to top. The child project will inherit all the settings from its parent. This feature can effectively avoid the repeated declaration of dependency information in the projects and provide convenience for dependency management. Failing to support parent element may result in missing detection of the dependencies in the parent. Therefore, to ensure the dependency tree is complete, SCA tools should be able to process dependencies in parent element.

## Project Design

This project is an example of Maven project inheritance.

There are two modules. `Parent` is the parents module, and `parent-child` is the child module. Child module only contains 2 dependencies, but it will inherit all  dependencies from parents module. So, when scanning `parent-child`, you should also get the dependencies from `parent`

## Ground Truth

You should scan under the child module `inheritance-child1`. Ground truth are shown below

<details>
<summary>parent-child</summary>
<pre>
org.apache.logging.log4j:log4j-core:jar:2.17.1:compile
org.apache.logging.log4j:log4j-api:jar:2.17.1:compile
org.springframework.boot:spring-boot-starter-log4j2:jar:2.6.1:compile
org.apache.logging.log4j:log4j-slf4j-impl:jar:2.14.1:compile
org.slf4j:slf4j-api:jar:1.7.25:compile
org.apache.logging.log4j:log4j-jul:jar:2.14.1:compile
org.slf4j:jul-to-slf4j:jar:1.7.32:compile
</pre>
</details>


