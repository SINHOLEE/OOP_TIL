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
		if (this.wallet == null) throw new NotEnoughMoneyException("지갑이 없어요.");
		
		if (wallet.getTotalMoney() > payment) {
			this.wallet.substractMoney(payment);
			return payment; // 여기서 왜 반환하는게 페이먼트지?
		}
		throw new NotEnoughMoneyException("돈이 모잘라요");
	}
	
	public int getWalletBalance() throws NotEnoughMoneyException {
		if (this.wallet == null) throw new NotEnoughMoneyException("지갑이 없어요.");
		return this.wallet.getTotalMoney();
	}
}
