package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.handler.annotation.SendTo;


@SpringBootTest
class StompTestApplicationTests {

	@Test
	public void contextLoads() {
	   greeting("aaaa");
	}

    @SendTo("/topic/greetings")
    public Greeting greeting(String name) {        
        return new Greeting("Hello TDD, " + name + "!");
    }
	 
}
