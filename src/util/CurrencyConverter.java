package util;

public class CurrencyConverter
{
	public static final double IOF = 1.06;
	
	public static double value(double value, double price)
	{
		return value * price * IOF;
	}
}
