
/**
 * Write a description of class fib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fib
{
    public static void main(String args[]){
        
        System.out.println(fibber(11));
        
        
    }
    public static int fibber(int n){
        if (n==0){
            return 0;
            
        }
        else if(n == 1){
            return 1;
            
        }
        else{
            return fibber(n-1) + fibber(n-2);
            
        }
        
    }
}
