package ch12;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	String agentID;
	
	public VIPCustomer() {}

	public VIPCustomer(int ID, String name) {
		super(ID, name);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		grade = "VIP";
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -= (int)(price * salesRatio);
	}

	
	
}

