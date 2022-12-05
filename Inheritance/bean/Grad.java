package com.Inheritance.bean;



public class Grad extends Student{
	public boolean isPassed(double grade){
		if(grade>80){
			return true;
		}
		return false;
	}

}
