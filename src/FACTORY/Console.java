package FACTORY;

public class Console {

	private CompFactory compFactory = new CompFactory();
	
	Component comp1;
	Component comp2;
	Component comp3;
	
	void withoutFactory() {
		// ���丮 ������ ���� �ʰ� ��ưŬ������ �����ڳ�, �޼ҵ带 �����Ϸ� �Ҷ�, ��� �ν��Ͻ� ���� �ڵ带 �����ؾ��Ѵ�.
		// ������� ��ư Ŭ������ �����ڿ� �Ҹ��� ���� ���ڷ� �ް� �ϵ��� �������� ���Դٰ� �����غ���. => to component
		comp1 = new Button();
		comp1 = new Switch();
		comp1 = new Dropdown();
	}
//
	void withFactory() {
		// TODO Auto-generated method stub
		comp1 = compFactory.getComp(Usage.PRESS);
		comp1 = compFactory.getComp(Usage.TOGGLE);
		comp1 = compFactory.getComp(Usage.EXPAND);
		System.out.println(compFactory instanceof Object);
		
	}
}
enum Usage {
	PRESS, TOGGLE, EXPAND
}
