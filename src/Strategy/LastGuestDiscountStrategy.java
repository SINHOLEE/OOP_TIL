package Strategy;

// 마지막 손님일 경우에는 떨이로 반값만 내게 한다.
public class LastGuestDiscountStrategy implements DiscountStrategy{
	
	@Override
	public Double getDiscountPrice(Item item) {

		double calculatedPrice = item.getPrice() * 0.5;
		System.out.println(item.getName() +" 까지 사는데" + calculatedPrice +" 썻습니다.");
		return calculatedPrice;
	}

}
