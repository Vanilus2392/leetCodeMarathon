package leetcode;
public class LongPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        StringBuilder prefix = new StringBuilder();
        String firstStr = strs[0];
        for (int i = 0; i < firstStr.length(); i++) {
            char currentChar = firstStr.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
        }
        
        return prefix.toString(); 
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result); 
    }
}