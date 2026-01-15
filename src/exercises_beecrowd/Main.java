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
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			x[i] = sc.nextInt();
		}
		
		int menor = x[0];
		int pos = 0;
		
		for(int i = 1; i < n; i++)
		{
			if(x[i] < menor)
			{
				menor = x[i];
				pos = i;
			}
		}
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + pos);
		
		sc.close();
	}
}
