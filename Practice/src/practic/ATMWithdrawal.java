package practic;

import java.util.Scanner;

	public class ATMWithdrawal {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the initial account balance
	        System.out.println("Enter your account balance: ");
	        double balance = scanner.nextDouble();

	        // Input the withdrawal amount
	        System.out.println("Enter the withdrawal amount: ");
	        double withdrawalAmount = scanner.nextDouble();

	        // Check if the withdrawal is valid
	        if (withdrawalAmount <= 0) {
	            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
	        } else if (withdrawalAmount > balance) {
	            System.out.println("Insufficient balance. Your withdrawal amount exceeds the account balance.");
	        } else {
	            // Calculate and display the remaining balance
	            balance -= withdrawalAmount;
	            System.out.printf("Withdrawal successful! Your remaining balance is: %.2f%n", balance);
	        }

	        scanner.close();
	    }
	}

