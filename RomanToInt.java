package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt{
    public static int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            char currChar = s.charAt(i);
            int currValue = map.get(s.charAt(i));
            if(currValue < prevValue){
                sum -= currValue;
            } else {
                sum += currValue;
            }
            prevValue = currValue;
        }
        return sum;

        
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String input = console.nextLine();
        
        int result = romanToInt(input);
        System.out.println(result);
    }
}