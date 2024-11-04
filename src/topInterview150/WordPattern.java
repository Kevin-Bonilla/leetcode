package topInterview150;

/*
 * 290. Word Pattern
Solved
Easy
Topics
Companies

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

    Each letter in pattern maps to exactly one unique word in s.
    Each unique word in s maps to exactly one letter in pattern.
    No two letters map to the same word, and no two words map to the same letter.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"

Output: true

Explanation:

The bijection can be established as:

    'a' maps to "dog".
    'b' maps to "cat".

Example 2:

Input: pattern = "abba", s = "dog cat cat fish"

Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"

Output: false

 

Constraints:

    1 <= pattern.length <= 300
    pattern contains only lower-case English letters.
    1 <= s.length <= 3000
    s contains only lowercase English letters and spaces ' '.
    s does not contain any leading or trailing spaces.
    All the words in s are separated by a single space.


 */

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        // we are going to create a hashmap to map each character in pattern to a full string in s
        // similar to previous problem done group anagram
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        String[] words = s.split(" "); // making a string array of words in s
        boolean isValid = true;

        if(words.length != pattern.length()){
            //edge case for strings not lining up in numbers to pattern characters
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            char currentChar = pattern.charAt(i);
            System.out.println("pattern: " + currentChar + " words: " + words[i] ); //debug

            if(!map.containsKey(currentChar) && !reverseMap.containsKey(words[i])){ //if currentChar of pattern hasnt been mapped yet
                map.put(currentChar, words[i]);
                reverseMap.put(words[i], currentChar);
            } 
            else if(!map.containsKey(currentChar) && reverseMap.containsKey(words[i])){ //if currentChar hasn't been mapped but our string from words has been mapped
                return false;
            }
            else{ //if currentChar has already been mapped
                if(!words[i].equals(map.get(currentChar))){ // if words[i] doesn't match value mapped
                    System.out.println("returning false for pattern: " + currentChar + " words: " + words[i] );
                    return false;
                }
            }
        } 

        return isValid;
    }
}
