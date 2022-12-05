package com.Inheritance.app;

import com.Inheritance.bean.Grad;
import com.Inheritance.bean.Undergrad;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grad grad=new Grad();
		System.out.println(grad.isPassed(80.9));
		Undergrad undergrad=new Undergrad();
		System.out.println(undergrad.isPassed(72));
		

	}

}
