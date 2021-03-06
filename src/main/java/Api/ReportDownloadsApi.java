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


import org.joda.time.LocalDate;
import Model.Reportingv3ReportDownloadsGet400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportDownloadsApi {
    private ApiClient apiClient;

    public ReportDownloadsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportDownloadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for downloadReport
     * @param reportDate Valid date on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd  (required)
     * @param reportName Name of the report to download (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param reportTime Valid time on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Time Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example time format:**   - hh:mm:ss±hh:mm  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call downloadReportCall(LocalDate reportDate, String reportName, String organizationId, String reportTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/report-downloads";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));
        if (reportDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportDate", reportDate));
        if (reportName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportName", reportName));
        if (reportTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportTime", reportTime));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "text/csv"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadReportValidateBeforeCall(LocalDate reportDate, String reportName, String organizationId, String reportTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportDate' is set
        if (reportDate == null) {
            throw new ApiException("Missing the required parameter 'reportDate' when calling downloadReport(Async)");
        }
        
        // verify the required parameter 'reportName' is set
        if (reportName == null) {
            throw new ApiException("Missing the required parameter 'reportName' when calling downloadReport(Async)");
        }
        
        
        okhttp3.Call call = downloadReportCall(reportDate, reportName, organizationId, reportTime, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Download a Report
     * Download a report using the unique report name and date. 
     * @param reportDate Valid date on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd  (required)
     * @param reportName Name of the report to download (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param reportTime Valid time on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Time Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example time format:**   - hh:mm:ss±hh:mm  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void downloadReport(LocalDate reportDate, String reportName, String organizationId, String reportTime) throws ApiException {
        downloadReportWithHttpInfo(reportDate, reportName, organizationId, reportTime);
    }

    /**
     * Download a Report
     * Download a report using the unique report name and date. 
     * @param reportDate Valid date on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd  (required)
     * @param reportName Name of the report to download (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param reportTime Valid time on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Time Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example time format:**   - hh:mm:ss±hh:mm  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InputStream> downloadReportWithHttpInfo(LocalDate reportDate, String reportName, String organizationId, String reportTime) throws ApiException {
        okhttp3.Call call = downloadReportValidateBeforeCall(reportDate, reportName, organizationId, reportTime, null, null);
        return apiClient.execute(call);
    }

    /**
     * Download a Report (asynchronously)
     * Download a report using the unique report name and date. 
     * @param reportDate Valid date on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd  (required)
     * @param reportName Name of the report to download (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param reportTime Valid time on which to download the report in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Time Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example time format:**   - hh:mm:ss±hh:mm  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call downloadReportAsync(LocalDate reportDate, String reportName, String organizationId, String reportTime, final ApiCallback<Void> callback) throws ApiException {

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

        okhttp3.Call call = downloadReportValidateBeforeCall(reportDate, reportName, organizationId, reportTime, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
