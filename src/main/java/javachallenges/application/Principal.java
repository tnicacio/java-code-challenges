package javachallenges.application;

import java.util.Scanner;

import javachallenges.challenges.EvenOrOdd;

public class Principal {

	public static void main(String... args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int userNum = scanner.nextInt();
		System.out.println("Is the number even? " + EvenOrOdd.isEven(userNum));
		
		scanner.close();
	}
}
