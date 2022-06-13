package temperature.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import temperature.api.dto.TemperatureItemDTOAllOf;
import temperature.api.dto.TemperatureItems;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TemperatureItemDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-11T23:22:24.261440336+02:00[Africa/Cairo]")
public class TemperatureItemDTO   {
  @JsonProperty("device")
  private Long device;

  @JsonProperty("temp")
  @Valid
  private List<TemperatureItems> temp = null;

  public TemperatureItemDTO device(Long device) {
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

  public TemperatureItemDTO temp(List<TemperatureItems> temp) {
    this.temp = temp;
    return this;
  }

  public TemperatureItemDTO addTempItem(TemperatureItems tempItem) {
    if (this.temp == null) {
      this.temp = new ArrayList<>();
    }
    this.temp.add(tempItem);
    return this;
  }

  /**
   * Get temp
   * @return temp
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TemperatureItems> getTemp() {
    return temp;
  }

  public void setTemp(List<TemperatureItems> temp) {
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
    TemperatureItemDTO temperatureItemDTO = (TemperatureItemDTO) o;
    return Objects.equals(this.device, temperatureItemDTO.device) &&
        Objects.equals(this.temp, temperatureItemDTO.temp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, temp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemperatureItemDTO {\n");
    
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

