# RESTful Web Services iDempiere Plugin

- Copyright: 2019 INGEINT <https://www.ingeint.com>
- Repository: https://bitbucket.org/ingeint/idempiere-restful-plugin
- License: GPL 2

## Description
This is an example of how to create new endpoints for iDempiere and how to integrate RESTful definition. 

## Apache CXF
- https://cxf.apache.org/docs/jax-rs-data-bindings.html

## Features
- Partner CRUD
- Restful resources definitions (enpoint, message, http status code)
- Json contract
- Exceptions handlers
- Transactions
- Version endpoint

## Instructions
- Use the [postman](https://www.getpostman.com/) collection in [docs/com.ingeint.restful.postman_collection.json](docs/com.ingeint.restful.postman_collection.json)
- Use `RequestEnv` to get the current transactions name and iDempiere context.
- Use a target platform to build the bundle.

## Adding a new endpoint

It's necessary to add a new bean in [WEB-INF/beans.xml](WEB-INF/beans.xml) file:

```
<jaxrs:serviceBeans>
			<bean class="com.ingeint.ws.controller.PartnerController" />
			<bean class="com.ingeint.ws.controller.VersionController" />
</jaxrs:serviceBeans>
```

## Adding a new library

Add the new dependency (`artifacItem`) to the [pom.xml](pom.xml) file in the `artifactItems` attribute, example:

```xml
    <artifactItems>
        <artifactItem>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>28.0-jre</version>
        </artifactItem>
    </artifactItems>
```

Then, add a new classpath entry in the [.classpath](.classpath) file, example:
```xml
    <classpathentry kind="lib" path="lib/guava.jar"/>
```

Verify you are including the folder `lib` in the [build.properties](build.properties) file, exaple:

```properties
bin.includes = .,\
               META-INF/,\
               OSGI-INF/,\
               lib/
```

Finally, add the new dependency in [MANIFEST.MF](META-INF/MANIFEST.MF) file as a `Bundle-ClassPath` attribute, example:

```manifest
Bundle-ClassPath: .,
 lib/guava.jar
```

## Target Platform

A target platform allows you to download dependencies and build the jar plugin, there are some examples:

- [INGEINT](https://bitbucket.org/ingeint/ingeint-idempiere-target-platform)
- [GlobalQSS](https://bitbucket.org/CarlosRuiz_globalqss/globalqss-idempiere-lco)
- [AMERPsoft](https://wiki.idempiere.org/en/Building_iDempiere_Plugins_with_Maven)

