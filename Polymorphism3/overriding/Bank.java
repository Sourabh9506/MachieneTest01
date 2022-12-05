package com.Polymorphism3.overriding;

public class Bank {
	int getRateOFInterest() {
		return 0;
	}

	public class ICICI extends Bank {
		int getRateOFInterest() {
			return 9;
		}
	}

	public class Axis extends Bank {
		int getRateOFInterest() {
			return 7;
		}
	}

	public class SBI extends Bank {
		int getRateOFInterest() {
			return 10;
		}
	}

}
