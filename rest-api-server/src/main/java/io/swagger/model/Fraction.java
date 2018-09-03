package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fraction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-03T16:56:55.966Z")

public class Fraction   {
  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("profile")
  private String profile = null;

  @JsonProperty("month")
  private String month = null;

  public Fraction value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * The Value of the Fraction
   * @return value
  **/
  @ApiModelProperty(value = "The Value of the Fraction")


  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public Fraction profile(String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Profile ID
   * @return profile
  **/
  @ApiModelProperty(value = "Profile ID")


  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public Fraction month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Month of the year (JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)
   * @return month
  **/
  @ApiModelProperty(value = "Month of the year (JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)")


  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fraction fraction = (Fraction) o;
    return Objects.equals(this.value, fraction.value) &&
        Objects.equals(this.profile, fraction.profile) &&
        Objects.equals(this.month, fraction.month);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, profile, month);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fraction {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

