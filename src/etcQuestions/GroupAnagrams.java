package etcQuestions;

/*
 * 49. Group Anagrams

 * 
 * Given an array of strings strs, group the
 * 
anagrams
together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

    There is no string in strs that can be rearranged to form "bat".
    The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
    The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]

 

Constraints:

    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.


 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
    public List<List<String>> groupAnagrams(String[] strs) {
        //a sorted string of anagrams will all be the same
        //must convert str to charArray, then sort it(using Arrays.sort), then convert back to string.

        // hashmap that contains our key string that we look for then add to list<string> when we find one
        HashMap<String, List<String>> groupedAnagrams = new HashMap<>(); 

        for(String str : strs){
            char[] charStr = str.toCharArray(); // converts str to char array
            Arrays.sort(charStr); //sorts charStr alphabetically
            String sortedStr = new String(charStr);

            if(!groupedAnagrams.containsKey(sortedStr)){
                //if sortedStr isnt a key in hashmap yet.
                groupedAnagrams.put(sortedStr, new ArrayList<>());
            }

            groupedAnagrams.get(sortedStr).add(str); // adding to list allocated to that hashmap key
        }

         return new ArrayList<>(groupedAnagrams.values());
    }

}
