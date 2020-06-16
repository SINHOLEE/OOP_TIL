package Strategy;

// ������ �մ��� ��쿡�� ���̷� �ݰ��� ���� �Ѵ�.
public class LastGuestDiscountStrategy implements DiscountStrategy{
	
	@Override
	public Double getDiscountPrice(Item item) {

		double calculatedPrice = item.getPrice() * 0.5;
		System.out.println(item.getName() +" ���� ��µ�" + calculatedPrice +" �����ϴ�.");
		return calculatedPrice;
	}

}
