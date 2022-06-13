package temperature.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TemperatureDTOAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-11T23:22:24.261440336+02:00[Africa/Cairo]")
public class TemperatureDTOAllOf   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("device")
  private Long device;

  @JsonProperty("temp")
  private Long temp;

  public TemperatureDTOAllOf id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TemperatureDTOAllOf device(Long device) {
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
  */
  @ApiModelProperty(value = "")


  public Long getDevice() {
    return device;
  }

  public void setDevice(Long device) {
    this.device = device;
  }

  public TemperatureDTOAllOf temp(Long temp) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemperatureDTOAllOf temperatureDTOAllOf = (TemperatureDTOAllOf) o;
    return Objects.equals(this.id, temperatureDTOAllOf.id) &&
        Objects.equals(this.device, temperatureDTOAllOf.device) &&
        Objects.equals(this.temp, temperatureDTOAllOf.temp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, device, temp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemperatureDTOAllOf {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
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

