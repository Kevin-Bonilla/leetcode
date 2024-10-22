package topInterview150;

/*
 * 
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
