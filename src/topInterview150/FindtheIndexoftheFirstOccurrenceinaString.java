package topInterview150;

/*
 * 28. Find the Index of the First Occurrence in a String
Solved
Easy
Topics
Companies

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

 

Constraints:

    1 <= haystack.length, needle.length <= 104
    haystack and needle consist of only lowercase English characters.


 */

// beats 100% runtime 0%
// Memory
// 41.73MB
// Beats13.73%

public class FindtheIndexoftheFirstOccurrenceinaString {
	public int strStr(String haystack, String needle) {
	       int startingPoint = -1;

	        if (needle.length() > haystack.length()){ // if needle length is longer than haystack it cant be found in haystack
	            return startingPoint;
	        }

	        if (haystack.equals(needle)){
	            return 0;
	        }

	       // needle is word we need to find
	       // haystack is full string
	        for (int i = 0; i < haystack.length() - needle.length() + 1; i++){
	            // int potentialPoint;
	            String haySubString = haystack.substring(i, i + needle.length());
	            // System.out.println("haysubstring = " + haySubString); //debug

	            if (haySubString.equals(needle)){
	                return i;
	            }
	        }

	        return startingPoint;
	    }
}
