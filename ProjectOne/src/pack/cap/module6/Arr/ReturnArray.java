package pack.cap.module6.Arr;

public class ReturnArray {
	//passing array to methods 
	void show (int x[] []) {
		int i , j ;
		System.out.println("Matrix x :");
		for(i=0 ; i<x.length ; i++) {
			for( j=0 ; j<x.length ; j++) {
				System.out.print(x[i][j]);
				System.out.println();
			}
		}
	}
	
	
	//dynamically created array 
	public static int[] genrateArray(int n ) {
		int [] resultArray = new int[n];
		
		for(int i = 0 ;i<n ; i++) {
			resultArray[i] = i*10;
		}
		return resultArray;
	}
	
	public static int[] createArray() {
		int [] num = {1,2,3,4,5};
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] returnArray = createArray();
        System.out.println("returned array ");
        for(int i : returnArray) {
        	System.out.println(i+ " ");
        }
        	
        	int [] genrateArray = genrateArray(5);
        	System.out.println("generated Array ");
        	 for(int i1 : genrateArray) {
             	System.out.println(i1+ " ");}
             	
             	int x[][] = {{1,2},{3,4}};
             	ReturnArray obj = new ReturnArray();
             	obj.show(x);
        }
	}

	

	
