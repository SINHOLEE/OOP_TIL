package Strategy;

import java.util.ArrayList;
import java.util.List;

class Calculator{
	// 1. 첫 손님은 20프로 세일. 
	// 2. 만약  신선하지 않을 때  10퍼센트 할인율을 적용해 주자는 추가 요구사항이 발생했다면?
	public double calculate(boolean firstGuest, ArrayList<Item> items) {
		double sum = 0;
		for(Item item:items) {			
			if (firstGuest) {
				sum += item.getPrice() * 0.8;
			} else if (!item.isFresh()){ // 2. 추가된 사항을 반영하려면 if else를 추가해야한다. 유지보수성을 높이려면 이러한 코드를 지양해야 한다. 
				sum += item.getPrice() * 0.9;
			}
			else {
				sum += item.getPrice();	
			}
			System.out.println(item.getName() + "까지 계산한 총 가격은" + sum);
		}
		return sum;
	}
}


public class DoseNotUseStrategy {
	public static void main(String[] args) {
		ArrayList<Item> shopingBack = new ArrayList(); 
		shopingBack.add(new Item(1000.0, "과자", true));
		shopingBack.add(new Item(2000.0, "사과", false));
		shopingBack.add(new Item(3000.0, "커피", true));
		
		Calculator calculator = new Calculator();
		int calculatedPrice = (int) calculator.calculate(false, shopingBack);
		System.out.println(calculatedPrice);
	}

}
