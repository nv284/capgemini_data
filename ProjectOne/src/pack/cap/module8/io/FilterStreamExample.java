package pack.cap.module8.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;

public class FilterStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath= "D:\\sample.txt";
		try {
			
			
			FileInputStream fis = new FileInputStream(filePath);
			
			FilterInputStream filter = new BufferedInputStream(fis);
			
			int availableBytes = filter.available();
			System.out.println("Initially , Available bytes :"+availableBytes); //25
			
			filter.read();
			filter.read();
			filter.read();
			
			int available = filter.available();
			System.out.println(" Available bytes after reading three bytes  :"+available);//22
			filter.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			FilterOutputStream filterout = new FilterOutputStream(fos);
			String s = "FilterOutPut stream is used to write the data into the files . it is a subclass of OutPutStreams ";
			byte[] b = s.getBytes();
			filterout.write(b);
			filterout.flush();
			filterout.close();fos.close();
			System.out.println("successfully written ......");
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
