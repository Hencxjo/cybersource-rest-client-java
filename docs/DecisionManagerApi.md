# DecisionManagerApi

All URIs are relative to *https://apitest.cybersource.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNegative**](DecisionManagerApi.md#addNegative) | **POST** /risk/v1/lists/{type}/entries | List Management
[**createDecisionManagerCase**](DecisionManagerApi.md#createDecisionManagerCase) | **POST** /risk/v1/decisions | Create Decision Manager Case
[**fraudUpdate**](DecisionManagerApi.md#fraudUpdate) | **POST** /risk/v1/decisions/{id}/marking | Fraud Marking


<a name="addNegative"></a>
# **addNegative**
> RiskV1UpdatePost201Response addNegative(type, addNegativeListRequest)

List Management

This call adds/deletes/converts the request information in the negative list.  Provide the list to be updated as the path parameter. This value can be &#39;postiive&#39;, &#39;negative&#39; or &#39;review&#39;. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DecisionManagerApi;


DecisionManagerApi apiInstance = new DecisionManagerApi();
String type = "type_example"; // String | The list to be updated. It can be 'positive', 'negative' or 'review'.
AddNegativeListRequest addNegativeListRequest = new AddNegativeListRequest(); // AddNegativeListRequest | 
try {
    RiskV1UpdatePost201Response result = apiInstance.addNegative(type, addNegativeListRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionManagerApi#addNegative");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The list to be updated. It can be &#39;positive&#39;, &#39;negative&#39; or &#39;review&#39;. |
 **addNegativeListRequest** | [**AddNegativeListRequest**](AddNegativeListRequest.md)|  |

### Return type

[**RiskV1UpdatePost201Response**](RiskV1UpdatePost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="createDecisionManagerCase"></a>
# **createDecisionManagerCase**
> RiskV1DecisionsPost201Response createDecisionManagerCase(createDecisionManagerCaseRequest)

Create Decision Manager Case

This is the combined request to the Decision Manager Service for a transaction sent to Cybersource. Decision Manager will return a decision based on the request values. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DecisionManagerApi;


DecisionManagerApi apiInstance = new DecisionManagerApi();
CreateDecisionManagerCaseRequest createDecisionManagerCaseRequest = new CreateDecisionManagerCaseRequest(); // CreateDecisionManagerCaseRequest | 
try {
    RiskV1DecisionsPost201Response result = apiInstance.createDecisionManagerCase(createDecisionManagerCaseRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionManagerApi#createDecisionManagerCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDecisionManagerCaseRequest** | [**CreateDecisionManagerCaseRequest**](CreateDecisionManagerCaseRequest.md)|  |

### Return type

[**RiskV1DecisionsPost201Response**](RiskV1DecisionsPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

<a name="fraudUpdate"></a>
# **fraudUpdate**
> RiskV1UpdatePost201Response fraudUpdate(id, fraudMarkingActionRequest)

Fraud Marking

This can be used to - 1. Add known fraudulent data to the fraud history 2. Remove data added to history with Transaction Marking Tool or by uploading chargeback files 3. Remove chargeback data from history that was automatically added. For detailed information, contact your Cybersource representative  Place the request ID of the transaction you want to mark as suspect (or remove from history) as the path parameter in this request. 

### Example
```java
// Import classes:
//import Invokers.ApiException;
//import Api.DecisionManagerApi;


DecisionManagerApi apiInstance = new DecisionManagerApi();
String id = "id_example"; // String | Request ID of the transaction that you want to mark as suspect or remove from history.
FraudMarkingActionRequest fraudMarkingActionRequest = new FraudMarkingActionRequest(); // FraudMarkingActionRequest | 
try {
    RiskV1UpdatePost201Response result = apiInstance.fraudUpdate(id, fraudMarkingActionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionManagerApi#fraudUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Request ID of the transaction that you want to mark as suspect or remove from history. |
 **fraudMarkingActionRequest** | [**FraudMarkingActionRequest**](FraudMarkingActionRequest.md)|  |

### Return type

[**RiskV1UpdatePost201Response**](RiskV1UpdatePost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/hal+json;charset=utf-8

