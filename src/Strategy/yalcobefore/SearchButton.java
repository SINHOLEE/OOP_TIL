package Strategy.yalcobefore;

import Strategy.yalcocommon.Mode;

public class SearchButton {
	private Myprogram myprogram;
	
	public SearchButton(Myprogram myprogram) {
		this.myprogram = myprogram;
	};
	
	public void onClick() {
		if (this.myprogram.getMode() == Mode.ALL) {
			System.out.println("��ü�˻��� ���� ����");
			System.out.println("��ü�˻�!");
		} else if (this.myprogram.getMode() == Mode.NEWS) {
			System.out.println("�����˻��� ���� ����");
			System.out.println("�����˻�");	
		} else if (this.myprogram.getMode() == Mode.MAP) {
			System.out.println("�����˻��� ���� ����");
			System.out.println("�����˻�");	
		} else if (this.myprogram.getMode() == Mode.IMAGE) {
			System.out.println("�̹����˻��� ���� ����");
			System.out.println("�̹����˻�");	
		} else if (this.myprogram.getMode() == Mode.SONG) { // 4. �뷡�˻��� �߰��Ѵ�.
			System.out.println("�̹����˻��� ���� ����");
			System.out.println("�뷡 �˻�~~~�߰���~");	
		}
	}
}
