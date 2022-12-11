package com.Bank.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankValidation {
	
	static BufferedReader brRead=new BufferedReader(new InputStreamReader(System.in));

	public static String setValidAccountNumber(String accNo){
		try{
			Pattern pattern=Pattern.compile("[^0-9]");
			do{
				Matcher matcher=pattern.matcher(accNo);
				boolean find=matcher.find();
				if(find){
					System.out.println("Account number should contain only digits...try again");
					accNo=brRead.readLine();
					
				}else if(accNo.length()!=6){
					System.out.println("Accout Number should be in 6 digits only...try again");
					accNo=brRead.readLine();
				}else{
					break;
				}
				
			}while(true);
			
		}catch(Exception e){
			System.out.println("Invalid input");
		}
		return accNo;
	}
	
	public static String setValidMobileNumber(String mobNum){
		try{
			Pattern pattern=Pattern.compile("[^0-9]");
			
			do{
				Matcher matcher=pattern.matcher(mobNum);
				boolean find=matcher.find();
				
				if(find){
					System.out.println("Mobile Number must contain onlu digits");
					mobNum=brRead.readLine();
				}else if(mobNum.length()!=10){
					System.out.println("Mobile number must be only 10 digits,Enter again: ");
					mobNum=brRead.readLine();
				}
				else{
					break;
				}
			}while(true);
			
		}catch(Exception e){
			System.out.println("Invalid input");
		}
		
		
		return mobNum;
	}
	
	
	public static String setValidBalance(String balance){
		
		try{
			Pattern pattern=Pattern.compile("[^0-9]");
			do{
				Matcher matcher=pattern.matcher(balance);
				boolean find=matcher.find();
				if(find){
					System.out.println("Balance must contain only Numbers. Try again");
					balance=brRead.readLine();
				}else
				{
					
					break;
				}
				
			}while(true);
			
		}catch(Exception e){
			System.out.println("Invalid entry in balance");
		}
		return balance;
		
	}
	public static String setValidCustomerName(String customerName){
		try{
			Pattern pattern=Pattern.compile("[^0-9]");
			do{
			Matcher matcher=pattern.matcher(customerName);
			boolean find=matcher.find();
			if(find){
				System.out.println("Name should only Alphabets...Try again");
				customerName=brRead.readLine();
			}else if(customerName.length()<3){
				System.out.println("Name should contain minimum 3 characters...try again");
				customerName=brRead.readLine();
			}else if(customerName.length()>30){
				customerName=brRead.readLine();
			}else{
				break;
			}
			}while(true);
		}catch(Exception e){
			System.out.println("Invalid input");
		}
		return customerName;
	}

	
}
