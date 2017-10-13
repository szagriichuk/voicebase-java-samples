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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbParameterDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbParameterDefinition {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("optional")
  private Boolean optional = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("valueSet")
  private java.util.List<String> valueSet = new java.util.ArrayList<String>();

  @JsonProperty("defaultValue")
  private String defaultValue = null;

  public VbParameterDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VbParameterDefinition optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * whether the parameter is optional or not
   * @return optional
  **/
  @ApiModelProperty(example = "null", value = "whether the parameter is optional or not")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public VbParameterDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Parameter type, one of ( \"String\", \"Integer\", \"Float\", \"Boolean\" )
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Parameter type, one of ( \"String\", \"Integer\", \"Float\", \"Boolean\" )")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VbParameterDefinition valueSet(java.util.List<String> valueSet) {
    this.valueSet = valueSet;
    return this;
  }

  public VbParameterDefinition addValueSetItem(String valueSetItem) {
    this.valueSet.add(valueSetItem);
    return this;
  }

   /**
   * List of possible values for this parameter, only provided if there is a finite number of values accepted.
   * @return valueSet
  **/
  @ApiModelProperty(example = "null", value = "List of possible values for this parameter, only provided if there is a finite number of values accepted.")
  public java.util.List<String> getValueSet() {
    return valueSet;
  }

  public void setValueSet(java.util.List<String> valueSet) {
    this.valueSet = valueSet;
  }

  public VbParameterDefinition defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbParameterDefinition vbParameterDefinition = (VbParameterDefinition) o;
    return Objects.equals(this.name, vbParameterDefinition.name) &&
        Objects.equals(this.optional, vbParameterDefinition.optional) &&
        Objects.equals(this.type, vbParameterDefinition.type) &&
        Objects.equals(this.valueSet, vbParameterDefinition.valueSet) &&
        Objects.equals(this.defaultValue, vbParameterDefinition.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, type, valueSet, defaultValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbParameterDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueSet: ").append(toIndentedString(valueSet)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

