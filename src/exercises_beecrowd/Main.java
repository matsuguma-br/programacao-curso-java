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
		int fat = n;
		
		// não tá entrando no for
		for(int i = n - 1; i == 2; i--)
		{
			System.out.println(fat);
			System.out.println(i);
			fat *= i;
		}
		
		sc.close();
	}
}
