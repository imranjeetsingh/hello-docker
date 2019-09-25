package com.example.Sample.controller;


	
	import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/test")
	public class CarController {
		
		@RequestMapping(value="/hello",method=RequestMethod.GET)
	    Car home() {
	         
	        //Car test=new Car();
	        
	        ArrayList<String> tmp=new ArrayList<String>();
	        tmp.add("car1");
	        tmp.add("car23");
	        //test.setName(tmp);
	        
	        Car test2=new Car(tmp);
	        return test2;
	    }
		
		

	}


