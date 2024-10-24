package topInterview150;

/*
 * 
 * 20. Valid Parentheses
Solved
Easy
Topics
Companies
Hint

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 

Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.


 */

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        boolean valid = true;
        HashMap<Character, Character> bracketPairs = new HashMap<>();
        // filling bracketPairs Hashmap with all pairs, key is closing bracket
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');

        Stack<Character> openingBrackets = new Stack<>(); // stack to hold 

        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            if (bracketPairs.containsKey(currentChar)){ //if closing bracket is currentChar in string
                if (openingBrackets.isEmpty()){ 
                    return false; //no matching open bracket
                }
                else{
                    int topElement = openingBrackets.pop();
                    if (topElement != bracketPairs.get(currentChar)){
                        return false;
                    }
                }
            }
            else{ //if opening bracket is currentChar in string
                openingBrackets.push(currentChar);
            }
        }

        if(!openingBrackets.isEmpty()){
            return false;
        }

        return valid;
    }
}
