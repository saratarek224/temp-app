package svc.temperature.api.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import svc.temperature.api.mapper.TemperatureMapper;
import svc.temperature.model.Temperature;
import svc.temperature.service.TemperatureService;
import temperature.api.ApiUtil;
import temperature.api.TemperatureApi;
import temperature.api.dto.SuccessResponse;
import temperature.api.dto.TemperatureDTO;
import temperature.api.dto.TemperatureItemDTO;
import temperature.api.dto.TemperatureItems;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TemperatureController implements TemperatureApi {

    @Autowired
    TemperatureService temperatureService;

    @Autowired
    TemperatureMapper temperatureMapper;

    @Override
    public ResponseEntity<SuccessResponse> createTemperature(String body) {
        temperatureService.createTemperature(body);
        return ResponseEntity.ok(new SuccessResponse());
    }

    @Override
    public ResponseEntity<List<TemperatureDTO>> getTemperature() {
        List<Temperature> temperatures = temperatureService.getTemperatures();
        return ResponseEntity.ok(temperatureMapper.toDTOList(temperatures));
    }

    @Override
    public ResponseEntity<TemperatureItemDTO> getTemperatureItem(Long id) {
        List<Temperature> temperatures = temperatureService.getTemperatureByDeviceId(id);
        return ResponseEntity.ok(temperatureMapper.toTemperatureItem(temperatures.get(0), temperatures));
    }

}
