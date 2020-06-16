package Strategy.yalcoafter;

public interface SearchStrategy {
	public void search();
}

class AllSearchStrategy implements SearchStrategy {

	@Override
	public void search() {
		System.out.println("전체검색을 위한 로직");
		System.out.println("전체검색!");
	}
}
class NewsSearchStrategy implements SearchStrategy {
	
	@Override
	public void search() {
		System.out.println("뉴스검색을 위한 로직");
		System.out.println("뉴스검색!");
	}
}
class MapSearchStrategy implements SearchStrategy {
	
	@Override
	public void search() {
		System.out.println("지도검색을 위한 로직");
		System.out.println("지도검색!");
	}
}
