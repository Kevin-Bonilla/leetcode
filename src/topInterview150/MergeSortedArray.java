package topInterview150;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Idx = m - 1; // end of nums1 index
        int nums2Idx = n - 1; // end of num2 index
        int right = m + n -1 ; // where we start inserting (starts at end of nums1[])

        while(nums2Idx >= 0){
            // if end (or current pointer regarding end) of nums1[index] is greater than nums2[index]
            if (nums1Idx >= 0 && nums1[nums1Idx] > nums2[nums2Idx]) { 
                nums1[right] = nums1[nums1Idx]; 
                nums1Idx--;

            }
            // if end (or current pointer regarding end) of nums1[index] is less than than nums2[index]
            else{
                nums1[right] = nums2[nums2Idx];
                nums2Idx--;
            }
            right--; //right most array index spot of nums1 goes down an index
        }

    }
}