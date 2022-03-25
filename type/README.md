#  Type

## Element details

*Type* has 11 pre-defined values. Besides, developers can define their own *type* values. The default value of type is jar Among all possible values, dependencies with *type java-source*, *javadoc*, *pom*, and *test-jar* are against SCA Scope Guidelines. *Java-source*, *javadoc* and *pom* indicate that the target dependency is not a library nor an executable software component. According to the G2, they should be excluded. Test-jar is a jar packed with test classes. They are used to share test code between module. Though it also contains classes and dependencies not for testing, but such package should never be used in a mature project. They should be replaced by formal distributions without test classes. Therefore, once a jar with test-jar type is found, they should be reported and excluded by SCA Scope Guidelines. The rest possible values are *jar*, *ejb*, *ejb-client, war, ear, rar, maven-plugin* and other self-defined values. All these values match the requirements of SCA Scope Guidelines. 

## Project structure

This project is an example of element `type`.

There are 7 main modules: `type-jar`, `type-ear`, `type-ejb`, `type-war`, `type-rar`, `type-javadoc`, `type-maven-plugin`,  `type-pom`, `type-test-jar` and `type-others`



## Ground Truth

The conditions of each values are shown below. `javadoc`, `pom`,  do not belong to SCA Scan Scope, none of their dependencies should be included in the ground truth. Dependencies with type `pom` do not belong to SCA Scan Scope, because it is not an executable entity. But it imports other libraries into the projects, and these transitive dependencies should be included because it follows all three guidelines.

| items        | In SCA Scan Scope? |
| ------------ | ------------------ |
| jar          | y                  |
| ear          | y                  |
| ejb          | y                  |
| war          | y                  |
| rar          | y                  |
| javadoc      | n                  |
| maven-plugin | y                  |
| pom          | n                  |
| test-jar     | n                  |
| others       | y                  |


<details>
<summary>type-jar</summary>
<pre>
org.apache.logging.log4j:log4j-core:jar:2.17.1:compile
org.apache.logging.log4j:log4j-api:jar:2.17.1:compile
</pre>
</details>

<details>
<summary>type-ear</summary>
<pre>
org.jboss.weld.examples.jsf.translator:weld-jsf-translator-ear:ear:4.0.2.Final:compile
</pre>
</details>

<details>
<summary>type-ejb</summary>
<pre>
org.jboss.weld.examples.jsf.translator:weld-jsf-translator-ejb:ejb:4.0.2.Final:compile
</pre>
</details>

<details>
<summary>type-war</summary>
<pre>
org.jboss.weld.examples.jsf.translator:weld-jsf-translator-war:war:4.0.2.Final:compile
</pre>
</details>

<details>
<summary>type-rar</summary>
<pre>
org.tranql:tranql-connector-ra:rar:1.7:compile
</pre>
</details>

<details>
<summary>type-javadoc</summary>
<pre>
None
</pre>
</details>

