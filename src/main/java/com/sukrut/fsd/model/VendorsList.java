package com.sukrut.fsd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VendorsList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-14T04:59:45.171+05:30")

public class VendorsList   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userMobileNumber")
  private Double userMobileNumber = null;

  @JsonProperty("userLocation")
  private String userLocation = null;

  @JsonProperty("vendorStoreName")
  private String vendorStoreName = null;

  @JsonProperty("vendorLocation")
  private String vendorLocation = null;

  @JsonProperty("vendorAddress")
  private String vendorAddress = null;

  @JsonProperty("vendorLocationLatitude")
  private String vendorLocationLatitude = null;

  @JsonProperty("vendorLocationLongitude")
  private String vendorLocationLongitude = null;

  public VendorsList userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public VendorsList userMobileNumber(Double userMobileNumber) {
    this.userMobileNumber = userMobileNumber;
    return this;
  }

  /**
   * Get userMobileNumber
   * @return userMobileNumber
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getUserMobileNumber() {
    return userMobileNumber;
  }

  public void setUserMobileNumber(Double userMobileNumber) {
    this.userMobileNumber = userMobileNumber;
  }

  public VendorsList userLocation(String userLocation) {
    this.userLocation = userLocation;
    return this;
  }

  /**
   * Get userLocation
   * @return userLocation
  **/
  @ApiModelProperty(value = "")


  public String getUserLocation() {
    return userLocation;
  }

  public void setUserLocation(String userLocation) {
    this.userLocation = userLocation;
  }

  public VendorsList vendorStoreName(String vendorStoreName) {
    this.vendorStoreName = vendorStoreName;
    return this;
  }

  /**
   * Get vendorStoreName
   * @return vendorStoreName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVendorStoreName() {
    return vendorStoreName;
  }

  public void setVendorStoreName(String vendorStoreName) {
    this.vendorStoreName = vendorStoreName;
  }

  public VendorsList vendorLocation(String vendorLocation) {
    this.vendorLocation = vendorLocation;
    return this;
  }

  /**
   * Get vendorLocation
   * @return vendorLocation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVendorLocation() {
    return vendorLocation;
  }

  public void setVendorLocation(String vendorLocation) {
    this.vendorLocation = vendorLocation;
  }

  public VendorsList vendorAddress(String vendorAddress) {
    this.vendorAddress = vendorAddress;
    return this;
  }

  /**
   * Get vendorAddress
   * @return vendorAddress
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVendorAddress() {
    return vendorAddress;
  }

  public void setVendorAddress(String vendorAddress) {
    this.vendorAddress = vendorAddress;
  }

  public VendorsList vendorLocationLatitude(String vendorLocationLatitude) {
    this.vendorLocationLatitude = vendorLocationLatitude;
    return this;
  }

  /**
   * Get vendorLocationLatitude
   * @return vendorLocationLatitude
  **/
  @ApiModelProperty(value = "")


  public String getVendorLocationLatitude() {
    return vendorLocationLatitude;
  }

  public void setVendorLocationLatitude(String vendorLocationLatitude) {
    this.vendorLocationLatitude = vendorLocationLatitude;
  }

  public VendorsList vendorLocationLongitude(String vendorLocationLongitude) {
    this.vendorLocationLongitude = vendorLocationLongitude;
    return this;
  }

  /**
   * Get vendorLocationLongitude
   * @return vendorLocationLongitude
  **/
  @ApiModelProperty(value = "")


  public String getVendorLocationLongitude() {
    return vendorLocationLongitude;
  }

  public void setVendorLocationLongitude(String vendorLocationLongitude) {
    this.vendorLocationLongitude = vendorLocationLongitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorsList vendorsList = (VendorsList) o;
    return Objects.equals(this.userId, vendorsList.userId) &&
        Objects.equals(this.userMobileNumber, vendorsList.userMobileNumber) &&
        Objects.equals(this.userLocation, vendorsList.userLocation) &&
        Objects.equals(this.vendorStoreName, vendorsList.vendorStoreName) &&
        Objects.equals(this.vendorLocation, vendorsList.vendorLocation) &&
        Objects.equals(this.vendorAddress, vendorsList.vendorAddress) &&
        Objects.equals(this.vendorLocationLatitude, vendorsList.vendorLocationLatitude) &&
        Objects.equals(this.vendorLocationLongitude, vendorsList.vendorLocationLongitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userMobileNumber, userLocation, vendorStoreName, vendorLocation, vendorAddress, vendorLocationLatitude, vendorLocationLongitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorsList {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userMobileNumber: ").append(toIndentedString(userMobileNumber)).append("\n");
    sb.append("    userLocation: ").append(toIndentedString(userLocation)).append("\n");
    sb.append("    vendorStoreName: ").append(toIndentedString(vendorStoreName)).append("\n");
    sb.append("    vendorLocation: ").append(toIndentedString(vendorLocation)).append("\n");
    sb.append("    vendorAddress: ").append(toIndentedString(vendorAddress)).append("\n");
    sb.append("    vendorLocationLatitude: ").append(toIndentedString(vendorLocationLatitude)).append("\n");
    sb.append("    vendorLocationLongitude: ").append(toIndentedString(vendorLocationLongitude)).append("\n");
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

