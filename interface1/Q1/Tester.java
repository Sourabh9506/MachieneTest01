package com.interface1.Q1;



public class Tester {
	
	
	public static void main(String[] args) {
		Shape obj=new Rectangle();
		Shape obj1=new Square();
		calculatearea(obj);
		calculatearea1(obj1);
		
			
		}


	private static void calculatearea1(Shape obj1) {
		System.out.println(obj1.area(12,12));
		
	}


	private static void calculatearea(Shape obj) {
		System.out.println(obj.area(12,12));
		
		
	}
		

	}


