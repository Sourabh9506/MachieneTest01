package com.abstract1.bean;

public class Dog extends Animals{
	
	void Sayssomething(){
		System.out.println("Dogs Say Bow Wow");
	}

	public void walk(){
		System.out.println("Dog with "+ noOfLegs +"no of legs");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	public int getnoOfLegs() {
		return noOfLegs;
	}

	public void setnoOfLegs(int noOfLegs) {
		noOfLegs=noOfLegs;
	}
}
