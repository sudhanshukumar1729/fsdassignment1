package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mp = new HashMap<>();
        List<String> str = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            mp.put(s, mp.getOrDefault(s, 0) + 1);
            str.add(s);
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
