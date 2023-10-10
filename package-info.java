package arrayexample;

public class arrayexample {
    public static Void main(String[] args) {
        int[] A1 = new int[10];

        int count = 1;

        for(int i=0 ; i<A1.length; i++){
            A1[i] = count;
            count++ ; 

            
        }
        for(int j=0 ; j<A1.length ; j++){
            System.out.println(A1[j] + "" );
        }
        return null;
        
    }
        
}