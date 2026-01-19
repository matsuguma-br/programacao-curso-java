package exercises.exercise_183.application;

import exercises.exercise_183.entities.BrazilInterestService;
import exercises.exercise_183.entities.InterestService;
import exercises.exercise_183.entities.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program
{
	static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService isUsa = new UsaInterestService(1.0);
		double paymentUsa = isUsa.payment(amount, months);
		
		System.out.println("USA:");
		System.out.println("Payment after " + months + " months:");
		System.out.printf("%.2f%n", paymentUsa);
		
		InterestService isBrazil = new BrazilInterestService(2.0);
		double paymentBrazil = isBrazil.payment(amount, months);
		
		System.out.println("BRAZIL:");
		System.out.println("Payment after " + months + " months:");
		System.out.printf("%.2f%n", paymentBrazil);
		
		sc.close();
	}
}
