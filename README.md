# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.TestingApi;

public class TestingApiExample {

    public static void main(String[] args) {
        TestingApi apiInstance = new TestingApi();
        try {
            Empty result = apiInstance.optionSwaggerCodegen();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestingApi#optionSwaggerCodegen");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://v3emd2k168.execute-api.us-east-1.amazonaws.com/dev*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TestingApi* | [**optionSwaggerCodegen**](docs/TestingApi.md#optionSwaggerCodegen) | **GET** /Swagger-Codegen | 


## Documentation for Models

 - [Empty](docs/Empty.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



