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

// ��� ��� �Ǵ� Ŭ�������� ���� �� ��Ȯ�ϰ� ���̱� ����...
class CalculateManager{
	private ArrayList<Item> items;
	// �� �̺κ� �� �ƽ��... ����
	private StrategyCalculator strategy = new StrategyCalculator(new NormalGuestDiscountStrategy());
	public CalculateManager(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void onFirstGuestButtonClick() {
		this.strategy.setStrategy(new FirstGuestDiscountStrategy());
	}
	
	// ��å�� �߰��ɶ� �ٲ�� �κ�
	public void onNormalGuestButtonClick() {
		this.strategy.setStrategy(new NormalGuestDiscountStrategy());
	}
	
	// ��å�� �߰��ɶ� �ٲ�� �κ�
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
		shopingBack.add(new Item(1000.0, "����", true));
		shopingBack.add(new Item(2000.0, "���", false));
		shopingBack.add(new Item(3000.0, "Ŀ��", true));
		
		CalculateManager manager = new CalculateManager(shopingBack);
		
		// ù��° �մ԰��
		manager.onFirstGuestButtonClick();
		System.out.println("ù��° �մ��̿���!");
		System.out.println(manager.onCalculationButtonClick());
		System.out.println("-----------------------------");

		// �ι�° �մ�
		manager.onNormalGuestButtonClick();
		System.out.println("�ι�° �մ��̿���!");
		System.out.println(manager.onCalculationButtonClick());
		System.out.println("-----------------------------");
		
		// ����° �մ�
		System.out.println("����° �մ��̿���!");
		System.out.println(manager.onCalculationButtonClick());
		System.out.println("-----------------------------");
		
	
		// ������ �մ԰��
		manager.onLastGuestButtonClick();
		System.out.println("������ �մ��̿���!");
		System.out.println(manager.onCalculationButtonClick());
		System.out.println("-----------------------------");
		
	}
}
