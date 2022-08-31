package org.springframework.mazh;

import org.springframework.stereotype.Component;

@Component
public class Service {

	public void sayHello(String name){
		System.out.println("Hello : " + name);
	}
}
