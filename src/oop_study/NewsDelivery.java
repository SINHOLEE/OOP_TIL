package oop_study;

import oop_study.exceptions.NotEnoughMoneyException;

public class NewsDelivery {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int payment = 10000;
		Customer customer = new Customer(12000);
		try {
			System.out.println(customer.getWalletBalance());
			int paidAmount = customer.getPayment(payment);
			System.out.println(customer.getWalletBalance());
			System.out.println(paidAmount);
		} catch (NotEnoughMoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
