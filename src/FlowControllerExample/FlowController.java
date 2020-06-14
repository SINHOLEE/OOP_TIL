package FlowControllerExample;


public class FlowController {
	// ���� ������ ��û�� �ޱ� ��
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
	
	
	//2.  ���ϵ����� ó�� ��û�� ���� ��
//	private boolean useFile;
//	public FlowController(boolean useFile) {
//		this.useFile = useFile;
//	}
	
	public void process() {
		// useFile�̶�� �Ҹ��� ���� �߰��ϸ鼭 ��Ʈ�ѷ��� �ڵ尡 ����Ǿ���. �̷��� �ȵ�..?
		// ���������� ������ �����ΰ��� �д´ٴ� ������ ���������� �����ϱ� ������ ������ �Ӽ��� �����ؼ� �߻�ȭ �غ���.
		
		// 1. ���⼭
//		byte[] data = null;
//		if (useFile) {
//			FileDataReader reader = new FileDataReader();
//			data = reader.read();			
//		} else {
//			SocketDataReader reader = new SocketDataReader();
//			data = reader.read();			
//		}
		// ��������� ByteSource�������̽��� ����ϱ� ��

		// 2. ���⼭���ʹ� ByteSource �������̽� ����� ��
//		ByteSource source = null;
//		if (useFile) {
//			source = new FileDataReader();
//		} else {
//			source = new SocketDataReader();
//		}
//		byte[] data = source.read();
		// ��������� byteSource�������̽� �����
		// ByteSource �� ������ ����Ǵ��� FlowCotroller�� ������� �ʵ��� �ϰ�ʹ�... 
		// ���� ����� ������ flowController�� ���� ������ �ݿ��Ǿ�� �Ѵ�. �̸� �ؼ��ϱ� ���� Factory ������ ����Ѵ�.
		
		// Factory pattern?? ByteSourceŸ���� ��ü�� �����ϴ� ����� ���� ��ü�� �и��� �� �� ��ü�� ����ؼ� bytesource ����
		
		// Factory ���� ����
		// �̷��� ������ ���, FlowController������ � dataType�� reader�� �߰��Ǿ ���� �Ű澲�� �ʰ� �ش� 
		// ������ ������ �� �ִ�...	
		ByteSource source = ByteSourceFactory.getInstance().create();
		byte[] data = source.read();
		 		
		Encryptor encryptor = new Encryptor();
		byte[] encryptedData = encryptor.encrypt(data);
		
		FileDataWriter writer = new FileDataWriter();
		writer.write(encryptedData);
	}
	
}
