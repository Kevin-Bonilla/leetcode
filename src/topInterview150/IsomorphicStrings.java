package topInterview150;

/*
 * 205. Isomorphic Strings
Solved
Easy
Topics
Companies

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

    Mapping 'e' to 'a'.
    Mapping 'g' to 'd'.

Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true

 

Constraints:

    1 <= s.length <= 5 * 104
    t.length == s.length
    s and t consist of any valid ascii character.


 */

import java.util.HashMap;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        boolean valid = true;

        if (s.length() != t.length()){ // lengths of two strings must be the same
            return false;
        }

        HashMap<Character, Character> sToTMap = new HashMap<>();
        HashMap<Character, Character> TToSMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            //sToTMap part
            if(sToTMap.containsKey(sChar)){ //if we have already mapped sChar
                if(sToTMap.get(sChar) != tChar){ // cannot map to two values, we have a dealbreaker
                    return false;
                }
            }
            else{ // if we havent mapped sChar
                sToTMap.put(sChar, tChar);
            }

            //TToSMap part
            if(TToSMap.containsKey(tChar)){ //if we have already mapped tChar
                if(TToSMap.get(tChar) != sChar){ // cannot map to two values, we have a dealbreaker
                    return false;
                }
            }
            else{ // if we havent mapped tChar
                TToSMap.put(tChar, sChar);
            }
        }

        return valid;
    }
}
