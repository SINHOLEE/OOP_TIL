package FACTORY;

abstract class Component {
	protected abstract String getCompName();
	public Component() {
		System.out.println(this.getCompName() + "생성");
	}
}

class CompFactory {
	// 왜 생성자가 없냐
	public Component getComp(Usage usage) {
		if (usage == Usage.PRESS) {
			return new Button();
		}
		else if (usage == Usage.TOGGLE) {
			return new Switch();
		}
		else {
			return new Dropdown();
		}
	}
}


class Button extends Component{
	@Override
	protected String getCompName() {
		return "버튼";
	}
}
class Switch extends Component{
	@Override
	protected String getCompName() {
		return "스위치";
	}
}
class Dropdown extends Component{
	@Override
	protected String getCompName() {
		return "드롭다운";
	}
}