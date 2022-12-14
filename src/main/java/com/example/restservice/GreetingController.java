/*
 * HTTP requests are handled by a controller. 
 * These components are identified by the @RestController annotation
 * returns new instance of greeting class
 * 
 * The Greeting object must be converted to JSON. Thanks to Spring’s HTTP message converter support,
 * you need not do this conversion manually. Because Jackson 2 is on the classpath, Spring’s 
 * MappingJackson2HttpMessageConverter is automatically chosen to convert the Greeting instance to JSON.
 */

package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @RestController marks the class as a controller 
 *  where every method returns a domain object instead of a view. 
 *  It is shorthand for including both @Controller and @ResponseBody
 */

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	
	/*
	 * The @GetMapping annotation ensures that HTTP GET requests to /greeting 
	 * are mapped to the greeting() method.
	 * 
	 * @RequestParam binds the value of the query string parameter name 
	 * into the name parameter of the greeting() method. 
	 * If the name parameter is absent in the request, the defaultValue of World is used
	 */
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}