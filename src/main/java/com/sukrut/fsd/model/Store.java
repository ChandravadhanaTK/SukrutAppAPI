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
 * Store
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-14T04:59:45.171+05:30")

public class Store   {
  @JsonProperty("storeId")
  private String storeId = null;

  @JsonProperty("storeSeq")
  private String storeSeq = null;

  @JsonProperty("storeName")
  private String storeName = null;

  @JsonProperty("managerName")
  private String managerName = null;

  @JsonProperty("managerContact")
  private String managerContact = null;

  @JsonProperty("storeLandline")
  private String storeLandline = null;

  @JsonProperty("storeArea")
  private String storeArea = null;

  @JsonProperty("storePincode")
  private String storePincode = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("geoLocation")
  private String geoLocation = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("updatedDate")
  private OffsetDateTime updatedDate = null;

  @JsonProperty("deletionMark")
  private Boolean deletionMark = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("updatedBy")
  private String updatedBy = null;

  public Store storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public Store storeSeq(String storeSeq) {
    this.storeSeq = storeSeq;
    return this;
  }

  /**
   * Get storeSeq
   * @return storeSeq
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStoreSeq() {
    return storeSeq;
  }

  public void setStoreSeq(String storeSeq) {
    this.storeSeq = storeSeq;
  }

  public Store storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

  /**
   * Get storeName
   * @return storeName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public Store managerName(String managerName) {
    this.managerName = managerName;
    return this;
  }

  /**
   * Get managerName
   * @return managerName
  **/
  @ApiModelProperty(value = "")


  public String getManagerName() {
    return managerName;
  }

  public void setManagerName(String managerName) {
    this.managerName = managerName;
  }

  public Store managerContact(String managerContact) {
    this.managerContact = managerContact;
    return this;
  }

  /**
   * Get managerContact
   * @return managerContact
  **/
  @ApiModelProperty(value = "")


  public String getManagerContact() {
    return managerContact;
  }

  public void setManagerContact(String managerContact) {
    this.managerContact = managerContact;
  }

  public Store storeLandline(String storeLandline) {
    this.storeLandline = storeLandline;
    return this;
  }

  /**
   * Get storeLandline
   * @return storeLandline
  **/
  @ApiModelProperty(value = "")


  public String getStoreLandline() {
    return storeLandline;
  }

  public void setStoreLandline(String storeLandline) {
    this.storeLandline = storeLandline;
  }

  public Store storeArea(String storeArea) {
    this.storeArea = storeArea;
    return this;
  }

  /**
   * Get storeArea
   * @return storeArea
  **/
  @ApiModelProperty(value = "")


  public String getStoreArea() {
    return storeArea;
  }

  public void setStoreArea(String storeArea) {
    this.storeArea = storeArea;
  }

  public Store storePincode(String storePincode) {
    this.storePincode = storePincode;
    return this;
  }

  /**
   * Get storePincode
   * @return storePincode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStorePincode() {
    return storePincode;
  }

  public void setStorePincode(String storePincode) {
    this.storePincode = storePincode;
  }

  public Store address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Store geoLocation(String geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Get geoLocation
   * @return geoLocation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(String geoLocation) {
    this.geoLocation = geoLocation;
  }

  public Store createdDate(OffsetDateTime createdDate) {
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

  public Store updatedDate(OffsetDateTime updatedDate) {
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

  public Store deletionMark(Boolean deletionMark) {
    this.deletionMark = deletionMark;
    return this;
  }

  /**
   * Get deletionMark
   * @return deletionMark
  **/
  @ApiModelProperty(value = "")


  public Boolean isDeletionMark() {
    return deletionMark;
  }

  public void setDeletionMark(Boolean deletionMark) {
    this.deletionMark = deletionMark;
  }

  public Store createdBy(String createdBy) {
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

  public Store updatedBy(String updatedBy) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store store = (Store) o;
    return Objects.equals(this.storeId, store.storeId) &&
        Objects.equals(this.storeSeq, store.storeSeq) &&
        Objects.equals(this.storeName, store.storeName) &&
        Objects.equals(this.managerName, store.managerName) &&
        Objects.equals(this.managerContact, store.managerContact) &&
        Objects.equals(this.storeLandline, store.storeLandline) &&
        Objects.equals(this.storeArea, store.storeArea) &&
        Objects.equals(this.storePincode, store.storePincode) &&
        Objects.equals(this.address, store.address) &&
        Objects.equals(this.geoLocation, store.geoLocation) &&
        Objects.equals(this.createdDate, store.createdDate) &&
        Objects.equals(this.updatedDate, store.updatedDate) &&
        Objects.equals(this.deletionMark, store.deletionMark) &&
        Objects.equals(this.createdBy, store.createdBy) &&
        Objects.equals(this.updatedBy, store.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, storeSeq, storeName, managerName, managerContact, storeLandline, storeArea, storePincode, address, geoLocation, createdDate, updatedDate, deletionMark, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeSeq: ").append(toIndentedString(storeSeq)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    managerName: ").append(toIndentedString(managerName)).append("\n");
    sb.append("    managerContact: ").append(toIndentedString(managerContact)).append("\n");
    sb.append("    storeLandline: ").append(toIndentedString(storeLandline)).append("\n");
    sb.append("    storeArea: ").append(toIndentedString(storeArea)).append("\n");
    sb.append("    storePincode: ").append(toIndentedString(storePincode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    deletionMark: ").append(toIndentedString(deletionMark)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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

