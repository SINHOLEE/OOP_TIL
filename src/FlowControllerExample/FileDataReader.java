package FlowControllerExample;

//public class FileDataReader {

public class FileDataReader implements ByteSource{ //����Ʈ Ÿ�Ե����͸� �ٷ�� ����Ǵ� �κ��� ��ӹ޴´�.
	
	@Override
	public byte[] read() {
		// TODO Auto-generated method stub
		byte[] a = {1,2,3};
		System.out.println("file���� �о ����Ʈ �������� ������ �ּ���");
		return a;
	}

}
