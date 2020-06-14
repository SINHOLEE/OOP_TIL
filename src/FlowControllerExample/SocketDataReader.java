package FlowControllerExample;

//public class SocketDataReader {
public class SocketDataReader implements ByteSource{
	@Override
	public byte[] read() {
		System.out.println("소켓방법으로 읽어서 바이트 형식으로 리턴해 주세요");
		byte[] a = {1,2,3};
		return a;
	}
}
