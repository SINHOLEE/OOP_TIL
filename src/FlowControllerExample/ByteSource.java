package FlowControllerExample;

// 공통되는 속성을 추상화 하여 FileDataReader와 SocketDataReader에 상속시켜 사용해보겠습니다. 
public interface ByteSource {
	public byte[] read();
}
