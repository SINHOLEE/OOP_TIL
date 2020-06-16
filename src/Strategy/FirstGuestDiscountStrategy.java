package Strategy;

public class FirstGuestDiscountStrategy implements DiscountStrategy{

	@Override
	public Double getDiscountPrice(Item item) {
		double calculatedPrice = item.getPrice() * 0.9;
		System.out.println(item.getName() +" ���� ��µ�" + calculatedPrice +" �����ϴ�.");
		return calculatedPrice;
	}
}
