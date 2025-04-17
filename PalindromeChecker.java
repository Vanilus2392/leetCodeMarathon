package leetcode;
import java.util.Scanner;

public class PalindromeChecker{

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = console.nextInt();

        int temp = num;
        int reversed = 0;
        
        while (temp != 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        
        if(num < 0){
            System.out.println(num + " is not a palindrome");
            return;
        }

        if (reversed == num){
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }

    }
}