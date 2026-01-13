package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
	static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int x = 2; x < 10000; x++)
		{
			if(x % n == 2)
			{
				System.out.println(x);
			}
		}
		
		sc.close();
	}
}
