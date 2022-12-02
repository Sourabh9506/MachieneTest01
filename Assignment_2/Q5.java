package Assignment_2;

import java.util.Scanner;

//Q5. Create a menu driven program using do-while and switch-case 
//which implements a help system for Java’s selection and iteration statements.
//You have to display the syntax of selected control statement.

public class Q5 {

	public static void main(String[] args) {
		
		inputLoopNumber();		
	}

	private static void inputLoopNumber() {

		
		Scanner scn=new Scanner(System.in);
		
		
		System.out.println("Enter 1 for if"
				+"\n"+ "2 for switch"
				 +"\n"+"3 for while"
				 +"\n"+"4 fro do-while");
		int num=scn.nextInt();
		try{
		
		do{
			switch(num){
			case 1:
				System.out.println("if(condition){"
						+"\n"+ "code to be executed}"
						+"\n"+ "else{codeto be executed}");
				
				break;
				
			case 2:
				System.out.println("switch(expression){"
						+"\n"+ "case 1:"
						+"\n"+ "code to be executed"
						+"\n"+ "break;"
						+"\n"+ "case 2:"
						+"\n"+ "code to be executed"
						+"\n"+ "break"
						+"\n"+ "default :"
						+"\n"+ "code to be executed if all cases not matched"
						+"\n"+ "}");
				break;
				
			case 3:
				System.out.println("while(condition){"
						+"\n"+ "code of block to be executed"
						+"\n"+ "}");
				break;
			
			case 4:
				System.out.println("do{"
						+"\n"+ "code to be exceuted}"
						+"\n"+ "while(condition)");
				break;
				
			default:
				System.out.println("Enter number between 1-4");
				break;
			}
			System.out.println("Do u want to continue");
		}while(num<=5);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	

}
