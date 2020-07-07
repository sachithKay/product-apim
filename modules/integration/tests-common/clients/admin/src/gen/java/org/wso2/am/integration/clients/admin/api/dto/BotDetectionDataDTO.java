/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.2
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BotDetectionDataDTO
 */

public class BotDetectionDataDTO {
  @SerializedName("recordedTime")
  private Long recordedTime = null;

  @SerializedName("messageID")
  private String messageID = null;

  @SerializedName("apiMethod")
  private String apiMethod = null;

  @SerializedName("headerSet")
  private String headerSet = null;

  @SerializedName("messageBody")
  private String messageBody = null;

  @SerializedName("clientIp")
  private String clientIp = null;

  public BotDetectionDataDTO recordedTime(Long recordedTime) {
    this.recordedTime = recordedTime;
    return this;
  }

   /**
   * The time of detection
   * @return recordedTime
  **/
  @ApiModelProperty(example = "1591734138413", value = "The time of detection")
  public Long getRecordedTime() {
    return recordedTime;
  }

  public void setRecordedTime(Long recordedTime) {
    this.recordedTime = recordedTime;
  }

  public BotDetectionDataDTO messageID(String messageID) {
    this.messageID = messageID;
    return this;
  }

   /**
   * The message ID
   * @return messageID
  **/
  @ApiModelProperty(example = "urn:uuid:1ed6d2de-29df-4fed-a96a-46d2329dce65", value = "The message ID")
  public String getMessageID() {
    return messageID;
  }

  public void setMessageID(String messageID) {
    this.messageID = messageID;
  }

  public BotDetectionDataDTO apiMethod(String apiMethod) {
    this.apiMethod = apiMethod;
    return this;
  }

   /**
   * The api method
   * @return apiMethod
  **/
  @ApiModelProperty(example = "GET", value = "The api method")
  public String getApiMethod() {
    return apiMethod;
  }

  public void setApiMethod(String apiMethod) {
    this.apiMethod = apiMethod;
  }

  public BotDetectionDataDTO headerSet(String headerSet) {
    this.headerSet = headerSet;
    return this;
  }

   /**
   * The header set
   * @return headerSet
  **/
  @ApiModelProperty(example = "", value = "The header set")
  public String getHeaderSet() {
    return headerSet;
  }

  public void setHeaderSet(String headerSet) {
    this.headerSet = headerSet;
  }

  public BotDetectionDataDTO messageBody(String messageBody) {
    this.messageBody = messageBody;
    return this;
  }

   /**
   * The content of the message body
   * @return messageBody
  **/
  @ApiModelProperty(example = "<soapenv:Body xmlns:soapenv=\\\"http://www.w3.org/2003/05/soap-envelope\\\"/>", value = "The content of the message body")
  public String getMessageBody() {
    return messageBody;
  }

  public void setMessageBody(String messageBody) {
    this.messageBody = messageBody;
  }

  public BotDetectionDataDTO clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * The IP of the client
   * @return clientIp
  **/
  @ApiModelProperty(example = "127.0.0.1", value = "The IP of the client")
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotDetectionDataDTO botDetectionData = (BotDetectionDataDTO) o;
    return Objects.equals(this.recordedTime, botDetectionData.recordedTime) &&
        Objects.equals(this.messageID, botDetectionData.messageID) &&
        Objects.equals(this.apiMethod, botDetectionData.apiMethod) &&
        Objects.equals(this.headerSet, botDetectionData.headerSet) &&
        Objects.equals(this.messageBody, botDetectionData.messageBody) &&
        Objects.equals(this.clientIp, botDetectionData.clientIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordedTime, messageID, apiMethod, headerSet, messageBody, clientIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotDetectionDataDTO {\n");
    
    sb.append("    recordedTime: ").append(toIndentedString(recordedTime)).append("\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    apiMethod: ").append(toIndentedString(apiMethod)).append("\n");
    sb.append("    headerSet: ").append(toIndentedString(headerSet)).append("\n");
    sb.append("    messageBody: ").append(toIndentedString(messageBody)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

