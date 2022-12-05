package com.abstract1.app;

import java.util.Scanner;

import com.abstract1.bean.Dog;
import com.abstract1.bean.MyAnimals;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAnimals obj=new MyAnimals();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter body temp");
		obj.setBodyTemp(scanner.nextInt());
		System.out.println("Body temp is "+obj.getBodyTemp());
		
		Dog obj1=new Dog();
		System.out.println("Enter no of legs");
		obj1.setnoOfLegs(scanner.nextInt());

	}

}
