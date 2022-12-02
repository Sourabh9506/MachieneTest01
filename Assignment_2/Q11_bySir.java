package Assignment_2;

import java.util.Scanner;

public class Q11_bySir {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Storing data either from file or database
		// dummy data
		int trainId = 101;
		int pnr = 9999, inputPnr = 0;
		String trainName = "Jan Shadabti";
		String passengerName = "Sumithra";

		// Application is executing
		try {
			System.out.println("Enter PNR no");
			// inputPnr=scanner.nextInt(); //one way
			inputPnr = Integer.parseInt(scanner.nextLine());

			// check condition
			if (inputPnr == pnr) {
				System.out.println("Seat confirmed");
			} else {
				System.out.println("Seat not confirmed");
			}

			scanner.close();

		} catch (Exception e) {
			System.out.println("Invalid Entry...");
		}

	}

}
