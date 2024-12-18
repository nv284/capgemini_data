package pack.cap.module8.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
try {
	Reader r = new FileReader("D:\\sample.txt");
	
	int data = r.read();
	while(data != -1) {
		System.out.print((char)data);
		data= r.read();
	}
	System.out.println("\n");
	System.out.println("Dose sample.txt support mark operation : "+r.markSupported());
	r.close();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


try {
	Writer w = new FileWriter("D:\\sample.txt");
	String data = " Java Input/Output stream ";
	w.write(data);
	w.append("Hello ");
	w.close();
	System.out.println("Written !");
	
}catch (IOException e) {
	// TODO: handle exception
	e.printStackTrace();
}
	}

}