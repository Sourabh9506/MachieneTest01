package com.Polymorphism3.overriding;

public class MethodOverriding extends Bank {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		ICICI i = new ICICI();
		Axis a = new Axis();
		System.out.println("SBI Rate of Interest: " + sbi.getRateOFInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOFInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOFInterest());
	}

}
