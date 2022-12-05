package com.Inheritance.app;

import java.util.Scanner;

import com.Inheritance.bean.Money;

public class Person {

	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Money obj=new Money();
		int basicFee=obj.fees(1200);
		int tax=50;
		System.out.println("Total amount to be paid :"+calculateFees(basicFee,tax));
	
	}
	public static int calculateFees(int basicFees,int tax){
		return (basicFees+tax);
	}

}
