package com.epam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfigApplication.class, args);
		
		
		//if not set in configserver.yml
		/*		
 		*	new SpringApplicationBuilder(ServiceConfigApplication.class)
		*	.properties("spring.config.name=configserver").run(args);
		*/
	}
}
