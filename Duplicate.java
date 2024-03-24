package assignment;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Map<Character, Integer> mp = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            if (mp.get(ch) == 1)
                ans.append(ch);
        }
        System.out.println(ans);
    }
}
