package topInterview150;

/*
 * 35. Search Insert Position
Solved
Easy
Topics
Companies

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

 

Constraints:

    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104


 */

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        // target is the value we are looking for inside of nums
        // works because the nums is sorted
        // use binary search to complete the problem

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){ // target is greater than our mid value (target must be on right side of mid)
                left = mid + 1;
            }
            else{ // target is less than our mid value (target must be on left side of mid)
                right = mid - 1;
            }
        }
        
        return left; // if target is never found left will give the index where target can be inserted
    }
}
