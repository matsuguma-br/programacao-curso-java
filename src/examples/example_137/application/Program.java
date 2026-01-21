package examples.example_137.application;

import examples.example_137.entities.Account;
import examples.example_137.entities.BusinessAccount;
import examples.example_137.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program
{
	static void main(String[] args)
	{
		//		Account acc = new Account(1001, "Alex", 0.0);
		//		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		//
		//		// UPCASTING
		//		Account acc1 = bacc;
		//		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		//		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		//
		//		// DOWNCASTING
		//		BusinessAccount acc4 = (BusinessAccount) acc2;
		//		acc4.loan(100.0);
		//
		////		BusinessAccount acc5 = (BusinessAccount) acc3; // Nem sempre o compilador sabe disso
		//		if(acc3 instanceof BusinessAccount)
		//		{
		//			BusinessAccount acc5 = (BusinessAccount) acc3;
		//			acc5.loan(200.0);
		//			System.out.println("Loan!");
		//		}
		//
		//		if(acc3 instanceof SavingsAccount)
		//		{
		//			SavingsAccount acc5 = (SavingsAccount) acc3;
		//			acc5.updateBalance();
		//			System.out.println("Update!");
		//		}
		
		//		Account acc1 = new Account(1001, "Alex", 1000.0);
		//		acc1.withdraw(200.0);
		//		System.out.println(acc1.getBalance());
		//
		//		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		//		acc2.withdraw(200.0);
		//		System.out.println(acc2.getBalance());
		//
		//		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		//		acc3.withdraw(200.0);
		//		System.out.println(acc3.getBalance());
		
		// Abstract
		//		Account acc1 = new Account(1001, "Alex", 1000.0); // Não deixa instanciar
		//		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		//		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list)
		{
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Account acc : list)
		{
			acc.deposit(10.00);
		}
		
		for(Account acc : list)
		{
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
