package exercises.exercise_177.model.services;

public interface OnlinePaymentService
{
	public double interest(Double amount, Integer months);
	public double paymentFee(Double amount);
}
