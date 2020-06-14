package FlowControllerExample;

//public class FileDataReader {

public class FileDataReader implements ByteSource{ //바이트 타입데이터를 다루는 공통되는 부분을 상속받는다.
	
	@Override
	public byte[] read() {
		// TODO Auto-generated method stub
		byte[] a = {1,2,3};
		System.out.println("file으로 읽어서 바이트 형식으로 리턴해 주세요");
		return a;
	}

}
