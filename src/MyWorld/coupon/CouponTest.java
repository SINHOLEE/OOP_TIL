package MyWorld.coupon;

import oop_study.exceptions.NotEnoughMoneyException;

public class CouponTest {

	public static void main(String[] args) throws NotEnoughMoneyException {
		// TODO Auto-generated method stub
		// 사람이 있어 -> ㅣㅇ사 람은 십만원을 가지고 있다. -> 10만원이라는 액수를 가지고 있는 지갑을 가지고 있다.
		// 상품이 있어. 이 상품은 3000원짜리 장난감이고, 할인쿠폰을 쓸 수 있다면, 쓰고, 아니면 못써
		// 그냥 쿠폰과 사용제한이 있는 쿠폰이 있어 
		// 그냥 쿠폰은, 정해진 할인폭만큼 할인해주고,
		// 시ㅏ용ㅈ한이 있는 쿠폰은 해당 상품의 가격이 제한가격(limitPrice보다 커야지 사용할 수 있어)
		
		
		// 1. 3천원 짜리 상품이 있어서 구매한다.
		Product product = new Product(3000, "삼천원짜리 장난감");
		Customer sinho = new Customer(10000); // 만원을 가지고 있는 신호가 있다.
		int payment = sinho.getPayment(product.getPrice());

		System.out.print("지불할 돈: ");
		System.out.println(payment);
		System.out.print("신호한테 남은 돈: ");
		System.out.println(sinho.getWalletBalance());
		
		//2. 13000원짜리 상품을 구매한다 -> 구매하면 오류난다.
		Product product2 = new Product(10000, "삼천원짜리 장난감");
		Customer sinho2 = new Customer(10000); // 만원을 가지고 있는 신호가 있다.
		try {
			int payment2 = sinho.getPayment(product2.getPrice());
			System.out.print("지불할 돈: ");
			System.out.println(payment2);
			System.out.print("신호한테 남은 돈: ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("돈이 모잘라서 못삽니다.");
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
		if (this.wallet == null) throw new NotEnoughMoneyException("지갑이 없어요.");
		
		if (wallet.getTotalMoney() >= payment) {
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

