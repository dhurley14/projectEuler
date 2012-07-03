/**
 * Problem 2 from project Euler. 
 * 
 * @author Devin Hurley 
 * @version (a version number or a date)
 */
public class Problem2
{

    /**
     * Constructor for objects of class Problem2
     */
    public Problem2()
    {
        // initialise instance variables

    }

    public static void main(String[] args){
        long count = 0;
        long i,a=1,b=1,c=0,t = 4000000;
        for(i=0;i<t-2;i++) {
            c=a+b;
            a=b;
            b=c;
            if(c < 4000000){
                if(c%2.0 == 0){
                    count = c+ count;
                }
            }else{
                break;
            }
        }
        System.out.println(" The sum of evens is: " + count);
    }
}

