package com.spring.boot.micro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IbrahimAliEurokaServer {

	public static void main(String[] args) {
		SpringApplication.run(IbrahimAliEurokaServer.class, args);
		
		System.out.println("Ibrahim Ali Server started to register a micro-service");
	}
}
