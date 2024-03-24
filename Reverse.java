package assignment;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] charArray = str.toCharArray();
        
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        
        String reversedString = new String(charArray);
        System.out.println(reversedString);
    }
}

