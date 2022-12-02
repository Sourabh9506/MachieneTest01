package Assignment_2_Exception_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1 {

	public static int inputUserAge(String age){
		BufferedReader brRead=new BufferedReader(new  InputStreamReader(System.in));
		Pattern pattern=Pattern.compile("[^0-9]");
		Matcher matcher=pattern.matcher(age);
		boolean finder=matcher.find();
		
		int age2=Integer.parseInt(age);
		
		try{
		if(finder){
			System.out.println("Age must contain digits only");
		}else (age2>18 && age2<60){
			System.out.println("age is :"+age);
			age=brRead.readLine();
		}
		
		return Integer.parseInt(age);
		}
		catch(Exception e){
			System.out.println("Invalid entry ...");
		}
		return Integer.parseInt(age);

		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int temp=inputUserAge(scanner.nextLine());
		System.out.println(temp);
		
		

	}

}
