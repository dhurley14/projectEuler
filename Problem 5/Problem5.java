/**
 * Write a description of class Problem5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem5
{
    private static int num = 2520;
    private static int constant = 20;
    public static void main(String args[]){
        while(true){
            if(BoolRecurs(num, constant)){
                System.out.println(true);
                System.out.println(num);
                break;
            }
            num++;
        }

    }

    public static boolean BoolRecurs(int n, int k){
        if(n%k == 0 && k != 1){
            return BoolRecurs(n,k-1);
        }
        if(k == 1 && n%(k+1) == 0)
        {
            return true;
        }
        return false;

    }
}
