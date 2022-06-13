package svc.temperature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TemperatureApp {

    public static void main(String[] args) {
        SpringApplication.run(TemperatureApp.class, args);
    }
}
