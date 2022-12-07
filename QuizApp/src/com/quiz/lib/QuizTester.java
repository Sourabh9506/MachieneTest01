package com.quiz.lib;

import java.util.Scanner;

public class QuizTester {
	Scanner scanner=new Scanner(System.in);

	public void startQuiz(){
		System.out.println("Start the Quiz.");
		System.out.println("What is capital of AndraPradesh ");
		System.out.print(scanner.nextLine());
		System.out.println("What is capital of ArunachalPradesh"+scanner.nextLine());
		System.out.println("What is capital of Assam"+scanner.nextLine());
		System.out.println("What is capital of Bihar "+scanner.nextLine());
		System.out.println("what is capital of Chhattisgarh "+scanner.nextLine());
	}

}
