/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.cellery.cell.api.publisher.beans.request;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cellery.cell.api.publisher.utils.Constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/** Class to represents information required for updating an API. */
public class ApiUpdateRequest {

  @JsonProperty(Constants.JsonParamNames.ID)
  private String id;

  @JsonProperty(Constants.JsonParamNames.IS_DEFAULT_VERSION)
  private Boolean isDefaultVersion;

  @JsonProperty(Constants.JsonParamNames.TRANSPORT)
  private List transport;

  @JsonProperty(Constants.JsonParamNames.TIERS)
  private List tiers;

  @JsonProperty(Constants.JsonParamNames.GATEWAY_ENVIRONMENTS)
  private String gatewayEnvironments;

  @JsonProperty(Constants.JsonParamNames.VISIBILITY)
  private String visibility;

  @JsonProperty(Constants.JsonParamNames.LABELS)
  private List labels;

  @JsonProperty(Constants.JsonParamNames.API_DEFINITION)
  private String apiDefinition;

  @JsonProperty(Constants.JsonParamNames.ENDPOINT_CONFIG)
  private String endpointConfig;

  @JsonProperty(Constants.JsonParamNames.ADDITIONAL_PROPERTIES)
  private Map<String, String> additionalProperties;

  public ApiUpdateRequest() {
    this.isDefaultVersion = true;
    this.transport = Arrays.asList("http", "https");
    this.tiers = Collections.singletonList("Unlimited");
    this.gatewayEnvironments = "";
    this.visibility = "PUBLIC";
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getApiDefinition() {
    return apiDefinition;
  }

  public void setApiDefinition(String apiDefinition) {
    this.apiDefinition = apiDefinition;
  }

  @JsonGetter("isDefaultVersion")
  public Boolean isDefaultVersion() {
    return isDefaultVersion;
  }

  public void setDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
  }

  public List getTransport() {
    return transport;
  }

  public void setTransport(List transport) {
    this.transport = transport;
  }

  public List getTiers() {
    return tiers;
  }

  public void setTiers(List tiers) {
    this.tiers = tiers;
  }

  public String getGatewayEnvironments() {
    return gatewayEnvironments;
  }

  public void setGatewayEnvironments(String gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
  }

  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public String getEndpointConfig() {
    return endpointConfig;
  }

  public void setEndpointConfig(String endpointConfig) {
    this.endpointConfig = endpointConfig;
  }

  public List getLabels() {
    return labels;
  }

  public void setLabels(List labels) {
    this.labels = labels;
  }

  public Map<String, String> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }
}
