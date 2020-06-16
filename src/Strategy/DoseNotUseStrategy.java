package Strategy;

import java.util.ArrayList;
import java.util.List;

class Calculator{
	// 1. ù �մ��� 20���� ����. 
	// 2. ����  �ż����� ���� ��  10�ۼ�Ʈ �������� ������ ���ڴ� �߰� �䱸������ �߻��ߴٸ�?
	public double calculate(boolean firstGuest, ArrayList<Item> items) {
		double sum = 0;
		for(Item item:items) {			
			if (firstGuest) {
				sum += item.getPrice() * 0.8;
			} else if (!item.isFresh()){ // 2. �߰��� ������ �ݿ��Ϸ��� if else�� �߰��ؾ��Ѵ�. ������������ ���̷��� �̷��� �ڵ带 �����ؾ� �Ѵ�. 
				sum += item.getPrice() * 0.9;
			}
			else {
				sum += item.getPrice();	
			}
			System.out.println(item.getName() + "���� ����� �� ������" + sum);
		}
		return sum;
	}
}


public class DoseNotUseStrategy {
	public static void main(String[] args) {
		ArrayList<Item> shopingBack = new ArrayList(); 
		shopingBack.add(new Item(1000.0, "����", true));
		shopingBack.add(new Item(2000.0, "���", false));
		shopingBack.add(new Item(3000.0, "Ŀ��", true));
		
		Calculator calculator = new Calculator();
		int calculatedPrice = (int) calculator.calculate(false, shopingBack);
		System.out.println(calculatedPrice);
	}

}
