
/**
 * Write a description of class ProjectEuler here.
 * 
 * @author Devin Hurley 
 * @version Project Euler Problem 1
 */
public class ProjectEuler
{
    // instance variables - replace the example below with your own
    private int x;
    private static final int CEILING = 1000;
    

    /**
     * Constructor for objects of class ProjectEuler
     */
    public ProjectEuler()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main(String[] args){
        int sum = 0;
        for(int i = 0; i<CEILING; i++){
            if(i%3 == 0 || i%5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        
    }
}
