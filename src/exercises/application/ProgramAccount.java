package exercises.application;

import exercises.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount
{
	static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y')
		{
			System.out.print("Enter inicial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		}
		else {
			account = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		System.out.println();
		
		sc.close();
	}
}
