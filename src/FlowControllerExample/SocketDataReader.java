package FlowControllerExample;

//public class SocketDataReader {
public class SocketDataReader implements ByteSource{
	@Override
	public byte[] read() {
		System.out.println("���Ϲ������ �о ����Ʈ �������� ������ �ּ���");
		byte[] a = {1,2,3};
		return a;
	}
}
