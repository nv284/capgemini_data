package pack.cap.module4.accessM;

public class Demo_A {
	
	  private int data = 50;
	  String name ; int age ;
	  int cardNo = 120;
	  
	

	protected void dispName() {
		  System.out.println("I am a protected method ");
	  }
       
         private Demo_A(int data, String name, int age) {
		super();
		this.data = data;
		this.name = name;
		this.age = age;
	}

		private void call() {
	        System.out.println("Hello Access Modifiers !!!");
	        System.out.println("Name :"+name );
	        System.out.println("Age :"+age);
	        System.out.println("Data : "+data);
                    }
			
			 public static void main(String[] args) 
			   {
				 Demo_A a1 = new Demo_A(200, "Private Modifier ", 20);
				 a1.call();
			   }
			   }
