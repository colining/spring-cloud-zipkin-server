package com.example.springcloudzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;


@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class SpringCloudZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinServerApplication.class, args);
    }
}
