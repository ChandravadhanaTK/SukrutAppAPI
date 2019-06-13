package com.sukrut.fsd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VendorOnboard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-14T04:59:45.171+05:30")

public class VendorOnboard   {
  @JsonProperty("vendorName")
  private String vendorName = null;

  @JsonProperty("vendorId")
  private String vendorId = null;

  @JsonProperty("vendorAddress")
  private String vendorAddress = null;

  @JsonProperty("vendorPhoneNo")
  private BigDecimal vendorPhoneNo = null;

  @JsonProperty("licence")
  private String licence = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  public VendorOnboard vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

  /**
   * Get vendorName
   * @return vendorName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public VendorOnboard vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

  /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public VendorOnboard vendorAddress(String vendorAddress) {
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

  public VendorOnboard vendorPhoneNo(BigDecimal vendorPhoneNo) {
    this.vendorPhoneNo = vendorPhoneNo;
    return this;
  }

  /**
   * Get vendorPhoneNo
   * @return vendorPhoneNo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getVendorPhoneNo() {
    return vendorPhoneNo;
  }

  public void setVendorPhoneNo(BigDecimal vendorPhoneNo) {
    this.vendorPhoneNo = vendorPhoneNo;
  }

  public VendorOnboard licence(String licence) {
    this.licence = licence;
    return this;
  }

  /**
   * Get licence
   * @return licence
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getLicence() {
    return licence;
  }

  public void setLicence(String licence) {
    this.licence = licence;
  }

  public VendorOnboard city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public VendorOnboard country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorOnboard vendorOnboard = (VendorOnboard) o;
    return Objects.equals(this.vendorName, vendorOnboard.vendorName) &&
        Objects.equals(this.vendorId, vendorOnboard.vendorId) &&
        Objects.equals(this.vendorAddress, vendorOnboard.vendorAddress) &&
        Objects.equals(this.vendorPhoneNo, vendorOnboard.vendorPhoneNo) &&
        Objects.equals(this.licence, vendorOnboard.licence) &&
        Objects.equals(this.city, vendorOnboard.city) &&
        Objects.equals(this.country, vendorOnboard.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorName, vendorId, vendorAddress, vendorPhoneNo, licence, city, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorOnboard {\n");
    
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorAddress: ").append(toIndentedString(vendorAddress)).append("\n");
    sb.append("    vendorPhoneNo: ").append(toIndentedString(vendorPhoneNo)).append("\n");
    sb.append("    licence: ").append(toIndentedString(licence)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

