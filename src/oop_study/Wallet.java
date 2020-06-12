package oop_study;

public class Wallet {
	private int money;
	public Wallet(int money) {
		this.money = money;
		// TODO Auto-generated constructor stub
	}
	public int getTotalMoney() {
		return this.money;
	}
	public void substractMoney(int debit) {
		this.money -= debit;
	}

}
