import java.util.ArrayList;
/**
 * Write a description of class precompute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class precompute
{
    public static void main(String[] args){
        long n = 1;
        long adder = 1;
        long[] array = new long[2000000];
        array[0] = 2;
        while(n<2000000.0){
           array[n] = array[n-1] + adder;
            
        }
        
        
    }
}
