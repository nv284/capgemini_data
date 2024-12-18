package pack.cap.module8.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamExample {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(DataOutputStream datOut = new DataOutputStream( new FileOutputStream("D://data.bin"))){
			datOut.writeInt(123);
			datOut.writeDouble(4566.78);
			datOut.writeBoolean(true);
			datOut.writeUTF("Hello , datainputstream! ");
			System.out.println("Data written successfully !");
		}catch (Exception e) {
			// TODO: handle exception
		}
		try (DataInputStream  din = new DataInputStream(new FileInputStream("D://data.bin"))){
			
			int intVal = din.readInt();
			double doubleVal = din.readDouble();
			String s = din.readUTF();
			System.out.println("read data");
			System.out.println("Int :"+ intVal);
			System.out.println("Double :"+ doubleVal);
			System.out.println("String : "+s);
			
					
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}