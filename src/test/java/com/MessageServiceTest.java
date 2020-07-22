package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest

public class MessageServiceTest {

	MessageService ms = new MessageService();
	
	@Test
	public void testMessage() {
		System.out.println("Hi, this is nilesh");
		Assertions.assertEquals(ms.sayHello(), "Hi, this is nilesh");
	}
	
	@Test
	public void testMessage1() {
		System.out.println("Test Successful!");
		Assertions.assertEquals(ms.TestMessage1(), "Test Successful!");
		
	}
	
}