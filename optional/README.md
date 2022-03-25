#  Optional Example

## Element Details

Optional indicates the dependency is optional for the current library and will not be transitive. For example, a database library contains both the middleware for MySQL and Postgres. However, developers may only need the middleware for MySQL and the Postgres-related dependencies would be redundant. In this case, developers can manually specify the dependencies they need by setting Postgres to be optional. It reduces the size of the final software. SCA tools, which fail to support the analysis on optional may result in including a lot of irrelevant dependencies in the results. 

## Project Design

This project is an example of Maven project Optional.

There is only one module with only one dependency, `nacos-client` inside. Originally, this component has 19 direct dependencies, but 9 of them are optional, which means they will not be visible to the project who import it as a dependency, for example, `nacos-api`. You should not see `optional` dependencies in your dependency tree.

## Operation

You should scan under the main module `optional`. Ground truth are shown below 

<details>
<summary>Optional</summary>
<pre>
 com.alibaba.nacos:nacos-client:jar:2.0.3:compile
commons-codec:commons-codec:jar:1.11:compile
com.fasterxml.jackson.core:jackson-core:jar:2.12.2:compile
com.fasterxml.jackson.core:jackson-databind:jar:2.12.2:compile
com.fasterxml.jackson.core:jackson-annotations:jar:2.12.2:compile
org.apache.httpcomponents:httpasyncclient:jar:4.1.3:compile
org.apache.httpcomponents:httpcore:jar:4.4.6:compile
org.apache.httpcomponents:httpcore-nio:jar:4.4.6:compile
org.apache.httpcomponents:httpclient:jar:4.5.3:compile
commons-logging:commons-logging:jar:1.2:compile
org.reflections:reflections:jar:0.9.11:compile
com.google.guava:guava:jar:20.0:compile
org.javassist:javassist:jar:3.21.0-GA:compile
io.prometheus:simpleclient:jar:0.5.0:compile
org.yaml:snakeyaml:jar:1.23:compile
</pre>
</details>


