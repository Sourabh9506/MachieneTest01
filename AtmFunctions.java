package com.atm.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AtmFunctions {
	static Scanner scanner=new Scanner(System.in);

	int amount;
	static int availableBalance;
	int accountNumber;
	static int minBalance = 1000;
	static int balance=30000;
	int withdrawlAmount;
	int transferAmount;
	char choice='n';

	public void depositAmount(int amount) {
		String panNumber;
		try {
			BufferedReader brRead = new BufferedReader(new InputStreamReader(
					System.in));
			
			if (amount > 50000) {
				System.out.println("Enter your Pan Number");
				panNumber = brRead.readLine();

			} else {
				System.out.println("Amount should be greater than 50000...try again");
				
			}
			System.out.println(amount+" deposited successfully");
		
		}
			catch (Exception e) {
			System.out.println("Invalid Entry...");
		}
	}

	public void withdrawMoney() {

		availableBalance = balance - minBalance;
		System.out.println("Available balance is" + availableBalance);
		System.out.println("Enter the amount for withdrawl");
		withdrawlAmount=scanner.nextInt();
		try {

			if (withdrawlAmount > availableBalance) {
				System.out.println("Insufficient funds...!!!");
			} else {
				System.out.println("Success withdrawl of " + withdrawlAmount+"Available balance is "+(availableBalance-withdrawlAmount));
			}
		} catch (Exception e) {
			System.out.println("Invalid entry.. try again");
		}
	}

	public static void showBalance() {
		availableBalance = balance - minBalance;
		System.out.println("Available balance is " + availableBalance);
	}

	public void transferMoney(int amount) {
		System.out.println("Enter the account number ");
		BufferedReader brRead = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			accountNumber = Integer.parseInt(brRead.readLine());
			transferAmount = amount;
			System.out.println(transferAmount+" is transfered successfully");
			System.out.println("Left balance is "+(balance-minBalance-transferAmount));

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		
	
		AtmFunctions atmobj=new AtmFunctions();
		System.out.println("Enter 1 for deposit"+"\n"+"Enter 2 for withraw Money"+"\n"+"Enter 3 for showBalance"+"\n"+"Enter 4 for transfer money");
		
		int choice=scanner.nextInt();
		
		if(choice==1){
			System.out.println("Enter amount");
		atmobj.depositAmount(scanner.nextInt());
		}
		else if(choice==2){
//			atmobj.showBalance();
//			System.out.println(atmobj.withdrawMoney());
					
			atmobj.withdrawMoney();
		}
		else if(choice==3){
		
			atmobj.showBalance();
		}
		else if(choice==4){
			System.out.println("Enter the amount to transfer money ");
			atmobj.transferMoney(scanner.nextInt());
		}else{
			System.out.println("Choose option from 1-4");
		}

	}

}
