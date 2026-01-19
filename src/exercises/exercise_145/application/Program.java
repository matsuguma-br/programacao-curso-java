package exercises.exercise_145.application;

import exercises.exercise_145.entities.Company;
import exercises.exercise_145.entities.Individual;
import exercises.exercise_145.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program
{
	static void main()
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(ch == 'i')
			{
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else
			{
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes = 0.0;
		for(TaxPayer payer : taxPayers)
		{
			totalTaxes += payer.tax();
			System.out.println(payer.toString());
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxes);
		
		sc.close();
	}
}
