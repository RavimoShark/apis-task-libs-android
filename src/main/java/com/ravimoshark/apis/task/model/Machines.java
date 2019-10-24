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
import com.ravimoshark.apis.task.model.Pieces;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Date;
import java.io.Serializable;
/**
 * Client&#x27;s machines associated with a contract.
 */
@Schema(description = "Client's machines associated with a contract.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-24T13:51:00.180+02:00[Europe/Paris]")
public class Machines implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("id")
  private Long id = null;

  @SerializedName("refArticle")
  private String refArticle = null;

  @SerializedName("piece")
  private Pieces piece = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public Machines id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Machines refArticle(String refArticle) {
    this.refArticle = refArticle;
    return this;
  }

   /**
   * Get refArticle
   * @return refArticle
  **/
  @Schema(description = "")
  public String getRefArticle() {
    return refArticle;
  }

  public void setRefArticle(String refArticle) {
    this.refArticle = refArticle;
  }

  public Machines piece(Pieces piece) {
    this.piece = piece;
    return this;
  }

   /**
   * Get piece
   * @return piece
  **/
  @Schema(description = "")
  public Pieces getPiece() {
    return piece;
  }

  public void setPiece(Pieces piece) {
    this.piece = piece;
  }

  public Machines serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @Schema(description = "")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Machines createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Machines updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Machines deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Machines machines = (Machines) o;
    return Objects.equals(this.id, machines.id) &&
        Objects.equals(this.refArticle, machines.refArticle) &&
        Objects.equals(this.piece, machines.piece) &&
        Objects.equals(this.serialNumber, machines.serialNumber) &&
        Objects.equals(this.createdAt, machines.createdAt) &&
        Objects.equals(this.updatedAt, machines.updatedAt) &&
        Objects.equals(this.deleted, machines.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, refArticle, piece, serialNumber, createdAt, updatedAt, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Machines {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    refArticle: ").append(toIndentedString(refArticle)).append("\n");
    sb.append("    piece: ").append(toIndentedString(piece)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
