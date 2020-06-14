package FlowControllerExample;


public class FlowController {
	// 소켓 데이터 요청을 받기 전
//	public void process() {
//		FileDataReader reader = new FileDataReader();
//		byte[] data = reader.read();
//		
//		Encryptor encryptor = new Encryptor();
//		byte[] encryptedData = encryptor.encrypt(data);
//		
//		FileDataWriter writer = new FileDataWriter();
//		writer.write(encryptedData);
//	}
	
	
	//2.  소켓데이터 처리 요청을 받은 수
//	private boolean useFile;
//	public FlowController(boolean useFile) {
//		this.useFile = useFile;
//	}
	
	public void process() {
		// useFile이라는 불리언 값을 추가하면서 컨트롤러의 코드가 변경되었다. 이러면 안돼..?
		// 공통적으로 리더가 무엇인가를 읽는다는 행위가 공통적으로 존재하기 때문에 공통의 속성을 추출해서 추상화 해보자.
		
		// 1. 여기서
//		byte[] data = null;
//		if (useFile) {
//			FileDataReader reader = new FileDataReader();
//			data = reader.read();			
//		} else {
//			SocketDataReader reader = new SocketDataReader();
//			data = reader.read();			
//		}
		// 여기까지는 ByteSource인터페이스를 사용하기 전

		// 2. 여기서부터는 ByteSource 인터페이스 사용한 것
//		ByteSource source = null;
//		if (useFile) {
//			source = new FileDataReader();
//		} else {
//			source = new SocketDataReader();
//		}
//		byte[] data = source.read();
		// 여기까지가 byteSource인터페이스 적용시
		// ByteSource 의 종류가 변경되더라도 FlowCotroller가 변경되지 않도록 하고싶다... 
		// 위의 방법은 여전히 flowController의 변경 사항이 반영되어야 한다. 이를 해소하기 위해 Factory 패턴을 사용한다.
		
		// Factory pattern?? ByteSource타입의 객체를 생성하는 기능을 별도 객체로 분리한 뒤 그 객체를 사용해서 bytesource 생성
		
		// Factory 패턴 적용
		// 이렇게 관리할 경우, FlowController에서는 어떤 dataType의 reader가 추가되어도 전혀 신경쓰지 않고 해당 
		// 로직을 유지할 수 있다...	
		ByteSource source = ByteSourceFactory.getInstance().create();
		byte[] data = source.read();
		 		
		Encryptor encryptor = new Encryptor();
		byte[] encryptedData = encryptor.encrypt(data);
		
		FileDataWriter writer = new FileDataWriter();
		writer.write(encryptedData);
	}
	
}
