#  Exclusion

## Element Details

Exclusion excludes the specified dependency from all its transitive dependencies. This feature is usually used to avoid dependency conflict. For example, library A depends on D1 and B depends on D2. D1 and D2 are the same libraries in different versions. According to Maven dependency resolution rules, A and B will use D1 by default. However, if A excludes D1, both A and B will use D2. Therefore, failing to support exclusion may result in resolving the wrong version of dependencies 

<img src="/home/nryet/桌面/Snipaste_2022-03-24_21-28-51.png" style="zoom:50%;" />

## Project Design

This project is an example of element `exclusion `. There is only one module.  In this project, both `log4j-core` and `log4j-api` are excluded, you should not see them in the dependency tree.

## Operation

You can scan the project under the main folder `exclusion`. Ground truth are shown below

<details>
<summary>exclusion</summary>
<pre>
org.springframework.boot:spring-boot-starter-log4j2:jar:2.6.1:compile
org.apache.logging.log4j:log4j-slf4j-impl:jar:2.14.1:compile
org.slf4j:slf4j-api:jar:1.7.25:compile
org.apache.logging.log4j:log4j-jul:jar:2.14.1:compile
org.slf4j:jul-to-slf4j:jar:1.7.32:compile
</pre>
</details>

