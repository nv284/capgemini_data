package pack.cap.module8.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fis = new  FileInputStream("D:\\jenkins_command.txt");
	
	int value = fis.read();
	System.out.println("reading a value in byte from "+ value);
	System.out.println((char)value);
	fis.close();
	
	
	//=============================
	String path ="D:\\sample.txt";
	File file = new File(path);
	
	if(!file.exists()) {
		if(file.createNewFile()) {
			System.out.println("File created successfully"+path);
		}else {
			System.out.println("Failed to create the file ");
			return ;
		}
	}
	//writing the data into the created file 
	FileOutputStream fos = new FileOutputStream(file );
	String content = " Hello this is a sample txt file in D: drive , we are learning Java input/output operation "; 
	fos.write(content.getBytes());
	System.out.println("Data written successfully!!!");
	
	// Read data from the file using fileInputStream 
	FileInputStream fin = new FileInputStream(file);
	int character ; 
	System.out.println("\n reading data from the file ");
	while((character = fin.read()) != -1 ) {
		System.out.print((char) character );
	}
	
}catch(Exception e ) {
	System.out.println(e);
}
	}

}
