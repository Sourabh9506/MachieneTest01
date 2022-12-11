package com.Bank.util;

import java.util.ArrayList;

import static com.Bank.util.BankValidation.*;

import java.util.Scanner;

import com.Bank.model.Customer;

public class CustomerUtil {
	public static ArrayList<Customer> customerList=new ArrayList<>();
	static Scanner scanner=new Scanner(System.in);
	public static int transferedAmount;
	

	static int choice =0;
	public static void addCustomer(){
		try{
			System.out.println("Enter name");
			String accName=scanner.nextLine();
		
//		System.out.println("Enter 1 for savings account\n"+"Enter 2 for current account");
//		int option=scanner.nextInt();
//		String accType="";
//		
//		if(option==1){
//			accType="Saving";
//		}else if(option==2){
//			accType="Current";
//		}else{
//			System.out.println("Invalid input please try again...");
//		}
	
		System.out.println("Enter your amount");
		String bal=scanner.nextLine();
		setValidBalance(bal);
		int balance=Integer.parseInt(bal);
		
		System.out.println("Enter your phone number");
		String mob=setValidMobileNumber(scanner.nextLine());
		long mobileNum=Long.parseLong(mob);
		
		System.out.println("Enter email address: ");
		String email=scanner.nextLine();
		
		System.out.println("Enter account type savings or current");
		String accountType=scanner.nextLine();
		
		customerList.add(new Customer(accName,accountType,
				mobileNum,balance,email));
		}catch(Exception e){
			System.out.println("Invalid input...");
		}
	}
	
	public static void updateDetails(){
		try{
			System.out.println("Enter account number");
			int accNo=scanner.nextInt();
			boolean found=false;
			for(Customer customer: customerList){
				if(customer.getAccountNo().equals(accNo)){
					found=true;
					System.out.println("Enter mobile number :");
					String num=setValidMobileNumber(scanner.nextLine());
					long number=Integer.parseInt(num);
					System.out.println("Enter email address ");
					String email=scanner.nextLine();
					customer.updateDetail(number,email);
				}
			}
			
			public static void deleteCustomer()
			{
				try{
					System.out.println("Enter account number");
					String accNo=scanner.nextLine();
					boolean found=false;
					for(Customer customer:customerList){
						if(customer.getAccountNumber().equals(accNo)){
							found=true;
							customerList.remove(customer);
							System.out.println("Successfuly removed");
						}
						if(!found){
							System.out.println("Account number does not exists...try again");
						}
					}
				}catch(Exception e){
					System.out.println("Account not found with this account number");
				}
			}
		}catch(Exception e){
			System.out.println("Invalid details");
		}
	}
	public static void depositMoney(){
		try{
			System.out.println("Enter account number");
			String accountNumber=scanner.nextLine();
			
			for(Customer customer:customerList){
				if(customer.getAccountNo().equals(accountNumber)){
					System.out.println("Enter the amount to deposit");
					long amount=scanner.nextLong();
					if(amount>50000){
						System.out.println("Enter your PAN CARD Number as amount is greater than 50k");
						String panNumber=scanner.nextLine();
						System.out.println("Enter phone number for verification");
						int phone=scanner.nextInt();
						if(customer.getPhoneNumber()==phone){
							System.out.println(customer.getBalance()+amount);
							System.out.println("Successfully deposited");
							
						}else{
							System.out.println("Wrong phone number");
						}
						
					
					}else if(amount<50000){
						System.out.println(customer.getBalance()+amount);
						System.out.println("Successfully deposited");

					}
				}
			}
		}catch(Exception e){
			System.out.println("Invalid amount ..try again");
		}
	}
	
	public static void withdrawMoney(){
		try{
			
			System.out.println("Enter Account Number");
			String accNo=scanner.nextLine();
			boolean found=false;
			for(Customer customer:customerList){
				if(customer.getAccountNo().equals(accNo)){
					System.out.println("Enter amount to withdraw");
					int amount=scanner.nextInt();
					int currentBalance=customer.getBalance()-customer.minBalance;
					if(amount>currentBalance){
						System.out.println("Enter amount is greater than current Balance");
						
					}else{
						customer.setBalance(customer.getBalance()-amount);
						System.out.println("Collect ur money");
						System.out.println("Transaction successful");
						transferedAmount=amount;
					}
					found=true;
				}
				if(!found){
					System.out.println("Account not found with this account number");
					
				}
			}
					
		}catch(Exception e){
			System.out.println("Invalid Input");
		}
	}
	public static void showBalance(){
		try{
		System.out.println("Enter account num");
		String accNo=scanner.nextLine();
		boolean found=false;
		for(Customer customer: customerList){
			if(customer.getAccountNo().equals(accNo)){
				System.out.println("Your account balance is"+customer.getBalance());
				found=true;
			}
		}
		if(!found){
			System.out.println("Invalid accound no");
		}
		}catch(Exception e){
			System.out.println("Invalid input...");
		}
		
	}
	public static void listAllCustomers(){
		try{
			System.out.format("%15s%15s%15s%15s%15s%15s%15s%n","Acc Number","Customer Name","Acc Type","Balance","Phone No","Email Id","Pin");
			System.out.println("------------------------------------------------------------------------------------------------------------");
			for(Customer customer:customerList){
				System.out.format("%15s%15s%15s%15s%15s%15s%15s%n",customer.getAccountNo(),customer.getCustomerName(),customer.getAccountType(),customer.getBalance(),customer.getPhoneNumber(),customer.getEmailId(),customer.getAtmPin());
				
			}
		}
		catch(Exception e){
			System.out.println("Invalid Input...");
		}
	}
	public static void transferToAnother(){
		try{
			System.out.println("Enter your acc number");
			String acc=scanner.nextLine();
			System.out.println("Enter account number to transfer");
			String accNo=scanner.nextLine();
			System.out.println("Enter amount to transfer");
			int amount=scanner.nextInt();
			boolean found=false;
			for(Customer customer:customerList){
				if(customer.getAccountNo().equals(acc)){
					for(Customer customer2:customerList){
						if(customer2.getAccountNo().equals(accNo)){
							customer.setBalance(customer.getBalance()-amount);
							customer2.setBalance(customer2.getBalance()+amount);
							found=true;
						}
					}
				}
			}
			if(!found){
				System.out.println("Account number is incorrect");
			}
		}catch(Exception e){
			System.out.println("invalid input");
		}
	
	}
	public static void displayCustomer(){
		try{
			System.out.println("Enter account number to transfer");
			String accNo=scanner.nextLine();
			System.out.format("%15s%15s%15s%15s%15s%15s%15s%n","Acc Number","Customer Name","Acc Type","Balance","Phone No","Email Id","ATM Pin");
			System.out.println("----------------------------------------------------------------------------------------------------------------");
			boolean found=false;
			for(Customer customer: customerList)
			{
				if(customer.getAccountNo().equals(accNo)){
					found=true;
					System.out.format("%15s%15s%15s%15s%20s%20s%15s%n",customer.getAccountNo(),customer.getCustomerName(),customer.getAccountType(),customer.getBalance(),customer.getPhoneNumber(),customer.getEmailId(),customer.getAtmPin());
					
				}
				
			}if(!found){
				System.out.println("Account not found..");
			}
		}catch(Exception e){
			System.out.println("Input inpout");
		}
	}
	

}
