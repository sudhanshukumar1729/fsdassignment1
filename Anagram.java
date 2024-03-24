package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        
        if (Arrays.equals(s1Array, s2Array)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
