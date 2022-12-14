/*
 * To model the greeting representation, create a resource representation class. 
 * To do so, provide a plain old Java object with fields, constructors, 
 * and accessors for the id and content data 
 */
package com.example.restservice;

public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
