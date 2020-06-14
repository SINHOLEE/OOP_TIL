package FlowControllerExample;

public class DataApplication {
	public static void main(String[] args) {
		// 기존 파일데이터리더만 있을경우
//		FlowController controller = new FlowController();
//		controller.process();
		
		// 만약 소켓을 통해서 데이터를 읽게 해달라는 요청이 있다면 ... 팩토리 패턴을 적용하지 않은 
		// socket으로 왔을 경우
//		FlowController controller = new FlowController(false);
//		controller.process();
//		System.out.println();
//		// file형식으로 왔을경우
//		FlowController controller2 = new FlowController(true);
//		controller2.process();

		// Factory 패턴 적용하면 맨처음에 사용했던, 생성자에 boolean 인자를 받는것을 없앨 수 있다.
		FlowController controller = new FlowController();
		controller.process();
		System.out.println();
		}	
}
