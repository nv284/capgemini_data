package pack.cap.module6.Arr;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String[] department = {"electronics" , "CS" , "IT"}; //Array of department 
  
  int dept , st , sc , total = 0;
  double per = 0;
  
  //3D array to store scores for each department , student  nd subject 
  int [][][] scores = { // scores[0] [0][0]=75
		  {{75,87,69},{90,87,85},{56,67,76}},//electronics 
		  {{78,67,75},{87,98,76},{67,56,66}},//cs
		  {{72,63,72},{80,90,70},{64,56,67}}//IT
  };
  //iterate through department 
  for(dept=0 ; dept<3 ; dept++) {
	  // loop through student 
	  for(int i =0 ;i<3;i++) {
		  //print the department name 
		  System.out.println("Dapartment "+department[i] +":");
		  //loop through the student's scores 
		  for(st =0 ; st<3 ;st++) {
			// Display student number and their scores
			  System.out.println("Student"+(st+1)+" scores");
			 
			  for(sc=0;sc<3;sc++) {
				  //print the each subject's scors 
				  System.out.print(scores[dept][st][sc]+"  ");
				  total += scores[dept][st][sc];
				
			  }
			  per =(double) total/3;
			  System.out.println("\n Total scores : "+ total);
			  System.out.println("Percentage :"+per);
			  total =0;
			  
		  }
		  System.out.println();
		  
	  }
	  break;
  }
  
	}

}
