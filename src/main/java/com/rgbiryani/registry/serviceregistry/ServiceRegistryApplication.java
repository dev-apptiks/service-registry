package com.rgbiryani.registry.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@EnableFeignClients
@Slf4j
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		System.out.println("<<<<<< Inside SB main method >>>>>>");
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
