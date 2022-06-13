package svc.temperature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import svc.temperature.model.Temperature;

import java.util.List;
import java.util.Optional;

public interface TemperatureRepository extends JpaRepository<Temperature, Long> {

    List<Temperature> findByDeviceId(Long deviceId);

    List<Temperature> findAllByIsLast(Boolean isLast);

}
