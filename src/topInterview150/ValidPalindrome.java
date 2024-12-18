package topInterview150;

/*
 * 125. Valid Palindrome
Solved
Easy
Topics
Companies

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

 

Constraints:

    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.


 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        boolean valid = true;

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", ""); // replacing all nonalphanumeric characters
        //System.out.println("string w/o nonalphanumeric: " + s); // debug

        int strLen = s.length();
        for (int start = 0, end = strLen - 1; start < strLen / 2 ; start++, end--){
            char charStart = s.charAt(start);
            char charEnd = s.charAt(end);
            if ( (charStart != charEnd) ){
                return false;
            }
        }

        return valid;
    }
}
