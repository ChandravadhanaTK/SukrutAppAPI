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
 * Feedback
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-14T04:59:45.171+05:30")

public class Feedback   {
  @JsonProperty("commentId")
  private BigDecimal commentId = null;

  @JsonProperty("commentDescription")
  private String commentDescription = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  public Feedback commentId(BigDecimal commentId) {
    this.commentId = commentId;
    return this;
  }

  /**
   * Get commentId
   * @return commentId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getCommentId() {
    return commentId;
  }

  public void setCommentId(BigDecimal commentId) {
    this.commentId = commentId;
  }

  public Feedback commentDescription(String commentDescription) {
    this.commentDescription = commentDescription;
    return this;
  }

  /**
   * Get commentDescription
   * @return commentDescription
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCommentDescription() {
    return commentDescription;
  }

  public void setCommentDescription(String commentDescription) {
    this.commentDescription = commentDescription;
  }

  public Feedback createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;
    return Objects.equals(this.commentId, feedback.commentId) &&
        Objects.equals(this.commentDescription, feedback.commentDescription) &&
        Objects.equals(this.createdBy, feedback.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, commentDescription, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commentDescription: ").append(toIndentedString(commentDescription)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

