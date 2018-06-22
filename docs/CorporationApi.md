# CorporationApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCorporationsCorporationId**](CorporationApi.md#getCorporationsCorporationId) | **GET** /corporations/{corporation_id}/ | Get corporation information
[**getCorporationsCorporationIdAlliancehistory**](CorporationApi.md#getCorporationsCorporationIdAlliancehistory) | **GET** /corporations/{corporation_id}/alliancehistory/ | Get alliance history
[**getCorporationsCorporationIdBlueprints**](CorporationApi.md#getCorporationsCorporationIdBlueprints) | **GET** /corporations/{corporation_id}/blueprints/ | Get corporation blueprints
[**getCorporationsCorporationIdContainersLogs**](CorporationApi.md#getCorporationsCorporationIdContainersLogs) | **GET** /corporations/{corporation_id}/containers/logs/ | Get all corporation ALSC logs
[**getCorporationsCorporationIdDivisions**](CorporationApi.md#getCorporationsCorporationIdDivisions) | **GET** /corporations/{corporation_id}/divisions/ | Get corporation divisions
[**getCorporationsCorporationIdFacilities**](CorporationApi.md#getCorporationsCorporationIdFacilities) | **GET** /corporations/{corporation_id}/facilities/ | Get corporation facilities
[**getCorporationsCorporationIdIcons**](CorporationApi.md#getCorporationsCorporationIdIcons) | **GET** /corporations/{corporation_id}/icons/ | Get corporation icon
[**getCorporationsCorporationIdMedals**](CorporationApi.md#getCorporationsCorporationIdMedals) | **GET** /corporations/{corporation_id}/medals/ | Get corporation medals
[**getCorporationsCorporationIdMedalsIssued**](CorporationApi.md#getCorporationsCorporationIdMedalsIssued) | **GET** /corporations/{corporation_id}/medals/issued/ | Get corporation issued medals
[**getCorporationsCorporationIdMembers**](CorporationApi.md#getCorporationsCorporationIdMembers) | **GET** /corporations/{corporation_id}/members/ | Get corporation members
[**getCorporationsCorporationIdMembersLimit**](CorporationApi.md#getCorporationsCorporationIdMembersLimit) | **GET** /corporations/{corporation_id}/members/limit/ | Get corporation member limit
[**getCorporationsCorporationIdMembersTitles**](CorporationApi.md#getCorporationsCorporationIdMembersTitles) | **GET** /corporations/{corporation_id}/members/titles/ | Get corporation&#39;s members&#39; titles
[**getCorporationsCorporationIdMembertracking**](CorporationApi.md#getCorporationsCorporationIdMembertracking) | **GET** /corporations/{corporation_id}/membertracking/ | Track corporation members
[**getCorporationsCorporationIdOutposts**](CorporationApi.md#getCorporationsCorporationIdOutposts) | **GET** /corporations/{corporation_id}/outposts/ | Get corporation outposts
[**getCorporationsCorporationIdOutpostsOutpostId**](CorporationApi.md#getCorporationsCorporationIdOutpostsOutpostId) | **GET** /corporations/{corporation_id}/outposts/{outpost_id}/ | Get corporation outpost details
[**getCorporationsCorporationIdRoles**](CorporationApi.md#getCorporationsCorporationIdRoles) | **GET** /corporations/{corporation_id}/roles/ | Get corporation member roles
[**getCorporationsCorporationIdRolesHistory**](CorporationApi.md#getCorporationsCorporationIdRolesHistory) | **GET** /corporations/{corporation_id}/roles/history/ | Get corporation member roles history
[**getCorporationsCorporationIdShareholders**](CorporationApi.md#getCorporationsCorporationIdShareholders) | **GET** /corporations/{corporation_id}/shareholders/ | Get corporation shareholders
[**getCorporationsCorporationIdStandings**](CorporationApi.md#getCorporationsCorporationIdStandings) | **GET** /corporations/{corporation_id}/standings/ | Get corporation standings
[**getCorporationsCorporationIdStarbases**](CorporationApi.md#getCorporationsCorporationIdStarbases) | **GET** /corporations/{corporation_id}/starbases/ | Get corporation starbases (POSes)
[**getCorporationsCorporationIdStarbasesStarbaseId**](CorporationApi.md#getCorporationsCorporationIdStarbasesStarbaseId) | **GET** /corporations/{corporation_id}/starbases/{starbase_id}/ | Get starbase (POS) detail
[**getCorporationsCorporationIdStructures**](CorporationApi.md#getCorporationsCorporationIdStructures) | **GET** /corporations/{corporation_id}/structures/ | Get corporation structures
[**getCorporationsCorporationIdTitles**](CorporationApi.md#getCorporationsCorporationIdTitles) | **GET** /corporations/{corporation_id}/titles/ | Get corporation titles
[**getCorporationsNames**](CorporationApi.md#getCorporationsNames) | **GET** /corporations/names/ | Get corporation names
[**getCorporationsNpccorps**](CorporationApi.md#getCorporationsNpccorps) | **GET** /corporations/npccorps/ | Get npc corporations


<a name="getCorporationsCorporationId"></a>
# **getCorporationsCorporationId**
> GetCorporationsCorporationIdOk getCorporationsCorporationId(corporationId, datasource, ifNoneMatch, userAgent, xUserAgent)

Get corporation information

Public information about a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/&#x60;  Alternate route: &#x60;/v4/corporations/{corporation_id}/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCorporationsCorporationIdOk result = apiInstance.getCorporationsCorporationId(corporationId, datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCorporationsCorporationIdOk**](GetCorporationsCorporationIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdAlliancehistory"></a>
# **getCorporationsCorporationIdAlliancehistory**
> List&lt;GetCorporationsCorporationIdAlliancehistory200Ok&gt; getCorporationsCorporationIdAlliancehistory(corporationId, datasource, ifNoneMatch, userAgent, xUserAgent)

Get alliance history

Get a list of all the alliances a corporation has been a member of  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/alliancehistory/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/alliancehistory/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdAlliancehistory200Ok> result = apiInstance.getCorporationsCorporationIdAlliancehistory(corporationId, datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdAlliancehistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdAlliancehistory200Ok&gt;**](GetCorporationsCorporationIdAlliancehistory200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdBlueprints"></a>
# **getCorporationsCorporationIdBlueprints**
> List&lt;GetCorporationsCorporationIdBlueprints200Ok&gt; getCorporationsCorporationIdBlueprints(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

Get corporation blueprints

Returns a list of blueprints the corporation owns  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/blueprints/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/blueprints/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdBlueprints200Ok> result = apiInstance.getCorporationsCorporationIdBlueprints(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdBlueprints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdBlueprints200Ok&gt;**](GetCorporationsCorporationIdBlueprints200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdContainersLogs"></a>
# **getCorporationsCorporationIdContainersLogs**
> List&lt;GetCorporationsCorporationIdContainersLogs200Ok&gt; getCorporationsCorporationIdContainersLogs(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

Get all corporation ALSC logs

Returns logs recorded in the past seven days from all audit log secure containers (ALSC) owned by a given corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/containers/logs/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/containers/logs/&#x60;  --- This route is cached for up to 600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdContainersLogs200Ok> result = apiInstance.getCorporationsCorporationIdContainersLogs(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdContainersLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdContainersLogs200Ok&gt;**](GetCorporationsCorporationIdContainersLogs200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdDivisions"></a>
# **getCorporationsCorporationIdDivisions**
> GetCorporationsCorporationIdDivisionsOk getCorporationsCorporationIdDivisions(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Get corporation divisions

Return corporation hangar and wallet division names, only show if a division is not using the default name  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/divisions/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/divisions/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/divisions/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCorporationsCorporationIdDivisionsOk result = apiInstance.getCorporationsCorporationIdDivisions(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdDivisions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCorporationsCorporationIdDivisionsOk**](GetCorporationsCorporationIdDivisionsOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdFacilities"></a>
# **getCorporationsCorporationIdFacilities**
> List&lt;GetCorporationsCorporationIdFacilities200Ok&gt; getCorporationsCorporationIdFacilities(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Get corporation facilities

Return a corporation&#39;s facilities  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/facilities/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/facilities/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/facilities/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Factory_Manager 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdFacilities200Ok> result = apiInstance.getCorporationsCorporationIdFacilities(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdFacilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdFacilities200Ok&gt;**](GetCorporationsCorporationIdFacilities200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdIcons"></a>
# **getCorporationsCorporationIdIcons**
> GetCorporationsCorporationIdIconsOk getCorporationsCorporationIdIcons(corporationId, datasource, ifNoneMatch, userAgent, xUserAgent)

Get corporation icon

Get the icon urls for a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/icons/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCorporationsCorporationIdIconsOk result = apiInstance.getCorporationsCorporationIdIcons(corporationId, datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdIcons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCorporationsCorporationIdIconsOk**](GetCorporationsCorporationIdIconsOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMedals"></a>
# **getCorporationsCorporationIdMedals**
> List&lt;GetCorporationsCorporationIdMedals200Ok&gt; getCorporationsCorporationIdMedals(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

Get corporation medals

Returns a corporation&#39;s medals  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/medals/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/medals/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/medals/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdMedals200Ok> result = apiInstance.getCorporationsCorporationIdMedals(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdMedals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdMedals200Ok&gt;**](GetCorporationsCorporationIdMedals200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMedalsIssued"></a>
# **getCorporationsCorporationIdMedalsIssued**
> List&lt;GetCorporationsCorporationIdMedalsIssued200Ok&gt; getCorporationsCorporationIdMedalsIssued(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

Get corporation issued medals

Returns medals issued by a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/medals/issued/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/medals/issued/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/medals/issued/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdMedalsIssued200Ok> result = apiInstance.getCorporationsCorporationIdMedalsIssued(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdMedalsIssued");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdMedalsIssued200Ok&gt;**](GetCorporationsCorporationIdMedalsIssued200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembers"></a>
# **getCorporationsCorporationIdMembers**
> List&lt;Integer&gt; getCorporationsCorporationIdMembers(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Get corporation members

Return the current member list of a corporation, the token&#39;s character need to be a member of the corporation.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/members/&#x60;  Alternate route: &#x60;/v3/corporations/{corporation_id}/members/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getCorporationsCorporationIdMembers(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembersLimit"></a>
# **getCorporationsCorporationIdMembersLimit**
> Integer getCorporationsCorporationIdMembersLimit(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Get corporation member limit

Return a corporation&#39;s member limit, not including CEO himself  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/members/limit/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/members/limit/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/members/limit/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    Integer result = apiInstance.getCorporationsCorporationIdMembersLimit(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdMembersLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**Integer**

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembersTitles"></a>
# **getCorporationsCorporationIdMembersTitles**
> List&lt;GetCorporationsCorporationIdMembersTitles200Ok&gt; getCorporationsCorporationIdMembersTitles(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Get corporation&#39;s members&#39; titles

Returns a corporation&#39;s members&#39; titles  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/members/titles/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/members/titles/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/members/titles/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdMembersTitles200Ok> result = apiInstance.getCorporationsCorporationIdMembersTitles(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdMembersTitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdMembersTitles200Ok&gt;**](GetCorporationsCorporationIdMembersTitles200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembertracking"></a>
# **getCorporationsCorporationIdMembertracking**
> List&lt;GetCorporationsCorporationIdMembertracking200Ok&gt; getCorporationsCorporationIdMembertracking(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Track corporation members

Returns additional information about a corporation&#39;s members which helps tracking their activities  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/membertracking/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/membertracking/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/membertracking/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdMembertracking200Ok> result = apiInstance.getCorporationsCorporationIdMembertracking(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdMembertracking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdMembertracking200Ok&gt;**](GetCorporationsCorporationIdMembertracking200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdOutposts"></a>
# **getCorporationsCorporationIdOutposts**
> List&lt;Integer&gt; getCorporationsCorporationIdOutposts(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

Get corporation outposts

Get a list of corporation outpost IDs Note: This endpoint will be removed once outposts are migrated to Citadels as talked about in this blog: https://community.eveonline.com/news/dev-blogs/the-next-steps-in-structure-transition/  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/outposts/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/outposts/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/outposts/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getCorporationsCorporationIdOutposts(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdOutposts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdOutpostsOutpostId"></a>
# **getCorporationsCorporationIdOutpostsOutpostId**
> GetCorporationsCorporationIdOutpostsOutpostIdOk getCorporationsCorporationIdOutpostsOutpostId(corporationId, outpostId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Get corporation outpost details

Get details about a given outpost. Note: This endpoint will be removed once outposts are migrated to Citadels as talked about in this blog: https://community.eveonline.com/news/dev-blogs/the-next-steps-in-structure-transition/  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/outposts/{outpost_id}/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/outposts/{outpost_id}/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/outposts/{outpost_id}/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
Integer outpostId = 56; // Integer | A station (outpost) ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCorporationsCorporationIdOutpostsOutpostIdOk result = apiInstance.getCorporationsCorporationIdOutpostsOutpostId(corporationId, outpostId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdOutpostsOutpostId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **outpostId** | **Integer**| A station (outpost) ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCorporationsCorporationIdOutpostsOutpostIdOk**](GetCorporationsCorporationIdOutpostsOutpostIdOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdRoles"></a>
# **getCorporationsCorporationIdRoles**
> List&lt;GetCorporationsCorporationIdRoles200Ok&gt; getCorporationsCorporationIdRoles(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Get corporation member roles

Return the roles of all members if the character has the personnel manager role or any grantable role.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/roles/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdRoles200Ok> result = apiInstance.getCorporationsCorporationIdRoles(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdRoles200Ok&gt;**](GetCorporationsCorporationIdRoles200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdRolesHistory"></a>
# **getCorporationsCorporationIdRolesHistory**
> List&lt;GetCorporationsCorporationIdRolesHistory200Ok&gt; getCorporationsCorporationIdRolesHistory(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

Get corporation member roles history

Return how roles have changed for a coporation&#39;s members, up to a month  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/roles/history/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/roles/history/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/roles/history/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdRolesHistory200Ok> result = apiInstance.getCorporationsCorporationIdRolesHistory(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdRolesHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdRolesHistory200Ok&gt;**](GetCorporationsCorporationIdRolesHistory200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdShareholders"></a>
# **getCorporationsCorporationIdShareholders**
> List&lt;GetCorporationsCorporationIdShareholders200Ok&gt; getCorporationsCorporationIdShareholders(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

Get corporation shareholders

Return the current shareholders of a corporation.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/shareholders/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/shareholders/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/shareholders/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdShareholders200Ok> result = apiInstance.getCorporationsCorporationIdShareholders(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdShareholders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdShareholders200Ok&gt;**](GetCorporationsCorporationIdShareholders200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdStandings"></a>
# **getCorporationsCorporationIdStandings**
> List&lt;GetCorporationsCorporationIdStandings200Ok&gt; getCorporationsCorporationIdStandings(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

Get corporation standings

Return corporation standings from agents, NPC corporations, and factions  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/standings/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/standings/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/standings/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdStandings200Ok> result = apiInstance.getCorporationsCorporationIdStandings(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdStandings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdStandings200Ok&gt;**](GetCorporationsCorporationIdStandings200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdStarbases"></a>
# **getCorporationsCorporationIdStarbases**
> List&lt;GetCorporationsCorporationIdStarbases200Ok&gt; getCorporationsCorporationIdStarbases(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

Get corporation starbases (POSes)

Returns list of corporation starbases (POSes)  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/starbases/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/starbases/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/starbases/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdStarbases200Ok> result = apiInstance.getCorporationsCorporationIdStarbases(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdStarbases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdStarbases200Ok&gt;**](GetCorporationsCorporationIdStarbases200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdStarbasesStarbaseId"></a>
# **getCorporationsCorporationIdStarbasesStarbaseId**
> GetCorporationsCorporationIdStarbasesStarbaseIdOk getCorporationsCorporationIdStarbasesStarbaseId(corporationId, starbaseId, systemId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Get starbase (POS) detail

Returns various settings and fuels of a starbase (POS)  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/starbases/{starbase_id}/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/starbases/{starbase_id}/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/starbases/{starbase_id}/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
Long starbaseId = 789L; // Long | An EVE starbase (POS) ID
Integer systemId = 56; // Integer | The solar system this starbase (POS) is located in,
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCorporationsCorporationIdStarbasesStarbaseIdOk result = apiInstance.getCorporationsCorporationIdStarbasesStarbaseId(corporationId, starbaseId, systemId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdStarbasesStarbaseId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **starbaseId** | **Long**| An EVE starbase (POS) ID |
 **systemId** | **Integer**| The solar system this starbase (POS) is located in, |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCorporationsCorporationIdStarbasesStarbaseIdOk**](GetCorporationsCorporationIdStarbasesStarbaseIdOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdStructures"></a>
# **getCorporationsCorporationIdStructures**
> List&lt;GetCorporationsCorporationIdStructures200Ok&gt; getCorporationsCorporationIdStructures(corporationId, datasource, ifNoneMatch, language, page, token, userAgent, xUserAgent)

Get corporation structures

Get a list of corporation structures. This route&#39;s version includes the changes to structures detailed in this blog: https://www.eveonline.com/article/upwell-2.0-structures-changes-coming-on-february-13th  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/structures/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/structures/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): StationManager 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String language = "en-us"; // String | Language to use in the response
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdStructures200Ok> result = apiInstance.getCorporationsCorporationIdStructures(corporationId, datasource, ifNoneMatch, language, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdStructures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdStructures200Ok&gt;**](GetCorporationsCorporationIdStructures200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdTitles"></a>
# **getCorporationsCorporationIdTitles**
> List&lt;GetCorporationsCorporationIdTitles200Ok&gt; getCorporationsCorporationIdTitles(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

Get corporation titles

Returns a corporation&#39;s titles  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/titles/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/titles/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/titles/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiClient;
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.Configuration;
//import com.github.drsmugleaf.eve.esi.auth.*;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CorporationApi apiInstance = new CorporationApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdTitles200Ok> result = apiInstance.getCorporationsCorporationIdTitles(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsCorporationIdTitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdTitles200Ok&gt;**](GetCorporationsCorporationIdTitles200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsNames"></a>
# **getCorporationsNames**
> List&lt;GetCorporationsNames200Ok&gt; getCorporationsNames(corporationIds, datasource, ifNoneMatch, userAgent, xUserAgent)

Get corporation names

Resolve a set of corporation IDs to corporation names  --- Alternate route: &#x60;/dev/corporations/names/&#x60;  Alternate route: &#x60;/v2/corporations/names/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
List<Integer> corporationIds = Arrays.asList(56); // List<Integer> | A comma separated list of corporation IDs
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsNames200Ok> result = apiInstance.getCorporationsNames(corporationIds, datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationIds** | [**List&lt;Integer&gt;**](Integer.md)| A comma separated list of corporation IDs |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsNames200Ok&gt;**](GetCorporationsNames200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsNpccorps"></a>
# **getCorporationsNpccorps**
> List&lt;Integer&gt; getCorporationsNpccorps(datasource, ifNoneMatch, userAgent, xUserAgent)

Get npc corporations

Get a list of npc corporations  --- Alternate route: &#x60;/dev/corporations/npccorps/&#x60;  Alternate route: &#x60;/legacy/corporations/npccorps/&#x60;  Alternate route: &#x60;/v1/corporations/npccorps/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import com.github.drsmugleaf.eve.esi.ApiException;
//import com.github.drsmugleaf.eve.esi.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getCorporationsNpccorps(datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationsNpccorps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
