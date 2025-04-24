package leetcode;

public class ValidParenthesis {
    public static boolean isValid(String s){
        char[] charStr = s.toCharArray(); 

        char first = charStr[0];
        char last = charStr[s.length() - 1]; 

        if(s.length() == 2){
            if((first == '(' && last == ')') || (first == '[' && last == ']') || (first == '{' && last == '}')){
                return true;
            }
        } else {
            for(int i = 1; i <= s.length() - 1; i++){
                char curr = charStr[i];
                char next = charStr[i+1];
                if((first == '(' && last == ')') || (first == '[' && last == ']') || (first == '{' && last == '}')){
                    if((curr == '(' && next == ')') || (curr == '[' && next == ']') || (curr == '{' && next == '}')){
                        return true;
                    }
                    if(next > s.length()){
                        return false;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        String s = "([]}";
        System.out.println(isValid(s));
    }
}
