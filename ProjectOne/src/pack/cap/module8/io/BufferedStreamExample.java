package pack.cap.module8.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String filePath = "D://sample.txt";
try(BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream(filePath))){
	String  content = (" This is a test content for Buffered OutputStream in Java .\n It will be read back using  BufferedInputStream.");
	bos.write(content.getBytes());
	bos.flush();//ensure all the data is rwritten to the file 
	System.out.println(" Data written to the file successfully using bufferedstream ");
	
}catch (Exception e) {
	// TODO: handle exception
}

try(BufferedInputStream bis = new BufferedInputStream( new FileInputStream(filePath))){
	 int byteData;
	 System.out.println("\n Reading data from the file using bufferedinputstream ");
	 while((byteData = bis.read()) != -1) {
		 System.out.print((char)byteData);
	 }
	
	
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
