package topInterview150;

import java.util.Arrays;

public class LongestCommonPrefix {
	// solution by me 
    public String longestCommonPrefix(String[] strs) {
        
        int minLength = 0;
        String prefix = "";

        if (strs.length == 0 || strs == null){
            return prefix;
        }
        
        // setting minimum length
        for (String str : strs){
            if (str.equals("")){
                return prefix;
            }

            if (minLength == 0 || str.length() < minLength){
                minLength = str.length();
            }
        }

        String base = strs[0];
        boolean valid = true;
        int endIndex = 0;

        // vertically scans each string
        for (int i = 0; i < minLength; i++){
            for (String str : strs){
                if (str.charAt(i) != base.charAt(i)){
                    valid = false;
                    break;
                }
            }
            if (valid == false){
                break;
            }
            endIndex = i + 1;
        }

        // creates final substring of prefix
        System.out.println("end index: " + endIndex);
        prefix = base.substring(0, endIndex);
        return prefix;
    }
    
    //by Internet
    public String longestCommonPrefix2(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
