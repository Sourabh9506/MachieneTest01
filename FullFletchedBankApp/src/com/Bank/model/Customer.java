package com.Bank.model;

import java.util.Random;

public class Customer {

	String numbers = "0123456789";
	private int balance;
	private char accountNo[] = new char[10];
	private String customerName;
	private String accountType;
	private long phoneNumber;
	public int minBalance = 1000;
	private static String emailId;
	private static char[] atmPin = new char[4];

	public Customer(String customerName, String accountType, long phoneNumber,
			int balance,String emailId) {
	

		this.customerName = customerName;
		this.accountType = accountType;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		this.emailId = emailId;
		this.accountNo=generateAccountNumbers();
		this.atmPin=generateOtp();

	}

	

	public String getAccountNo() {
		String num = "";
		for (char i : this.accountNo) {
			num += i;
		}
		return num;

	}

	public void setAccountNo(char[] accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public int setBalance(int balance) {
		return this.balance = balance;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAtmPin() {
		String otp = "";
		for (char i : this.atmPin) {
			otp += i;
		}
		return otp;
	}

	public String setAtmPin(char[] atmPin) {
		String otp = "";
		for (char i : this.atmPin) {
			otp += i;
		}
		return otp;

	}

	public char[] generateOtp() {
		Random rndm_numbers = new Random();
		char otp[] = new char[4];

		for (int i = 0; i < 10; i++) {
			otp[i] = numbers.charAt(rndm_numbers.nextInt(numbers.length()));
		}
		return otp;
	}

	public char[] generateAccountNumbers() {
		Random rndm_numbers = new Random();
		char acc_no[] = new char[10];

		for (int i = 0; i < 10; i++) {
			acc_no[i] = numbers.charAt(rndm_numbers.nextInt(numbers.length()));
		}

		return acc_no;
	}

	public void updateDetail(long num, String email) {
		// TODO Auto-generated method stub
		this.emailId = email;
		this.phoneNumber = num;

	}

}
