package Strategy;

public class FirstGuestDiscountStrategy implements DiscountStrategy{

	@Override
	public Double getDiscountPrice(Item item) {
		double calculatedPrice = item.getPrice() * 0.9;
		System.out.println(item.getName() +" 까지 사는데" + calculatedPrice +" 썻습니다.");
		return calculatedPrice;
	}
}
