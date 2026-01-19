package exercises.exercise_177.application;

import exercises.exercise_177.model.entities.Contract;
import exercises.exercise_177.model.entities.Installment;
import exercises.exercise_177.model.services.ContractService;
import exercises.exercise_177.model.services.PaypalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program
{
	static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int months = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, months);
		
		System.out.println("Parcelas:");
		for(Installment installment : contract.getInstallments())
		{
			System.out.println(installment);
		}
		
		sc.close();
	}
}
