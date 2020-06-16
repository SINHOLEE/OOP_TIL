package Strategy;

public class Item{
	private Double price;
	private String name;
	private boolean fresh;
	public Item(Double price, String name, boolean fresh) {
		this.name = name;
		this.price =price;
		this.fresh = fresh;
	}
	public Double getPrice() {
		return this.price;
	}
	public boolean isFresh() {
		return this.fresh;
	}
	public String getName() {
		return this.name;
	}
}