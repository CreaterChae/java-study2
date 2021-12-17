package ch12;

public class Customer {

	protected int ID;
	protected String name;
	protected String grade;
	int bonusPoint;
	double bonusRatio;


	public Customer() {}

	
	
	public Customer(int ID, String name) {
		this.ID = ID;
		this.name = name;
		
		grade = "SILVER";
		bonusRatio = 0.01;
				
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price;
		
	}
	
	public String showCustomerInfo() {
		return name + "님의 등급은 " + grade + "이며 보너스 포인트는" + bonusPoint + "입니다.";
	}
	
}