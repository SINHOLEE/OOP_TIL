package FACTORY;

abstract class Component {
	protected abstract String getCompName();
	public Component() {
		System.out.println(this.getCompName() + "����");
	}
}

class CompFactory {
	// �� �����ڰ� ����
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
		return "��ư";
	}
}
class Switch extends Component{
	@Override
	protected String getCompName() {
		return "����ġ";
	}
}
class Dropdown extends Component{
	@Override
	protected String getCompName() {
		return "��Ӵٿ�";
	}
}