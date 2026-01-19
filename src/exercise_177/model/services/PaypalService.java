package exercise_177.model.services;

public class PaypalService implements OnlinePaymentService
{
	public PaypalService()
	{
	
	}
	
	public double interest(Double amount, Integer months)
	{
		return amount * 0.01 * months;
	}
	
	public double paymentFee(Double amount)
	{
		return amount * 0.02;
	}
}
