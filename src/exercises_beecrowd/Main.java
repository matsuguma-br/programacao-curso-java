package exercises_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
	static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++)
		{
			System.out.print(i + (i - 1) + " ");
		}
		
		sc.close();
	}
}
