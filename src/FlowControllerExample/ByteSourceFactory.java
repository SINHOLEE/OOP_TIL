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
	
	// multi Thread 환경에서 쓰는 기본방법 하지만 jvm이 가동될때 이미 인스턴스가 힙에 올라간다. 
	// 이를 해소하기 위해 lazyHolder라는 방법으로 최적화를 시도해 본다.
//	private static ByteSourceFactory instance = new ByteSourceFactory();
//	public static ByteSourceFactory getInstance() {
//		return instance;
//	}
	// lazyHolder 방법의 싱글톤 패턴
	private ByteSourceFactory() {}
	public static ByteSourceFactory getInstance() {
		return LazyHolder.INSTANCE;
	}
	private static class LazyHolder{
		private static final ByteSourceFactory INSTANCE = new ByteSourceFactory();
	}
	
}
