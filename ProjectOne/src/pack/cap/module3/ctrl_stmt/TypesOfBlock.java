package pack.cap.module3.ctrl_stmt;
/*
 * Local Block 
 * instance Block 
 * Static Block 
 * */
public class TypesOfBlock {

	
	int data ;
	{
		data= 500;
	}
	
       TypesOfBlock() {
		super();
		System.out.println("0-arg constructor ");
	}
       
       TypesOfBlock(int x ) {
   		
   		System.out.println("1-arg constructor ");
   	}
       
       //instance block 
       {
    	   System.out.println(" First Instance Block ...");
       }
       //instance block 
       {
    	   System.out.println(" Second Instance Block ...");
       }
       
       void disp() {
    	   System.out.println(data);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TypesOfBlock t = new TypesOfBlock();
        new TypesOfBlock(5);
        t.disp();
       
        
	}

}
