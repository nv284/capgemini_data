package pack.cap.module7.inter;

public class JavaUpdate implements Java8interface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      JavaUpdate java = new JavaUpdate();
      java.calculate(2, 2, 0);
      java.call();//default 
      Java8interface.pay();//static 
	}

	@Override
	public void calculate(int x, int y, int z) {
		// TODO Auto-generated method stub
		z = (x*x)+(y*y)+(2*x*y);
		System.out.println(z);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		Java8interface.super.call();
		System.out.println(" Update somthing on default ");
	}
	

}
