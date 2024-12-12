package pack.cap.module3.ctrl_stmt;

public class WhileLoop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1 , num2 = 0;
		
		while(num <= 10) {
			if(num % 2==0) {
				num2 += num ;
			}num++;
		}
		System.out.println("Sum of the even numbers "+num2 );

		int row = 1 ;
		while(row <= 10) {
		     	int column = 1;
			     while (column <=10 ) {
				     int result = row*column ;
				       System.out.print(result +" \t");
				          column++;
			}
			System.out.println();
			row++;
			
		}
		
	}

}
