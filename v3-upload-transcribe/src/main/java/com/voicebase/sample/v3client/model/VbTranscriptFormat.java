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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbTranscriptFormat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbTranscriptFormat {
  @JsonProperty("format")
  private String format = null;

  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("contentEncoding")
  private String contentEncoding = null;

  @JsonProperty("charset")
  private String charset = null;

  @JsonProperty("data")
  private String data = null;

  public VbTranscriptFormat format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public VbTranscriptFormat contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public VbTranscriptFormat contentEncoding(String contentEncoding) {
    this.contentEncoding = contentEncoding;
    return this;
  }

   /**
   * Get contentEncoding
   * @return contentEncoding
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentEncoding() {
    return contentEncoding;
  }

  public void setContentEncoding(String contentEncoding) {
    this.contentEncoding = contentEncoding;
  }

  public VbTranscriptFormat charset(String charset) {
    this.charset = charset;
    return this;
  }

   /**
   * Get charset
   * @return charset
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCharset() {
    return charset;
  }

  public void setCharset(String charset) {
    this.charset = charset;
  }

  public VbTranscriptFormat data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbTranscriptFormat vbTranscriptFormat = (VbTranscriptFormat) o;
    return Objects.equals(this.format, vbTranscriptFormat.format) &&
        Objects.equals(this.contentType, vbTranscriptFormat.contentType) &&
        Objects.equals(this.contentEncoding, vbTranscriptFormat.contentEncoding) &&
        Objects.equals(this.charset, vbTranscriptFormat.charset) &&
        Objects.equals(this.data, vbTranscriptFormat.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, contentType, contentEncoding, charset, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbTranscriptFormat {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentEncoding: ").append(toIndentedString(contentEncoding)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
