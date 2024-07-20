package com.microservices.eurekaserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eureaserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(eureaserverApplication.class,args);
    }
}
