package PCpackage;

public class FileBufferRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileBuffer filebuffer = new FileBuffer("buffer.txt", 10);
		
		Thread PT = new Thread(() -> filebuffer.produce());
		Thread CT = new Thread(() -> filebuffer.consume());
		
		PT.start();
		CT.start();
	}

}
