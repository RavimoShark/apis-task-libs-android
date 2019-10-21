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
import com.ravimoshark.apis.task.model.Clients;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
/**
 * Address information.
 */
@Schema(description = "Address information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-21T11:08:06.838+02:00[Europe/Paris]")
public class Addresses implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("id")
  private Long id = null;

  @SerializedName("refClient")
  private String refClient = null;

  @SerializedName("client")
  private Clients client = null;

  @SerializedName("addressType")
  private String addressType = null;

  @SerializedName("delivery")
  private String delivery = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("complement")
  private String complement = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("latitude")
  private Float latitude = null;

  @SerializedName("longitude")
  private Float longitude = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("streetName")
  private String streetName = null;

  @SerializedName("streetNumber")
  private Long streetNumber = null;

  @SerializedName("telephone")
  private String telephone = null;

  public Addresses id(Long id) {
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

  public Addresses refClient(String refClient) {
    this.refClient = refClient;
    return this;
  }

   /**
   * Get refClient
   * @return refClient
  **/
  @Schema(description = "")
  public String getRefClient() {
    return refClient;
  }

  public void setRefClient(String refClient) {
    this.refClient = refClient;
  }

  public Addresses client(Clients client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @Schema(description = "")
  public Clients getClient() {
    return client;
  }

  public void setClient(Clients client) {
    this.client = client;
  }

  public Addresses addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @Schema(description = "")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public Addresses delivery(String delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @Schema(description = "")
  public String getDelivery() {
    return delivery;
  }

  public void setDelivery(String delivery) {
    this.delivery = delivery;
  }

  public Addresses city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Addresses complement(String complement) {
    this.complement = complement;
    return this;
  }

   /**
   * Get complement
   * @return complement
  **/
  @Schema(description = "")
  public String getComplement() {
    return complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }

  public Addresses country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Addresses latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @Schema(description = "")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public Addresses longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @Schema(description = "")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public Addresses name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Addresses postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @Schema(description = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Addresses streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @Schema(description = "")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Addresses streetNumber(Long streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  @Schema(description = "")
  public Long getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(Long streetNumber) {
    this.streetNumber = streetNumber;
  }

  public Addresses telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @Schema(description = "")
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Addresses addresses = (Addresses) o;
    return Objects.equals(this.id, addresses.id) &&
        Objects.equals(this.refClient, addresses.refClient) &&
        Objects.equals(this.client, addresses.client) &&
        Objects.equals(this.addressType, addresses.addressType) &&
        Objects.equals(this.delivery, addresses.delivery) &&
        Objects.equals(this.city, addresses.city) &&
        Objects.equals(this.complement, addresses.complement) &&
        Objects.equals(this.country, addresses.country) &&
        Objects.equals(this.latitude, addresses.latitude) &&
        Objects.equals(this.longitude, addresses.longitude) &&
        Objects.equals(this.name, addresses.name) &&
        Objects.equals(this.postalCode, addresses.postalCode) &&
        Objects.equals(this.streetName, addresses.streetName) &&
        Objects.equals(this.streetNumber, addresses.streetNumber) &&
        Objects.equals(this.telephone, addresses.telephone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, refClient, client, addressType, delivery, city, complement, country, latitude, longitude, name, postalCode, streetName, streetNumber, telephone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Addresses {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    refClient: ").append(toIndentedString(refClient)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    complement: ").append(toIndentedString(complement)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
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