<details>
<summary>type-maven-plugin</summary>
<pre>
org.eclipse.xtend:xtend-maven-plugin:maven-plugin:2.7.0:compile
com.google.guava:guava:jar:14.0.1:compile
org.eclipse.xtend:org.eclipse.xtend.core:jar:2.7.0:compile
org.eclipse.xtext:org.eclipse.xtext.xbase:jar:2.7.0:compile
org.eclipse.xtext:org.eclipse.xtext:jar:2.7.0:compile
com.ibm.icu:icu4j:jar:52.1:compile
org.eclipse.xtext:org.eclipse.xtext.common.types:jar:2.7.0:compile
org.eclipse.equinox:common:jar:3.6.200-v20130402-1505:compile
org.eclipse.xtext:org.eclipse.xtext.xbase.lib:jar:2.7.0:compile
org.eclipse.xtext:org.eclipse.xtext.util:jar:2.7.0:compile
org.eclipse.xtext:org.eclipse.xtext.dependencies:jar:2.7.0:compile
org.eclipse.xtend:org.eclipse.xtend.lib:jar:2.7.0:compile
org.eclipse.xtend:org.eclipse.xtend.lib.macro:jar:2.7.0:compile
org.eclipse.emf:org.eclipse.emf.common:jar:2.24.0:compile
org.eclipse.emf:org.eclipse.emf.ecore:jar:2.26.0:compile
com.google.inject:guice:jar:3.0:compile
javax.inject:javax.inject:jar:1:compile
aopalliance:aopalliance:jar:1.0:compile
log4j:log4j:jar:1.2.16:compile
org.ow2.asm:asm-commons:jar:5.0.1:compile
org.ow2.asm:asm-tree:jar:5.0.1:compile
org.ow2.asm:asm:jar:5.0.1:compile
org.apache.maven:maven-core:jar:3.2.1:compile
org.apache.maven:maven-model:jar:3.2.1:compile
org.apache.maven:maven-settings:jar:3.2.1:compile
org.apache.maven:maven-settings-builder:jar:3.2.1:compile
org.apache.maven:maven-repository-metadata:jar:3.2.1:compile
org.apache.maven:maven-artifact:jar:3.2.1:compile
org.apache.maven:maven-plugin-api:jar:3.2.1:compile
org.apache.maven:maven-model-builder:jar:3.2.1:compile
org.apache.maven:maven-aether-provider:jar:3.2.1:compile
org.eclipse.aether:aether-spi:jar:0.9.0.M2:compile
org.eclipse.aether:aether-impl:jar:0.9.0.M2:compile
org.eclipse.aether:aether-api:jar:0.9.0.M2:compile
org.eclipse.aether:aether-util:jar:0.9.0.M2:compile
org.eclipse.sisu:org.eclipse.sisu.plexus:jar:0.0.0.M5:compile
javax.enterprise:cdi-api:jar:1.0:compile
javax.annotation:jsr250-api:jar:1.0:compile
org.sonatype.sisu:sisu-guice:jar:no_aop:3.1.0:compile
org.eclipse.sisu:org.eclipse.sisu.inject:jar:0.0.0.M5:compile
org.codehaus.plexus:plexus-interpolation:jar:1.19:compile
org.codehaus.plexus:plexus-utils:jar:3.0.17:compile
org.codehaus.plexus:plexus-classworlds:jar:2.5.1:compile
org.codehaus.plexus:plexus-component-annotations:jar:1.5.5:compile
org.sonatype.plexus:plexus-sec-dispatcher:jar:1.3:compile
org.sonatype.plexus:plexus-cipher:jar:1.4:compile
org.eclipse.emf:org.eclipse.emf.ecore.xmi:jar:2.16.0:compile
org.antlr:antlr-runtime:jar:3.2:compile
org.eclipse.emf:org.eclipse.emf.codegen:jar:2.22.0:runtime
org.eclipse.platform:org.eclipse.core.runtime:jar:3.24.100:runtime
org.eclipse.platform:org.eclipse.osgi:jar:3.17.200:runtime
org.eclipse.platform:org.eclipse.equinox.common:jar:3.16.0:runtime
org.eclipse.platform:org.eclipse.core.jobs:jar:3.12.100:runtime
org.eclipse.platform:org.eclipse.equinox.registry:jar:3.11.100:runtime
org.eclipse.platform:org.eclipse.equinox.preferences:jar:3.9.100:runtime
org.eclipse.platform:org.eclipse.core.contenttype:jar:3.8.100:runtime
org.eclipse.platform:org.eclipse.equinox.app:jar:1.6.100:runtime
org.eclipse.platform:org.eclipse.core.resources:jar:3.16.100:runtime
org.eclipse.platform:org.eclipse.core.expressions:jar:3.8.100:runtime
org.eclipse.platform:org.eclipse.core.filesystem:jar:1.9.300:runtime
org.eclipse.jdt:org.eclipse.jdt.core:jar:3.29.0:runtime
org.eclipse.jdt:org.eclipse.jdt.launching:jar:3.19.500:runtime
org.eclipse.jdt:org.eclipse.jdt.debug:jar:3.19.100:runtime
org.eclipse.platform:org.eclipse.core.variables:jar:3.5.100:runtime
org.eclipse.platform:org.eclipse.debug.core:jar:3.19.0:runtime
org.eclipse.platform:org.eclipse.text:jar:3.12.0:runtime
org.eclipse.platform:org.eclipse.core.commands:jar:3.10.100:runtime
</pre>
</details>

<details>
<summary>type-pom</summary>
<pre>
org.springframework:spring-beans:jar:5.3.7:compile
org.springframework:spring-core:jar:5.3.7:compile
org.springframework:spring-jcl:jar:5.3.7:compile
</pre>
</details>

<details>
<summary>type-test-jar</summary>
<pre>
None
</pre>
</details>

<details>
<summary>type-others</summary>
<pre>
io.apiman:apiman-distro-tools:zip:2.2.0.Final:compile
io.apiman:apiman-migration-assistant:jar:shaded:2.2.0.Final:compile
info.picocli:picocli:jar:4.6.1:compile
info.picocli:picocli-codegen:jar:4.6.1:compile
com.squareup.okhttp:okhttp:jar:2.7.5:compile
com.squareup.okio:okio:jar:1.6.0:compile
io.apiman:apiman-manager-api-beans:jar:2.2.0.Final:compile
io.apiman:apiman-common-util:jar:2.2.0.Final:compile
com.fasterxml.jackson.core:jackson-databind:jar:2.12.5:compile
com.fasterxml.jackson.core:jackson-annotations:jar:2.12.5:compile
com.fasterxml.jackson.core:jackson-core:jar:2.12.5:compile
org.apache.logging.log4j:log4j-core:jar:2.17.0:compile
org.apache.logging.log4j:log4j-api:jar:2.17.0:compile
org.apache.maven:maven-artifact:jar:3.8.4:compile
org.codehaus.plexus:plexus-utils:jar:3.3.0:compile
org.apache.commons:commons-lang3:jar:3.8.1:compile
</pre>
</details>