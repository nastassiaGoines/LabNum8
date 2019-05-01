package co.grandcircus;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LabNumber8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our Java class.  Which student would you like to learn more about?");

		String[] names = { "Laura Burt", "Kay Albu", "John Albu", "Brad Roman", "Flora Lopez", "Beth Roman" };
		String[] town = { "Westland", "Manistee", "Onekama", "Dearborn", "Atlanta", "Maimi" };
		String[] food = { "pizza", "chocolate", "fish", "wings", "stir fry", "cheesecake" };
		int counter = 1;
		int students = 0;
		while (true) {
			counter = 1;
			while (true) {
				System.out.println(counter + ": " + names[counter - 1]);
				counter++;
				if (counter > names.length) {
					break;
				}
			}
			System.out.println("Enter a number 1- " + names.length + ":");
			try {
				students = scan.nextInt() - 1;
				if (students < 0 || students >= names.length) {
					throw new IllegalArgumentException();
				}
			} catch (IllegalArgumentException e) {

				System.out.println(
						"That student does not exist. Please try again by entering a number 1- " + names.length + ":");
			} catch (IndexOutOfBoundsException f) {

				System.out.println(
						"That student does not exist. Please try again by entering a number 1- " + names.length + ":");
			}

			System.out.println(names[students]);

			System.out.println("Student " + (students + 1) + " is " + names[students] + ".");
			System.out.println("What would you like to know about him/her?  (Enter hometown or favorite food?)");
			if (scan.hasNextLine()) {
				scan.nextLine();
			}
			String answer = scan.nextLine();
			try {
				if (answer.equalsIgnoreCase("hometown")) {
					System.out.println(town[students]);

				} else if (answer.equalsIgnoreCase("favorite food")) {
					System.out.println(food[students]);
				} else
					throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				System.out
						.println("That data does not exist. Please try again by entering hometown or favorite food. ");
			}

			System.out.println("Would you like to learn about another student? (y/n)");
			String s = scan.nextLine();
			if (s.charAt(0) == 'n') {
				System.out.println("Thanks!");
				break;
			}

		}

	}

}
