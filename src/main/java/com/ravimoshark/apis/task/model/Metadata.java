/*
 * Ravimoshark Task API
 * This is an API to interact with Ravimoshark task database. # Introduction This API allow to create, modify and delete task, visits, technicians and interventions. # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.task.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
/**
 * Metadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-24T13:51:00.180+02:00[Europe/Paris]")
public class Metadata implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("first")
  private Long first = null;

  @SerializedName("prev")
  private Long prev = null;

  @SerializedName("self")
  private Long self = null;

  @SerializedName("next")
  private Long next = null;

  @SerializedName("last")
  private Long last = null;

  public Metadata first(Long first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @Schema(description = "")
  public Long getFirst() {
    return first;
  }

  public void setFirst(Long first) {
    this.first = first;
  }

  public Metadata prev(Long prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @Schema(description = "")
  public Long getPrev() {
    return prev;
  }

  public void setPrev(Long prev) {
    this.prev = prev;
  }

  public Metadata self(Long self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Schema(description = "")
  public Long getSelf() {
    return self;
  }

  public void setSelf(Long self) {
    this.self = self;
  }

  public Metadata next(Long next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @Schema(description = "")
  public Long getNext() {
    return next;
  }

  public void setNext(Long next) {
    this.next = next;
  }

  public Metadata last(Long last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @Schema(description = "")
  public Long getLast() {
    return last;
  }

  public void setLast(Long last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.first, metadata.first) &&
        Objects.equals(this.prev, metadata.prev) &&
        Objects.equals(this.self, metadata.self) &&
        Objects.equals(this.next, metadata.next) &&
        Objects.equals(this.last, metadata.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, prev, self, next, last);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
