package com.sukrut.fsd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Offers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-14T04:59:45.171+05:30")

public class Offers   {
  @JsonProperty("offerId")
  private String offerId = null;

  @JsonProperty("offerDesc")
  private String offerDesc = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("offerPercentage")
  private BigDecimal offerPercentage = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

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

  public Offers offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public Offers offerDesc(String offerDesc) {
    this.offerDesc = offerDesc;
    return this;
  }

  /**
   * Get offerDesc
   * @return offerDesc
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOfferDesc() {
    return offerDesc;
  }

  public void setOfferDesc(String offerDesc) {
    this.offerDesc = offerDesc;
  }

  public Offers productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Offers offerPercentage(BigDecimal offerPercentage) {
    this.offerPercentage = offerPercentage;
    return this;
  }

  /**
   * Get offerPercentage
   * @return offerPercentage
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getOfferPercentage() {
    return offerPercentage;
  }

  public void setOfferPercentage(BigDecimal offerPercentage) {
    this.offerPercentage = offerPercentage;
  }

  public Offers validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public Offers validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * Get validTo
   * @return validTo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public Offers createdDate(OffsetDateTime createdDate) {
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

  public Offers updatedDate(OffsetDateTime updatedDate) {
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

  public Offers deletionMark(Boolean deletionMark) {
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

  public Offers createdBy(String createdBy) {
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

  public Offers updatedBy(String updatedBy) {
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
    Offers offers = (Offers) o;
    return Objects.equals(this.offerId, offers.offerId) &&
        Objects.equals(this.offerDesc, offers.offerDesc) &&
        Objects.equals(this.productName, offers.productName) &&
        Objects.equals(this.offerPercentage, offers.offerPercentage) &&
        Objects.equals(this.validFrom, offers.validFrom) &&
        Objects.equals(this.validTo, offers.validTo) &&
        Objects.equals(this.createdDate, offers.createdDate) &&
        Objects.equals(this.updatedDate, offers.updatedDate) &&
        Objects.equals(this.deletionMark, offers.deletionMark) &&
        Objects.equals(this.createdBy, offers.createdBy) &&
        Objects.equals(this.updatedBy, offers.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, offerDesc, productName, offerPercentage, validFrom, validTo, createdDate, updatedDate, deletionMark, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offers {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerDesc: ").append(toIndentedString(offerDesc)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    offerPercentage: ").append(toIndentedString(offerPercentage)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

