package Assignment_2_Exception_handling;

import java.util.Scanner;

//b. Create an array having 10 elements. Try to print the element in the
//11th position. Catch the appropriate exception.

public class Q2 {
		public static void main(String[] args) throws IndexOutOfBoundsException {
			try (Scanner scan = new Scanner(System.in)) {
				int[] numArr = new int[10];

				for (int i = 0; i < 11; i++) {
					numArr[i] = i;
					System.out.println(numArr[i]);
				}
			} catch (IndexOutOfBoundsException e) {
				throw new IndexOutOfBoundsException(
						"The array size is 10, don't go beyond that value");
			} 
		}
	}


