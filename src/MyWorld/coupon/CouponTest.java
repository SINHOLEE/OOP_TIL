package MyWorld.coupon;

import oop_study.exceptions.NotEnoughMoneyException;

public class CouponTest {

	public static void main(String[] args) throws NotEnoughMoneyException {
		// TODO Auto-generated method stub
		// ����� �־� -> �Ӥ��� ���� �ʸ����� ������ �ִ�. -> 10�����̶�� �׼��� ������ �ִ� ������ ������ �ִ�.
		// ��ǰ�� �־�. �� ��ǰ�� 3000��¥�� �峭���̰�, ���������� �� �� �ִٸ�, ����, �ƴϸ� ����
		// �׳� ������ ��������� �ִ� ������ �־� 
		// �׳� ������, ������ ��������ŭ �������ְ�,
		// �ä��뤸���� �ִ� ������ �ش� ��ǰ�� ������ ���Ѱ���(limitPrice���� Ŀ���� ����� �� �־�)
		
		
		// 1. 3õ�� ¥�� ��ǰ�� �־ �����Ѵ�.
		Product product = new Product(3000, "��õ��¥�� �峭��");
		Customer sinho = new Customer(10000); // ������ ������ �ִ� ��ȣ�� �ִ�.
		int payment = sinho.getPayment(product.getPrice());

		System.out.print("������ ��: ");
		System.out.println(payment);
		System.out.print("��ȣ���� ���� ��: ");
		System.out.println(sinho.getWalletBalance());
		
		//2. 13000��¥�� ��ǰ�� �����Ѵ� -> �����ϸ� ��������.
		Product product2 = new Product(10000, "��õ��¥�� �峭��");
		Customer sinho2 = new Customer(10000); // ������ ������ �ִ� ��ȣ�� �ִ�.
		try {
			int payment2 = sinho.getPayment(product2.getPrice());
			System.out.print("������ ��: ");
			System.out.println(payment2);
			System.out.print("��ȣ���� ���� ��: ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� ���߶� ����ϴ�.");
		}
		
		System.out.println(sinho2.getWalletBalance());
		
		
		
		
		
//		LimitPriceCoupon lpCoupon = new LimitPriceCoupon(5000, 1000);
//		int discountAmount = lpCoupon.getDiscountAmount();
//		System.out.println(discountAmount);
//		int limitedPrice = lpCoupon.getLimitPrice();
//		System.out.println(limitedPrice);
//		System.out.println(lpCoupon.checkDiscountPriceOverLimitPrice());
//		
//		int price = lpCoupon.calculateDiscountedPrice(product.getPrice());
//		
	}
}
class Customer {
	private Wallet wallet;
	public Customer(int money) {
		this.wallet = new Wallet(money);
	}
	public Wallet getWallet() {
		return wallet;
	}
	
	public int getPayment(int payment) throws NotEnoughMoneyException {
		if (this.wallet == null) throw new NotEnoughMoneyException("������ �����.");
		
		if (wallet.getTotalMoney() >= payment) {
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

class Wallet {
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


class Product{
	private int price;
	private String name;
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public int getPrice() {
		return this.price;
	}
	public String getName() {
		return this.name;
	}
}

class Coupon{
	private int discountAmount;
	public Coupon(int discountAmount){
		this.discountAmount = discountAmount;
	}
	public int getDiscountAmount(){
		return this.discountAmount;
	}
	public int calculateDiscountedPrice(int price){
		if (this.discountAmount <= price) {
			return price - this.discountAmount;
		}
		return 0;
	}
}
class LimitPriceCoupon extends Coupon {
	private int limitPrice;
	
	public LimitPriceCoupon(int limitPrice, int discountAmount){
	super(discountAmount);
	this.limitPrice = limitPrice;
	}
	public int getLimitPrice(){
	   return this.limitPrice;
	}
	@Override
	public int calculateDiscountedPrice(int price){
	   if (price < this.limitPrice){
				return price;
	   }
	   return super.calculateDiscountedPrice(price);  
	}
	public boolean checkDiscountPriceOverLimitPrice() {
		if (super.getDiscountAmount() > this.limitPrice) {
			return true;
		}
		return false;
	}
}

