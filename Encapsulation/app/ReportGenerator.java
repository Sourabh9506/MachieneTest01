package com.Encapsulation.app;

import java.util.Scanner;

import com.Encapsulation.bean.Store_Item;

public class ReportGenerator {

	public static void main(String[] args) {

		Store_Item items = new Store_Item();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter items type,quality,quantity,price");
		items.setType(scanner.nextLine());
		items.setQuality(scanner.nextLine());
		items.setQuantity(scanner.nextInt());
		items.setPrice(scanner.nextInt());
		System.out.println("Entered items type,quality,quantity,price are :");
		System.out.println(items.getPrice()+"\n"+items.getQuality()+"\n"+items.getQuantity()+"\n"+items.getPrice());
		

	}

}
