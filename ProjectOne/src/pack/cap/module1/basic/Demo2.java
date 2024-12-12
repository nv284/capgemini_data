package pack.cap.module1.basic;

public class Demo2 {
	public static void  main(String[] args) {
		int x=1;int y=2;int z=5;
		System.out.println("x :"+(!((x + 2) == (1 + 2)))); //false 
		System.out.println("y"+ (!(y==z)));//true
		System.out.println("z>x"+ (!((z>x))));//false 
		
		if(!(x==y)&&((y+5)>z)&&(!((z-3)==0))) {
			System.out.println("Hello");
			
			int hours = 5;  // current time 
			
			int doubledHourse = hours << 1;
			System.out.println(("After doubling hours (left shift by 1 ):"+ doubledHourse)); //
			
			int halvedHours = hours >> 1;
			System.out.println(" After halving hours (right shift)"+halvedHours);
			
			int negativeNumner = -16 ;
					int unsignedShift = negativeNumner >>>2 ;
					System.out.println("Unsigned right shift "+unsignedShift);
					/*   0011111111111111100 
					 * 15 = 00001111 ====> 00000011 
					 * 
					 * */
		}
		
	}
}
