package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.Maths;

@ExtendWith(SpringExtension.class)
@SpringBootTest

public class MathsTest {

	Maths ms = new Maths();
	
	@Test
	public void getheight() {
		Assertions.assertEquals(ms.getheight(4), "40 is your height in inches");		
	}
	
	@Test
	public void getweight() {
		Assertions.assertEquals(ms.getweight(10), "50 is your weight in Kgs");		
	}

	
	@Test
	public void getbmi() {
		Assertions.assertEquals(ms.getbmi(10), "30 is your bmi");		
	}

	@Test
	public void getwaist() {
		Assertions.assertEquals(ms.getwaist(10), "10 is your waist size");		
	}
	
	
}