package Strategy;

// �ż����� ���� ��ǰ�� ������  10% ������ �ش�.
public class NormalGuestDiscountStrategy implements DiscountStrategy{

	@Override
	public Double getDiscountPrice(Item item) {
		double calculatedPrice = 0;
		if(!item.isFresh()) {
			System.out.println("�̶� �������ݴϴ�");
			calculatedPrice = item.getPrice() * 0.9;
		}else {
			calculatedPrice = item.getPrice();
		}
		System.out.println(item.getName() +" ���� ��µ�" + calculatedPrice +" �����ϴ�.");
		return calculatedPrice;
	}
	
}
