package com.example.servicecar;

import com.example.servicecar.entities.Car;
import com.example.servicecar.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCarApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5000);
        requestFactory.setReadTimeout(5000);

        restTemplate.setRequestFactory(requestFactory);
        return restTemplate;
    }

    @Bean
    public CommandLineRunner commandLineRunner(CarRepository carRepository) {
        return args -> {
            carRepository.save(new Car("BMW", "BMW-2020","MAT-2025",1L));
            carRepository.save(new Car("DACIA", "DUSTER","MAT-2024",2L));
        };
    }

}
