package svc.temperature.api.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import svc.temperature.model.Temperature;
import temperature.api.dto.TemperatureDTO;
import temperature.api.dto.TemperatureItemDTO;
import temperature.api.dto.TemperatureItems;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class TemperatureMapperImpl implements TemperatureMapper {

    @Override
    public TemperatureDTO toTemperatureDto(Temperature item) {
        if ( item == null ) {
            return null;
        }

        TemperatureDTO temperatureDTO = new TemperatureDTO();

        temperatureDTO.setTemp( item.getTemp() );
        temperatureDTO.setDevice( item.getDeviceId() );
        temperatureDTO.setId( item.getId() );

        return temperatureDTO;
    }

    @Override
    public TemperatureItems toTemperatureItemDto(Temperature item) {
        if ( item == null ) {
            return null;
        }

        TemperatureItems temperatureItems = new TemperatureItems();

        temperatureItems.setCreatedDate( getCreatedDate( item.getCreatedDate() ) );
        temperatureItems.setTemp( item.getTemp() );

        return temperatureItems;
    }

    @Override
    public List<TemperatureDTO> toDTOList(List<Temperature> settlementList) {
        if ( settlementList == null ) {
            return null;
        }

        List<TemperatureDTO> list = new ArrayList<TemperatureDTO>( settlementList.size() );
        for ( Temperature temperature : settlementList ) {
            list.add( toTemperatureDto( temperature ) );
        }

        return list;
    }

    @Override
    public List<TemperatureItems> toDTOItemList(List<Temperature> settlementList) {
        if ( settlementList == null ) {
            return null;
        }

        List<TemperatureItems> list = new ArrayList<TemperatureItems>( settlementList.size() );
        for ( Temperature temperature : settlementList ) {
            list.add( toTemperatureItemDto( temperature ) );
        }

        return list;
    }

    @Override
    public TemperatureItemDTO toTemperatureItem(Temperature item, List<Temperature> temps) {
        if ( item == null && temps == null ) {
            return null;
        }

        TemperatureItemDTO temperatureItemDTO = new TemperatureItemDTO();

        if ( item != null ) {
            temperatureItemDTO.setDevice( item.getDeviceId() );
        }

        setTemps( temperatureItemDTO, temps );

        return temperatureItemDTO;
    }
}
