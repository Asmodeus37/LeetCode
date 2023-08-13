package org.example;

import java.util.HashMap;
import java.util.Map;



public class romanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        int n = 0;
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("L", 50);
        map.put("C", 100);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("CD", 400);
        map.put("CM", 900);
        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                n += map.get(s.substring(i, i + 2));
                i += 2;
            } else if (map.containsKey(s.substring(i, i + 1))) {
                n += map.get(s.substring(i, i + 1));
                i += 1;
            }
        }
        return n;
    }
}