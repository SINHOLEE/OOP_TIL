package FACTORY;

public class Console {

	private CompFactory compFactory = new CompFactory();
	
	Component comp1;
	Component comp2;
	Component comp3;
	
	void withoutFactory() {
		// 팩토리 패턴을 쓰지 않고 버튼클래스의 생성자나, 메소드를 변경하려 할때, 모든 인스턴스 생성 코드를 변경해야한다.
		// 예를들어 버튼 클래스의 생성자에 불리언 값을 인자로 받게 하도록 변경사랑이 들어왔다고 생각해보자. => to component
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
