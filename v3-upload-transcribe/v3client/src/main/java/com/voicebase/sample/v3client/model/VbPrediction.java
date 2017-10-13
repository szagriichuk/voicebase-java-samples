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
import com.voicebase.sample.v3client.model.VbClassifier;
import com.voicebase.sample.v3client.model.VbDetector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbPrediction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbPrediction {
  @JsonProperty("classifiers")
  private java.util.List<VbClassifier> classifiers = new java.util.ArrayList<VbClassifier>();

  @JsonProperty("detectors")
  private java.util.List<VbDetector> detectors = new java.util.ArrayList<VbDetector>();

  public VbPrediction classifiers(java.util.List<VbClassifier> classifiers) {
    this.classifiers = classifiers;
    return this;
  }

  public VbPrediction addClassifiersItem(VbClassifier classifiersItem) {
    this.classifiers.add(classifiersItem);
    return this;
  }

   /**
   * Get classifiers
   * @return classifiers
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<VbClassifier> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(java.util.List<VbClassifier> classifiers) {
    this.classifiers = classifiers;
  }

  public VbPrediction detectors(java.util.List<VbDetector> detectors) {
    this.detectors = detectors;
    return this;
  }

  public VbPrediction addDetectorsItem(VbDetector detectorsItem) {
    this.detectors.add(detectorsItem);
    return this;
  }

   /**
   * Get detectors
   * @return detectors
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<VbDetector> getDetectors() {
    return detectors;
  }

  public void setDetectors(java.util.List<VbDetector> detectors) {
    this.detectors = detectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbPrediction vbPrediction = (VbPrediction) o;
    return Objects.equals(this.classifiers, vbPrediction.classifiers) &&
        Objects.equals(this.detectors, vbPrediction.detectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifiers, detectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbPrediction {\n");
    
    sb.append("    classifiers: ").append(toIndentedString(classifiers)).append("\n");
    sb.append("    detectors: ").append(toIndentedString(detectors)).append("\n");
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

