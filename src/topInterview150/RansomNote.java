package topInterview150;

/*
 * 383. Ransom Note
Solved
Easy
Topics
Companies

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

 

Constraints:

    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.


 */

import java.util.HashMap;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        boolean valid = true;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++){
            char current = magazine.charAt(i);

            if ( map.containsKey(current) == false ){
                map.put(current, 1);
            }
            else{
                map.put(current, map.get(current) + 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++){
            char current = ransomNote.charAt(i);

            if ( map.containsKey(current) == false ){
                return false;
            }
            else{
                int num = map.get(current) - 1;
                if (num == -1){
                    return false;
                }

                map.put(current, num);
            }
        }

        return valid;
    }
}
