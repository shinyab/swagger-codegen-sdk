# TestingApi

All URIs are relative to *https://v3emd2k168.execute-api.us-east-1.amazonaws.com/dev*

Method | HTTP request | Description
------------- | ------------- | -------------
[**optionSwaggerCodegen**](TestingApi.md#optionSwaggerCodegen) | **GET** /Swagger-Codegen | 


<a name="optionSwaggerCodegen"></a>
# **optionSwaggerCodegen**
> Cat optionSwaggerCodegen()



### Example
```java
// Import classes:
//import io.swagger.client.api.TestingApi;

TestingApi apiInstance = new TestingApi();
try {
    Cat result = apiInstance.optionSwaggerCodegen();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestingApi#optionSwaggerCodegen");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Cat**](Cat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

