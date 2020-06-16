package Strategy;

// 신선도나 낮은 상품만 가격을  10% 할인해 준다.
public class NormalGuestDiscountStrategy implements DiscountStrategy{

	@Override
	public Double getDiscountPrice(Item item) {
		double calculatedPrice = 0;
		if(!item.isFresh()) {
			System.out.println("이때 할인해줍니당");
			calculatedPrice = item.getPrice() * 0.9;
		}else {
			calculatedPrice = item.getPrice();
		}
		System.out.println(item.getName() +" 까지 사는데" + calculatedPrice +" 썻습니다.");
		return calculatedPrice;
	}
	
}
