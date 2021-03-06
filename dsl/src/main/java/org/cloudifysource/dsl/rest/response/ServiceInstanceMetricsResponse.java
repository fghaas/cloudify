/*******************************************************************************
 * Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/
package org.cloudifysource.dsl.rest.response;

/**
 * 
 *  *  A POJO represent service instance metrics response.
 * 
 * @author ahmad
 *
 */
public class ServiceInstanceMetricsResponse {

	private String serviceName;
	private String appName;
	private ServiceInstanceMetricsData serviceInstanceMetricsData;

	public ServiceInstanceMetricsData getServiceInstanceMetricsData() {
		return serviceInstanceMetricsData;
	}

	public void setServiceInstanceMetricsData(
			ServiceInstanceMetricsData serviceInstanceMetricsData) {
		this.serviceInstanceMetricsData = serviceInstanceMetricsData;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
