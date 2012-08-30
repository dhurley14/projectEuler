import java.util.ArrayList;
/**
 * Solution to Problem 4 from Project Euler
 * 
 * @author Devin Hurley
 * @version 08/30/2012
 */
public class Problem4
{
    public static void main(String[] args){
        System.out.println(isPal(9009));
        int biggestPal = 0;
        for(int j = 999; j>=0; j--){
            for(int k = 999; k>=0; k--){
                if(isPal(k*j)){
                    if(k*j > biggestPal){
                        biggestPal = k*j;
                        System.out.println(k*j);
                    }
                }
                
            }
        }
    }

    private static boolean isPal(int num){
        String toworkwith = Integer.toString(num);
        String toReturn = "";
        for(int i = toworkwith.length()-1; i>=0; i--){
            toReturn += toworkwith.charAt(i);
            //System.out.println(toReturn);
        }
        if(toworkwith.equals(toReturn)){
            return true;
        }

        return false;
    }
}
