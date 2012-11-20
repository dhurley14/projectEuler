package Problem7;

import java.util.ArrayList;
import java.lang.Math;

/**
 * My Answer to PE
 * Problem 7
 * 
 * @author Devin Hurley
 * @version 07/12/2012
 */
public class Problem7{
    public static void main(String args[]){
        long[] myArray = new long[10000];
        long count = 0;

        for(int i = 0; i<10000L; i++){

            if(isPrime(i)){
                myArray[i] = i;
                count++;
            }
            else{
                myArray[i] = 0;
            }
        }
        for(int j = 0; j<myArray.length; j++){
            System.out.println(myArray[j]);

        }
    }

    private static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }

}