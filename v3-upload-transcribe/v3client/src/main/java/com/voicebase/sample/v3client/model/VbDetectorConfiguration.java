/*
 * Voicebase V3 API
 * APIs for speech recognition and speech analytics, powering insights every business needs.
 *
 * OpenAPI spec version: 3.0.1
 * Contact: support@voicebase.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.voicebase.sample.v3client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import com.voicebase.sample.v3client.model.VbParameter;
import com.voicebase.sample.v3client.model.VbRedactorConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbDetectorConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbDetectorConfiguration {
  @JsonProperty("detectorId")
  private String detectorId = null;

  @JsonProperty("detectorName")
  private String detectorName = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("parameters")
  private java.util.List<VbParameter> parameters = new java.util.ArrayList<VbParameter>();

  @JsonProperty("redactor")
  private VbRedactorConfiguration redactor = null;

  public VbDetectorConfiguration detectorId(String detectorId) {
    this.detectorId = detectorId;
    return this;
  }

   /**
   * Detector identifier, a UUID
   * @return detectorId
  **/
  @ApiModelProperty(example = "null", value = "Detector identifier, a UUID")
  public String getDetectorId() {
    return detectorId;
  }

  public void setDetectorId(String detectorId) {
    this.detectorId = detectorId;
  }

  public VbDetectorConfiguration detectorName(String detectorName) {
    this.detectorName = detectorName;
    return this;
  }

   /**
   * A name identifying a detector offered by Voicebase to all customers
   * @return detectorName
  **/
  @ApiModelProperty(example = "null", value = "A name identifying a detector offered by Voicebase to all customers")
  public String getDetectorName() {
    return detectorName;
  }

  public void setDetectorName(String detectorName) {
    this.detectorName = detectorName;
  }

  public VbDetectorConfiguration version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Provide a specific version (e.g. \"3.1.3\"), specify a minimum (e.g. \"3.1+\") or get the \"latest\". Defaults to \"latest\" if not specified.
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "Provide a specific version (e.g. \"3.1.3\"), specify a minimum (e.g. \"3.1+\") or get the \"latest\". Defaults to \"latest\" if not specified.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public VbDetectorConfiguration parameters(java.util.List<VbParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public VbDetectorConfiguration addParametersItem(VbParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * List of parameter values to the detector
   * @return parameters
  **/
  @ApiModelProperty(example = "null", value = "List of parameter values to the detector")
  public java.util.List<VbParameter> getParameters() {
    return parameters;
  }

  public void setParameters(java.util.List<VbParameter> parameters) {
    this.parameters = parameters;
  }

  public VbDetectorConfiguration redactor(VbRedactorConfiguration redactor) {
    this.redactor = redactor;
    return this;
  }

   /**
   * Get redactor
   * @return redactor
  **/
  @ApiModelProperty(example = "null", value = "")
  public VbRedactorConfiguration getRedactor() {
    return redactor;
  }

  public void setRedactor(VbRedactorConfiguration redactor) {
    this.redactor = redactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbDetectorConfiguration vbDetectorConfiguration = (VbDetectorConfiguration) o;
    return Objects.equals(this.detectorId, vbDetectorConfiguration.detectorId) &&
        Objects.equals(this.detectorName, vbDetectorConfiguration.detectorName) &&
        Objects.equals(this.version, vbDetectorConfiguration.version) &&
        Objects.equals(this.parameters, vbDetectorConfiguration.parameters) &&
        Objects.equals(this.redactor, vbDetectorConfiguration.redactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectorId, detectorName, version, parameters, redactor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbDetectorConfiguration {\n");
    
    sb.append("    detectorId: ").append(toIndentedString(detectorId)).append("\n");
    sb.append("    detectorName: ").append(toIndentedString(detectorName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    redactor: ").append(toIndentedString(redactor)).append("\n");
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

