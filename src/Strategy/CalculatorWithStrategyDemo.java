package Strategy;

import java.util.ArrayList;

class StrategyCalculator{

	private DiscountStrategy discountStrategy;
	public StrategyCalculator(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public double calculate(ArrayList<Item> items) {
		double sum = 0;
		for(Item item:items) {			
			sum += discountStrategy.getDiscountPrice(item);
		}
		return sum;
	}
	
	public void setStrategy(DiscountStrategy strategy) {
		this.discountStrategy = strategy;
	}
}

// 사실 없어도 되는 클래스지만 조금 더 명확하게 보이기 위해...
class CalculateManager{
	private ArrayList<Item> items;
	// 아 이부분 좀 아쉬운데... 위임
	private StrategyCalculator strategy = new StrategyCalculator(new NormalGuestDiscountStrategy());
	public CalculateManager(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void onFirstGuestButtonClick() {
		this.strategy.setStrategy(new FirstGuestDiscountStrategy());
	}
	
	// 정책이 추가될때 바뀌는 부분
	public void onNormalGuestButtonClick() {
		this.strategy.setStrategy(new NormalGuestDiscountStrategy());
	}
	
	// 정책이 추가될때 바뀌는 부분
	public void onLastGuestButtonClick() {
		this.strategy.setStrategy(new LastGuestDiscountStrategy());
	}
	
	public Double onCalculationButtonClick() {
		double calculatedPrice = this.strategy.calculate(items);
		return calculatedPrice;
	}
}


public class CalculatorWithStrategyDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> shopingBack = new ArrayList<Item>(); 
		shopingBack.add(new Item(1000.0, "과자", true));
		shopingBack.add(new Item(2000.0, "사과", false));
		shopingBack.add(new Item(3000.0, "커피", true));
		
		CalculateManager manager = new CalculateManager(shopingBack);
		
		// 첫번째 손님계산
		manager.onFirstGuestButtonClick();
		System.out.println("첫번째 손님이에요!");
		System.out.println(manager.onCalculationButtonClick());
		System.out.println("-----------------------------");

		// 두번째 손님
		manager.onNormalGuestButtonClick();
		System.out.println("두번째 손님이에요!");
		System.out.println(manager.onCalculationButtonClick());
		System.out.println("-----------------------------");
		
		// 세번째 손님
		System.out.println("세번째 손님이에요!");
		System.out.println(manager.onCalculationButtonClick());
		System.out.println("-----------------------------");
		
	
		// 마지막 손님계산
		manager.onLastGuestButtonClick();
		System.out.println("마지막 손님이에요!");
		System.out.println(manager.onCalculationButtonClick());
		System.out.println("-----------------------------");
		
	}
}
