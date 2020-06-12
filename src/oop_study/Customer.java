package oop_study;

import oop_study.exceptions.NotEnoughMoneyException;

public class Customer {
	private Wallet wallet;
	public Customer(int money) {
		this.wallet = new Wallet(money);
	}
	public Wallet getWallet() {
		return wallet;
	}
	
	public int getPayment(int payment) throws NotEnoughMoneyException {
		if (this.wallet == null) throw new NotEnoughMoneyException("������ �����.");
		
		if (wallet.getTotalMoney() > payment) {
			this.wallet.substractMoney(payment);
			return payment; // ���⼭ �� ��ȯ�ϴ°� ���̸�Ʈ��?
		}
		throw new NotEnoughMoneyException("���� ���߶��");
	}
	
	public int getWalletBalance() throws NotEnoughMoneyException {
		if (this.wallet == null) throw new NotEnoughMoneyException("������ �����.");
		return this.wallet.getTotalMoney();
	}
}
