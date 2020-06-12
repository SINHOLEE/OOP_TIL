package oop_study;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

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
			int paidAmount1 = customer.getPayment(payment);
			System.out.println(paidAmount1);
			System.out.println(customer.getWalletBalance());
		} catch (NotEnoughMoneyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
