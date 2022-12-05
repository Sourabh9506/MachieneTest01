package com.Polymorphism2.app;

import java.util.Scanner;

import com.Polymorphism2.bean.Figure;
import com.Polymorphism2.bean.Rectangle;
import com.Polymorphism2.bean.Triangle;

public class TestFigure {
	public static void main(String[] args){
		
		
		Figure rect=new Rectangle();
		Figure triangle=new Triangle();
		System.out.println("Area of rectangle is");
		calculateArea(rect);
		System.out.println("Area of triangle is");
		calculateArea(triangle);
		
	}

	private static void calculateArea(Figure rect) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println
		("Enter the dimentions");
		System.out.println(rect.area(scanner.nextInt(),scanner.nextInt()));
		
	}

}
