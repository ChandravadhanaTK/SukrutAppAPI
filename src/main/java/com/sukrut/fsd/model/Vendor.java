package com.sukrut.fsd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Vendor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-14T04:59:45.171+05:30")

public class Vendor   {
  @JsonProperty("vendorId")
  private String vendorId = null;

  @JsonProperty("vendorName")
  private String vendorName = null;

  @JsonProperty("vendorStatus")
  private String vendorStatus = null;

  @JsonProperty("vendorComments")
  private String vendorComments = null;

  @JsonProperty("vendorTimestamp")
  private OffsetDateTime vendorTimestamp = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("updatedDate")
  private OffsetDateTime updatedDate = null;

  @JsonProperty("is_delete")
  private Boolean isDelete = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("updatedBy")
  private String updatedBy = null;

  @JsonProperty("login_id")
  private String loginId = null;

  public Vendor vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

  /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(value = "")


  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public Vendor vendorName(String vendorName) {
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

  public Vendor vendorStatus(String vendorStatus) {
    this.vendorStatus = vendorStatus;
    return this;
  }

  /**
   * Get vendorStatus
   * @return vendorStatus
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVendorStatus() {
    return vendorStatus;
  }

  public void setVendorStatus(String vendorStatus) {
    this.vendorStatus = vendorStatus;
  }

  public Vendor vendorComments(String vendorComments) {
    this.vendorComments = vendorComments;
    return this;
  }

  /**
   * Get vendorComments
   * @return vendorComments
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getVendorComments() {
    return vendorComments;
  }

  public void setVendorComments(String vendorComments) {
    this.vendorComments = vendorComments;
  }

  public Vendor vendorTimestamp(OffsetDateTime vendorTimestamp) {
    this.vendorTimestamp = vendorTimestamp;
    return this;
  }

  /**
   * Get vendorTimestamp
   * @return vendorTimestamp
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getVendorTimestamp() {
    return vendorTimestamp;
  }

  public void setVendorTimestamp(OffsetDateTime vendorTimestamp) {
    this.vendorTimestamp = vendorTimestamp;
  }

  public Vendor createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Vendor updatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
  }

  public Vendor isDelete(Boolean isDelete) {
    this.isDelete = isDelete;
    return this;
  }

  /**
   * Get isDelete
   * @return isDelete
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Boolean isDelete) {
    this.isDelete = isDelete;
  }

  public Vendor createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Vendor updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Vendor loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

  /**
   * Get loginId
   * @return loginId
  **/
  @ApiModelProperty(value = "")


  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vendor vendor = (Vendor) o;
    return Objects.equals(this.vendorId, vendor.vendorId) &&
        Objects.equals(this.vendorName, vendor.vendorName) &&
        Objects.equals(this.vendorStatus, vendor.vendorStatus) &&
        Objects.equals(this.vendorComments, vendor.vendorComments) &&
        Objects.equals(this.vendorTimestamp, vendor.vendorTimestamp) &&
        Objects.equals(this.createdDate, vendor.createdDate) &&
        Objects.equals(this.updatedDate, vendor.updatedDate) &&
        Objects.equals(this.isDelete, vendor.isDelete) &&
        Objects.equals(this.createdBy, vendor.createdBy) &&
        Objects.equals(this.updatedBy, vendor.updatedBy) &&
        Objects.equals(this.loginId, vendor.loginId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, vendorName, vendorStatus, vendorComments, vendorTimestamp, createdDate, updatedDate, isDelete, createdBy, updatedBy, loginId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vendor {\n");
    
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorStatus: ").append(toIndentedString(vendorStatus)).append("\n");
    sb.append("    vendorComments: ").append(toIndentedString(vendorComments)).append("\n");
    sb.append("    vendorTimestamp: ").append(toIndentedString(vendorTimestamp)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
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

