
/**
 * Write a description of class Problem10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem10
{
    public static void main(String[] args){
        System.out.println(isPrime(212637));
        //long sum = 0;
        //for(long j = 200000; j>0; j--){
        //    if(isPrime(j)){
        //        sum = sum + j;
        //    }

        //  }
        //System.out.println("final sum: " + sum);

    }

    private static boolean isPrime(long num){

        for(double i = num-1; i> 0; i--){
            if(i == 1){
                return true;
            }
            if(num%i == 0.0){
                break;
            }
        }
        return false;
    }
}
