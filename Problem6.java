package Problem6;

/**
 * My answer to problem 6 of
 * Project euler
 * @author Devin Hurley
 * @version 07/12/2012
 */
public class Problem6{
    public static void main(String args[]){
        System.out.println(sumOfSquares(100L));
        System.out.println(squareOfSums(100L));
        System.out.println(squareOfSums(100L) - sumOfSquares(100L));
    }
    
    private static long sumOfSquares(long n){
        long sum = 0;
        
        for(long i = 0; i<=n; i++){
            sum = i*i + sum;
        }
        
        return sum;
        
    }
    
    private static long squareOfSums(long n){
        long mySum = 0;
        
        for(long j = 0; j<=n; j++){
            mySum = j + mySum;
        }
        
        return (mySum*mySum);
        
    }
}
