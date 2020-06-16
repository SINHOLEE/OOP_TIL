package Strategy.yalcoafter;

public class SearchButton {
	private MyProgram myprogram;
	public SearchButton(MyProgram myprogram) {
		this.myprogram = myprogram;
	}
	
	private SearchStrategy strategy = new AllSearchStrategy();
	
	public void setSearchStrategy(SearchStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void onClick() {
		this.strategy.search();
	}
}
