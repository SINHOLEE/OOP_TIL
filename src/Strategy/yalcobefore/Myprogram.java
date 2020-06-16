package Strategy.yalcobefore;

import java.time.chrono.ThaiBuddhistEra;

import Strategy.yalcocommon.Mode;

public class Myprogram {

	private SearchButton searchButton = new SearchButton(this);
	
	public Mode mode = Mode.ALL;
	
	public void setModeAll() {this.mode = Mode.ALL;}
	public void setModeNews() {this.mode = Mode.NEWS;}
	public void setModeMap() {this.mode = Mode.MAP;}
	public void setModeImage() {this.mode = Mode.IMAGE;}
	public void setModeSong() {this.mode = Mode.SONG;} // 3. 셋 송 바꾸고
	
	public Mode getMode() {
		return this.mode;
	}
	
	public void testProgram() {
		setModeAll();
		this.searchButton.onClick();
		setModeNews();
		this.searchButton.onClick();
		setModeAll();
		this.searchButton.onClick();
		setModeMap();
		this.searchButton.onClick();
		
		// 1. 여기서 새로운 노래검색기능을 추가한다면? 
		// 5. 노래검색 기능 사용
		this.setModeSong();
		searchButton.onClick();
		
		// 내가 건든 파일은 searchButton도 수정했거, Myprogram도 건그렸고, 모드파일까지 건드렸다.
		// 이는 개방 폐쇄 원칙을 위반하는 형태의 변경이다.
		// 왜? 수정사항이 있을때마다 searchButton의 onClick() 메서드를 수정해야하기 때문이다.
		// 한 번 작성한 메서드는 기능

		
	}
}
