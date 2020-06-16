package Strategy.yalcoafter;

import Strategy.yalcocommon.Mode;
import Strategy.yalcoafter.SearchButton;

public class MyProgram {
	private SearchButton searchButton = new SearchButton(this);
	
	public void setModeAll() {
		searchButton.setSearchStrategy(new AllSearchStrategy());
	}
	public void setModeNews() {
		searchButton.setSearchStrategy(new NewsSearchStrategy());
	}
	public void setModeMap() {
		searchButton.setSearchStrategy(new MapSearchStrategy());
	}
	
	public void testProgram() {
		searchButton.onClick();
		this.setModeMap();
		searchButton.onClick();
		this.setModeNews();
		searchButton.onClick();
		this.setModeMap();
		searchButton.onClick();
	}
}
