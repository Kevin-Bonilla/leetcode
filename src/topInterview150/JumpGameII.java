package topInterview150;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumpCounter = 0;
        int target = nums.length - 1;
        int farthest = 0;
        int currentEnd = 0;


        if(target == 0){ // if array is only 1 digit
            return 0;
        }

        for (int i = 0; i < nums.length ; i++){
            farthest = Math.max(farthest, nums[i] + i); //calculating furthest from our current index

            //jump logic
            if (farthest >= target){ // if we can already reach our target nums[n-1]
                jumpCounter++;
                return jumpCounter;
            }
            if(i == currentEnd){ // if we have made it as far as we currently can we need to jump to give further calculations
                jumpCounter++;
                currentEnd = farthest;
            }
        }

        return jumpCounter;
    }
}
