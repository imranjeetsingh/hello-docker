package com.example.Sample.controller;

import java.util.ArrayList;

public class Car {
	
	private ArrayList<String> name;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Car(ArrayList<String> name) {
		super();
		this.name = name;
	}



	public ArrayList<String> getName() {
		return name;
	}

	public void setName(ArrayList<String> name) {
		this.name = name;
	}

}
