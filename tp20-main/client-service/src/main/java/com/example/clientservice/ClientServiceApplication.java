package com.example.clientservice;

import com.example.clientservice.entities.Client;
import com.example.clientservice.services.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ClientService clientService) {
        return args -> {
            clientService.addClient(new Client("radouane", 24F));
            clientService.addClient(new Client("ait said", 25F));
            clientService.addClient(new Client("radouane", 26F));
        };
    }

}
