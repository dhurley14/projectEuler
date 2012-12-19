
/**
 * Write a description of class fix34 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fix34
{
    private static int[] numbers = {3, 2, 2, 4};

    public static void main(String args[]){
        fixit(numbers);
        for(int i = 0; i<numbers.length; i++){

            System.out.println(numbers[i]);
        }

    }

    public static int[] fixit(int[] nums) {
        //
        int threePos = -1;
        int followingFourPos = -1;
        //loop through to find threePos, and if there is a fourPos after it, swap it with what immediately follows the three. then reset threepos to zero, as well as fourpos
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 3){
                threePos = i;
            }
            if(nums[i] == 4){
                followingFourPos = i;
            }
            // swap the two
            if(followingFourPos > -1 && threePos >-1){
                int temp = nums[threePos + 1];
                nums[threePos + 1] = nums[followingFourPos];
                nums[followingFourPos] = temp;
                threePos = -1;
                followingFourPos = -1;
            }

        }
        return nums;
    }
}
