package topInterview150;

import java.util.HashMap;

/*
 * 219. Contains Duplicate II
Solved
Easy
Topics
Companies

Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

 

Constraints:

    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
    0 <= k <= 105


 */

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> previousStuff = new HashMap<>(); //hashmap (value, index)

        for(int i = 0; i < nums.length; i++){
            if(previousStuff.containsKey(nums[i])){ // if we have seen this number before
                int j = previousStuff.get(nums[i]);
                if( (i - j) <= k){
                    return true;
                }
            }

            previousStuff.put(nums[i], i);
        }

        return false;
    }
}
