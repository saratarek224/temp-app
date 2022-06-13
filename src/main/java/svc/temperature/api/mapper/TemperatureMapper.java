package svc.temperature.api.mapper;

import org.mapstruct.*;
import svc.temperature.model.Temperature;
import temperature.api.dto.TemperatureDTO;
import temperature.api.dto.TemperatureItemDTO;
import temperature.api.dto.TemperatureItems;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Objects;

@Mapper
public interface TemperatureMapper {

    @Mapping(source = "temp", target = "temp")
    @Mapping(source = "deviceId", target = "device")
    TemperatureDTO toTemperatureDto(Temperature item);

    @Mapping(source = "createdDate", target = "createdDate", qualifiedByName = "getCreatedDate")
    TemperatureItems toTemperatureItemDto(Temperature item);

    List<TemperatureDTO> toDTOList(List<Temperature> settlementList);

    List<TemperatureItems> toDTOItemList(List<Temperature> settlementList);

    @Mapping(source = "item.deviceId", target = "device")
    @Mapping(target = "temp", ignore = true)
    TemperatureItemDTO toTemperatureItem(Temperature item, List<Temperature> temps);

    @AfterMapping
    default void setTemps(@MappingTarget TemperatureItemDTO temperatureItemDTO, List<Temperature> temps){
        temperatureItemDTO.setTemp(toDTOItemList(temps));
    }

    @Named(value = "getCreatedDate")
    default LocalDateTime getCreatedDate(Timestamp value) {
        if (Objects.isNull(value)) {
            return null;
        }
        return value.toInstant().atZone(ZoneId.of("UTC+02:00")).toLocalDateTime();
    }

}
