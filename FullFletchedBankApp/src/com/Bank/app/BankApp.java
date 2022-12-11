package com.Bank.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.Bank.model.Customer;
import com.Bank.util.CustomerUtil;
import com.Bank.util.CustomerUtil.*;

public class BankApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Customer> customerList=new ArrayList<>();
		CustomerUtil customerUtil=new CustomerUtil();
		
		try{		
			System.out.println("Please select option from below choices\n"+"1. Add Customer\n"+"2. UpdateCustomer\n"
		+"3. Delete Customer\n "+"4. Deposit Money\n "+"5. Withdraw Money\n "+"6. Show Balance\n "+"7.List All Customers\n "+" 8. Transfer Money to another account");
			boolean loop=true;
			int choice=scanner.nextInt();
			
			do{
				switch(choice){
				case 1:
					customerUtil.addCustomer();
					break;
					
				case 2:
					customerUtil.updateDetails();
					break;
					
				case 3:
//					customerUtil.deleteCustomer();
					break;
					
				case 4:
					customerUtil.depositMoney();
					break;
					
				case 5:
					customerUtil.withdrawMoney();
					break;
					
				case 6:
					customerUtil.showBalance();
					break;
					
				case 7:
					customerUtil.listAllCustomers();
					break;
					
				case 8:
					customerUtil.transferToAnother();
					break;
					
				case 10:
					loop=false;
					break;
				}
				
			}while(loop);
		}catch(Exception e){
			System.out.println("Invalid eror");
			
		}

	}

}
