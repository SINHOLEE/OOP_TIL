package FlowControllerExample;

import java.util.ArrayList;

public class ByteSourceFactory {
	public ByteSource create() {
		if (useFile()) {
			return new FileDataReader();
		} else {
			return new SocketDataReader();
		}
	}
	
	private boolean useFile() {
		String useFileVal = System.getProperty("useFile");
		return useFileVal != null && Boolean.valueOf(useFileVal);
	}
	
	// multi Thread ȯ�濡�� ���� �⺻��� ������ jvm�� �����ɶ� �̹� �ν��Ͻ��� ���� �ö󰣴�. 
	// �̸� �ؼ��ϱ� ���� lazyHolder��� ������� ����ȭ�� �õ��� ����.
//	private static ByteSourceFactory instance = new ByteSourceFactory();
//	public static ByteSourceFactory getInstance() {
//		return instance;
//	}
	// lazyHolder ����� �̱��� ����
	private ByteSourceFactory() {}
	public static ByteSourceFactory getInstance() {
		return LazyHolder.INSTANCE;
	}
	private static class LazyHolder{
		private static final ByteSourceFactory INSTANCE = new ByteSourceFactory();
	}
	
}
