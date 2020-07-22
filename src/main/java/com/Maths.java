package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Random;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class Maths {

	@GetMapping("/int/{centi}")
	public String getheight(@PathVariable int centi) 
    { 
        int inch = 10 * centi; 
        return inch+" is your height in inches"; 
    } 
         
	
	@GetMapping("/weight/{number}")
	public String getweight(@PathVariable int number) 
    { 
        int weight = 5 * number; 
        return weight+" is your weight in Kgs"; 
    }
	
	
	@GetMapping("/bmi/{num}")
	public String getbmi(@PathVariable int num) 
    { 
        int bmi = 3 * num; 
        return bmi+" is your bmi"; 
    }
	
	
	@GetMapping("/waist/{wt}")
	public String getwaist(@PathVariable int wt) 
    { 
        int waist = 1 * wt; 
        return waist+" is your waist size"; 
    }
	
} 	