package Strategy.yalcoafter;

public interface SearchStrategy {
	public void search();
}

class AllSearchStrategy implements SearchStrategy {

	@Override
	public void search() {
		System.out.println("��ü�˻��� ���� ����");
		System.out.println("��ü�˻�!");
	}
}
class NewsSearchStrategy implements SearchStrategy {
	
	@Override
	public void search() {
		System.out.println("�����˻��� ���� ����");
		System.out.println("�����˻�!");
	}
}
class MapSearchStrategy implements SearchStrategy {
	
	@Override
	public void search() {
		System.out.println("�����˻��� ���� ����");
		System.out.println("�����˻�!");
	}
}
