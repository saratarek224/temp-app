package svc.temperature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import svc.temperature.model.Temperature;
import svc.temperature.repository.TemperatureRepository;

import java.util.*;

@Service
public class TemperatureService {

    @Autowired
    TemperatureRepository temperatureRepository;

    public void createTemperature(String body){
        HashMap<String, String> devices = getDevices(body);
        HashMap<Long, Long> devicesDec = convertHexTodec(devices);
        for (Map.Entry<Long, Long> set :
                devicesDec.entrySet()) {
            if(!isDeviceExist(set.getKey()).isEmpty()){
                changeStatusOfDevice(isDeviceExist(set.getKey()));
            }
            saveTemperature(set.getKey(), set.getValue());
        }
    }

    public List<Temperature> getTemperatures(){
        return temperatureRepository.findAllByIsLast(true);
    }

    public List<Temperature> getTemperatureByDeviceId(Long deviceId){
        return temperatureRepository.findByDeviceId(deviceId);
    }

    private void saveTemperature(Long device, Long temp){
        Temperature temperature= new Temperature();
        temperature.setDeviceId(device);
        temperature.setTemp(temp);
        temperature.setIsLast(true);
        temperatureRepository.save(temperature);
    }

    private void changeStatusOfDevice(List<Temperature> temperatures){
        temperatures.forEach(temperature -> {
            temperature.setIsLast(false);
        });
        temperatureRepository.saveAll(temperatures);
    }

    private List<Temperature> isDeviceExist(Long deviceId){
        return temperatureRepository.findByDeviceId(deviceId);
    }

    private HashMap<String, String> getDevices(String hex) {
        HashMap<String, String> devicesTemp = new HashMap<>();
        hex = hex.substring(2);
        while(hex.length() > 1){
            devicesTemp.put(hex.substring(0,8),hex.substring(8,10));
            hex= hex.substring(10);
        }
        return devicesTemp;
    }

    private HashMap<Long, Long> convertHexTodec(HashMap<String, String> hexs){
        HashMap<Long, Long> devices = new HashMap<>();
        for (Map.Entry<String, String> set :
                hexs.entrySet()) {
            devices.put(Long.parseLong(set.getKey(),16), Long.parseLong(set.getValue(),16));
        }
        return devices;
    }
}
