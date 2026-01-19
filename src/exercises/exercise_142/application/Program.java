package exercises.exercise_142.application;

import exercises.exercise_142.entities.Product;
import exercises.exercise_142.entities.ImportedProduct;
import exercises.exercise_142.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program
{
	static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, user or imported (c/u/i)? ");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(ch == 'i')
			{
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else if(ch == 'u')
			{
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			else
			{
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product product : list)
		{
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}
