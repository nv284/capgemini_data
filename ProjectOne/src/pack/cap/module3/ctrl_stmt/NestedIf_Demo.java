package pack.cap.module3.ctrl_stmt;

public class NestedIf_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20, y = 30, z = 10;
		
		if(x==20) {
			if(y<50) {
				System.out.println("ABC");
		        	}
		 	   if(z>30)
				    System.out.println("DEF");
			   else
				    System.out.println("PQR");
		}
		else {
			System.out.println("XYZ");
		}
	}

}