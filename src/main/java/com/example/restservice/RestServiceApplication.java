package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 

@SpringBootApplication is a convenience annotation that adds all of the following:
    @Configuration: Tags the class as a source of bean definitions for the application context.
    @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings
    	e.g. spring-webmvc -> DispatcherServlet
    @ComponentScan: Tells Spring to look for other components, configurations, 
    	and services in the com/example package, letting it find the controllers.
 */

@SpringBootApplication
public class RestServiceApplication {

/*
 * 	uses Spring Boot’s SpringApplication.run() method to launch an application. 
 * Did you notice that there was not a single line of XML? There is no web.xml file, either. 
 * This web application is 100% pure Java and you did not have to deal with configuring any plumbing 
 * or infrastructure.
 */
	
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
