
/**
 * Write a description of class Problem9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem9
{
    private static int m = 1;
    private static int n = 2;    
    private static int a = n;
    private static int b = ((n*n)-1)/2;
    private static int c = ((n*n)+1)/2;
    //private static int n = 2;
    public static void main(String args[]){
        System.out.println("start");
        while(true){
            if(a+b+c == 70){
                break;
            }
            //if(a+b+c > 30){
                //System.out.println("whoops at " + n + "," + m);
                n++;
                m++;
            //}
            a = n;
            b = ((n*n)-1)/2;
            c = ((n*n)+1)/2;
        }
        System.out.println(a + "," + b + "," + c);
    }

}
