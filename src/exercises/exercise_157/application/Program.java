package exercises.exercise_157.application;

import example_153.model.exception.DomainException;
import exercises.exercise_157.model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program
{
	static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println(account);
		}
		catch(DomainException e)
		{
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println("Unexpected error");;
		}
		
		sc.close();
	}
}
