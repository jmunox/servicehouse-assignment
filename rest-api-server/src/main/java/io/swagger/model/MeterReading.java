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
 * MeterReading
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-03T16:56:55.966Z")

public class MeterReading   {
  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("meterID")
  private String meterID = null;

  @JsonProperty("profile")
  private String profile = null;

  @JsonProperty("month")
  private String month = null;

  public MeterReading value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * The MeterReading
   * @return value
  **/
  @ApiModelProperty(value = "The MeterReading")


  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public MeterReading meterID(String meterID) {
    this.meterID = meterID;
    return this;
  }

  /**
   * The Unique Id of the Meter
   * @return meterID
  **/
  @ApiModelProperty(value = "The Unique Id of the Meter")


  public String getMeterID() {
    return meterID;
  }

  public void setMeterID(String meterID) {
    this.meterID = meterID;
  }

  public MeterReading profile(String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * The profile ID
   * @return profile
  **/
  @ApiModelProperty(value = "The profile ID")


  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public MeterReading month(String month) {
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
    MeterReading meterReading = (MeterReading) o;
    return Objects.equals(this.value, meterReading.value) &&
        Objects.equals(this.meterID, meterReading.meterID) &&
        Objects.equals(this.profile, meterReading.profile) &&
        Objects.equals(this.month, meterReading.month);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, meterID, profile, month);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeterReading {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    meterID: ").append(toIndentedString(meterID)).append("\n");
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

