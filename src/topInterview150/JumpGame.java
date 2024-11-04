package topInterview150;

/*
 * 55. Jump Game
Solved
Medium
Topics
Companies

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

 

Constraints:

    1 <= nums.length <= 104
    0 <= nums[i] <= 105


 */

public class JumpGame {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length - 1;
        int farthest = 0;

        for(int i = 0; i < nums.length; i++){
            if (i > farthest) { // we can provide analysis from this index because we cannot reach it
                return false;
            }

            farthest = Math.max(farthest, i + nums[i]); // setting current farthest by checking current i with previous furthest
            if (farthest >= lastIndex){ // do not have to go through whole loop if we can already reach lastIndex
                return true;
            }
        }

        return true;
    }
}
