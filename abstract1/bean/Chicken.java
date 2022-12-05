package com.abstract1.bean;

public class Chicken extends Animals{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		System.out.println("Chicken has"+noOfLegs+" legs");
		
	}
	public int getnoOfLegs() {
		return noOfLegs;
	}

	public void setnoOfLegs(int noOfLegs) {
		noOfLegs=noOfLegs;
	}

}
