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
	public void setModeSong() {this.mode = Mode.SONG;} // 3. �� �� �ٲٰ�
	
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
		
		// 1. ���⼭ ���ο� �뷡�˻������ �߰��Ѵٸ�? 
		// 5. �뷡�˻� ��� ���
		this.setModeSong();
		searchButton.onClick();
		
		// ���� �ǵ� ������ searchButton�� �����߰�, Myprogram�� �Ǳ׷Ȱ�, ������ϱ��� �ǵ�ȴ�.
		// �̴� ���� ��� ��Ģ�� �����ϴ� ������ �����̴�.
		// ��? ���������� ���������� searchButton�� onClick() �޼��带 �����ؾ��ϱ� �����̴�.
		// �� �� �ۼ��� �޼���� ���

		
	}
}
