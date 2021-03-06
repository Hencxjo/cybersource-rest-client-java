/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import Model.AuthenticationExemptionsRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.RiskV1AuthenticationExcemptionsPost400Response;
import Model.RiskV1AuthenticationExemptionsPost201Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationExemptionsApi {
    private ApiClient apiClient;

    public AuthenticationExemptionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationExemptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for authenticationExemptions
     * @param authenticationExemptionsRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call authenticationExemptionsCall(AuthenticationExemptionsRequest authenticationExemptionsRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = authenticationExemptionsRequest;
        
        // create path and map variables
        String localVarPath = "/risk/v1/authentication-exemptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call authenticationExemptionsValidateBeforeCall(AuthenticationExemptionsRequest authenticationExemptionsRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authenticationExemptionsRequest' is set
        if (authenticationExemptionsRequest == null) {
            throw new ApiException("Missing the required parameter 'authenticationExemptionsRequest' when calling authenticationExemptions(Async)");
        }
        
        
        okhttp3.Call call = authenticationExemptionsCall(authenticationExemptionsRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Authentication Exemptions Service
     * A new CYBS branded service to connect to VISA’s REST API to enable Visa Transaction Advisor (VTA) as a standalone service for merchants to support PSD2/SCA adoption and exemptions processing startegy in Europe.VTA Provides intelligent risk data to merchants as inputs to their in-house fraud management tools for fraud mitigation on Visa transactions. 
     * @param authenticationExemptionsRequest  (required)
     * @return RiskV1AuthenticationExemptionsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskV1AuthenticationExemptionsPost201Response authenticationExemptions(AuthenticationExemptionsRequest authenticationExemptionsRequest) throws ApiException {
        ApiResponse<RiskV1AuthenticationExemptionsPost201Response> resp = authenticationExemptionsWithHttpInfo(authenticationExemptionsRequest);
        return resp.getData();
    }

    /**
     * Authentication Exemptions Service
     * A new CYBS branded service to connect to VISA’s REST API to enable Visa Transaction Advisor (VTA) as a standalone service for merchants to support PSD2/SCA adoption and exemptions processing startegy in Europe.VTA Provides intelligent risk data to merchants as inputs to their in-house fraud management tools for fraud mitigation on Visa transactions. 
     * @param authenticationExemptionsRequest  (required)
     * @return ApiResponse&lt;RiskV1AuthenticationExemptionsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskV1AuthenticationExemptionsPost201Response> authenticationExemptionsWithHttpInfo(AuthenticationExemptionsRequest authenticationExemptionsRequest) throws ApiException {
        okhttp3.Call call = authenticationExemptionsValidateBeforeCall(authenticationExemptionsRequest, null, null);
        Type localVarReturnType = new TypeToken<RiskV1AuthenticationExemptionsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Authentication Exemptions Service (asynchronously)
     * A new CYBS branded service to connect to VISA’s REST API to enable Visa Transaction Advisor (VTA) as a standalone service for merchants to support PSD2/SCA adoption and exemptions processing startegy in Europe.VTA Provides intelligent risk data to merchants as inputs to their in-house fraud management tools for fraud mitigation on Visa transactions. 
     * @param authenticationExemptionsRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call authenticationExemptionsAsync(AuthenticationExemptionsRequest authenticationExemptionsRequest, final ApiCallback<RiskV1AuthenticationExemptionsPost201Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = authenticationExemptionsValidateBeforeCall(authenticationExemptionsRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskV1AuthenticationExemptionsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
