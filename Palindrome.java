package assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                ans.append(ch);
            }
        }
        
        String str1 = ans.toString();
        String reversed = ans.reverse().toString();
        
        if (reversed.equals(str1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
