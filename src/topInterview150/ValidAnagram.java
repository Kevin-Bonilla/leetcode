package topInterview150;

/*
 * 242. Valid Anagram
Solved
Easy
Topics
Companies

Given two strings s and t, return true if t is an
anagram
of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.

 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

 */

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // if lengths don't match (edge case)
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>(); //mapping characters to characters 

        // transversing through s and mapping every character we have and keeping track of how many of each
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++){
            char currentChar = t.charAt(i);
            int newValue;

            if(!map.containsKey(currentChar)){
                return false; // if currentChar wasn't in s
            }
            else{
                //as we traverse we lower char by one as we come across them
                newValue = map.get(currentChar) - 1;
                if(newValue < 0){ // if we have used more chars than in s
                    return false; 
                }
                else if(newValue == 0){
                    map.remove(currentChar); //remove is no characters are left of that character
                }
                else{
                    map.put(currentChar, newValue);
                }
            }

        }
        boolean isValid = map.isEmpty(); //all characters need to be used
        return isValid;
    }
}
