package topInterview150;

/*
 * 189. Rotate Array
Solved
Medium
Topics
Companies
Hint

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

 

Constraints:

    1 <= nums.length <= 105
    -231 <= nums[i] <= 231 - 1
    0 <= k <= 105

 

Follow up:

    Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
    Could you do it in-place with O(1) extra space?


 */

public class RotateArray {

    public void rotate(int[] nums, int k) {
        // k = how many steps to the right we move
        // int max = nums.length - 1; // max index value during comparisons

        int numsLength = nums.length;
        k = k % numsLength; // k = reassingment value| k remains the same if smaller than length but if k > length  reassign k

        int[] solution = new int[numsLength];

        // make place holder array with all correct values
        for(int i = 0; i < numsLength; i++){
            int newIndex = (i + k) % numsLength; //current index(i) + reassignment value(k) % numsLength when value is greater than array length
            solution[newIndex] = nums[i];
        }

        // reassign original array
        for(int i = 0; i < numsLength; i++){
            nums[i] = solution[i];
        }

    }
}
