package temperature.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TemperatureItemsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-11T23:22:24.261440336+02:00[Africa/Cairo]")
public class TemperatureItemsAllOf   {
  @JsonProperty("temp")
  private Long temp;

  @JsonProperty("createdDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime createdDate;

  public TemperatureItemsAllOf temp(Long temp) {
    this.temp = temp;
    return this;
  }

  /**
   * Get temp
   * @return temp
  */
  @ApiModelProperty(value = "")


  public Long getTemp() {
    return temp;
  }

  public void setTemp(Long temp) {
    this.temp = temp;
  }

  public TemperatureItemsAllOf createdDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemperatureItemsAllOf temperatureItemsAllOf = (TemperatureItemsAllOf) o;
    return Objects.equals(this.temp, temperatureItemsAllOf.temp) &&
        Objects.equals(this.createdDate, temperatureItemsAllOf.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temp, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemperatureItemsAllOf {\n");
    
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

