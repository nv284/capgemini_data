package pack.cap.module8.io;

import java.io.File;

import java.io.PrintWriter;

public class PrintWriterAndReaderclass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "D:\\sample.txt";
try {
	
	PrintWriter w = new PrintWriter(new File(s));
	w.println(" Hello this is example of printwriter ");
	w.print("This is one more line ");
	
	w.printf("This is a formatted number : % .2f", 156.456789);
	w.close();
	System.out.println("Writing to the file ' "+s +" ' completed ");
	
	
}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
	}

}