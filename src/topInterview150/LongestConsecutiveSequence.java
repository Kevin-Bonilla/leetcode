package topInterview150;

import java.util.HashSet;
/*
 * 128. Longest Consecutive Sequence
Solved
Medium
Topics
Companies

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

 

Constraints:

    0 <= nums.length <= 105
    -109 <= nums[i] <= 109


 */

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int maxSequence = 1;
        HashSet<Integer> setNums = new HashSet<>();

        if(nums.length == 0){ // if array is empty
            return 0;
        }

        // loop adds all to the HashSet
        for (int i = 0; i < nums.length; i++){ 
            setNums.add(nums[i]);
        }

        // this loop goes through all nums in setNums and sees sequence length
        for (int currentValue : setNums){
            int currentSequence = 1;
            //int currentValue = nums[i];
            // setNums.add(currentValue);
            
            if (!setNums.contains(currentValue - 1) && setNums.contains(currentValue + 1)){ // if value is start of a sequence and nothing is before it
                int seqValue = currentValue + 1;
                currentSequence++;

                while(setNums.contains(seqValue + 1)){
                    seqValue++;
                    currentSequence++;
                    //System.out.println("looper"); //debugger
                }

                if (currentSequence > maxSequence){
                    maxSequence = currentSequence;
                }
            }
        }
        
        return maxSequence;
    }
}
