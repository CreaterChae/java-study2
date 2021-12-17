package ch12;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	public GoldCustomer(int ID, String name) {
		super(ID, name);
		
		salesRatio = 0.1;
		bonusRatio = 0.02;
		grade = "Gold";
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price*salesRatio);
	}

	
	
}
