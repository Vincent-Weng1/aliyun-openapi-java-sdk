/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.DescribeDataLakeAnalyticsServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataLakeAnalyticsServiceResponseUnmarshaller {

	public static DescribeDataLakeAnalyticsServiceResponse unmarshall(DescribeDataLakeAnalyticsServiceResponse describeDataLakeAnalyticsServiceResponse, UnmarshallerContext _ctx) {
		
		describeDataLakeAnalyticsServiceResponse.setRequestId(_ctx.stringValue("DescribeDataLakeAnalyticsServiceResponse.RequestId"));
		describeDataLakeAnalyticsServiceResponse.setSuccess(_ctx.booleanValue("DescribeDataLakeAnalyticsServiceResponse.Success"));
		describeDataLakeAnalyticsServiceResponse.setErrorCode(_ctx.stringValue("DescribeDataLakeAnalyticsServiceResponse.ErrorCode"));
		describeDataLakeAnalyticsServiceResponse.setErrorInfo(_ctx.stringValue("DescribeDataLakeAnalyticsServiceResponse.ErrorInfo"));
		describeDataLakeAnalyticsServiceResponse.setResult(_ctx.stringValue("DescribeDataLakeAnalyticsServiceResponse.Result"));
	 
	 	return describeDataLakeAnalyticsServiceResponse;
	}
}