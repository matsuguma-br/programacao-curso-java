package exercise_142.entities;

public class ImportedProduct extends Product
{
	private Double customsFee;
	
	public ImportedProduct()
	{
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee)
	{
		super(name, price + customsFee);
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee()
	{
		return customsFee;
	}
	
	public void setCustomsFee(Double customsFee)
	{
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag()
	{
		return super.priceTag()
			+ " (Customs fee: $ "
			+ String.format("%.2f", getCustomsFee())
			+ ")";
	}
	
	public double totalPrice()
	{
		return getPrice() + customsFee;
	}
}
