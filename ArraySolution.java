package arrayexample;

public class ArraySolution {

	public static void main(String[] args) {
		
		//int[] A1 = new int[10];

        //int count = 1;

        //for(int i=0 ; i<A1.length; i++){
           // A1[i] = count;
           // count++ ; 

            
        //}
        //for(int j=0 ; j<A1.length ; j++){
          //  System.out.print(A1[j] + "  " );
            
		int[][] a2 = new int[9][10];
		
		int count = 1; 
		
		for(int i=0 ; i<a2.length ; i++) {
			for(int j=0 ; j<a2.length ; j++) {
				a2[i][j]= count;
				count++;
				
			}
				
            
        }
		for(int i=0 ; i<a2.length ; i++) {
		
			for(int j=0 ; j<a2.length ; j++) {
				System.out.print(a2[i][j] + " ");
			}
			System.out.println();
			
		}
        
    
		// TODO Auto-generated method stub

	}

}
