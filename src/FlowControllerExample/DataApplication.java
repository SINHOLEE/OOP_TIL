package FlowControllerExample;

public class DataApplication {
	public static void main(String[] args) {
		// ���� ���ϵ����͸����� �������
//		FlowController controller = new FlowController();
//		controller.process();
		
		// ���� ������ ���ؼ� �����͸� �а� �ش޶�� ��û�� �ִٸ� ... ���丮 ������ �������� ���� 
		// socket���� ���� ���
//		FlowController controller = new FlowController(false);
//		controller.process();
//		System.out.println();
//		// file�������� �������
//		FlowController controller2 = new FlowController(true);
//		controller2.process();

		// Factory ���� �����ϸ� ��ó���� ����ߴ�, �����ڿ� boolean ���ڸ� �޴°��� ���� �� �ִ�.
		FlowController controller = new FlowController();
		controller.process();
		System.out.println();
		}	
}
