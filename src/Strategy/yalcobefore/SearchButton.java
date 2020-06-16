package Strategy.yalcobefore;

import Strategy.yalcocommon.Mode;

public class SearchButton {
	private Myprogram myprogram;
	
	public SearchButton(Myprogram myprogram) {
		this.myprogram = myprogram;
	};
	
	public void onClick() {
		if (this.myprogram.getMode() == Mode.ALL) {
			System.out.println("전체검색을 위한 로직");
			System.out.println("전체검색!");
		} else if (this.myprogram.getMode() == Mode.NEWS) {
			System.out.println("뉴스검색을 위한 로직");
			System.out.println("뉴스검색");	
		} else if (this.myprogram.getMode() == Mode.MAP) {
			System.out.println("지도검색을 위한 로직");
			System.out.println("지도검색");	
		} else if (this.myprogram.getMode() == Mode.IMAGE) {
			System.out.println("이미지검색을 위한 로직");
			System.out.println("이미지검색");	
		} else if (this.myprogram.getMode() == Mode.SONG) { // 4. 노래검색을 추가한다.
			System.out.println("이미지검색을 위한 로직");
			System.out.println("노래 검색~~~추가함~");	
		}
	}
}
