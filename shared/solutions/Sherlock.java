// solution to hackerrank problem -> https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
// written by wilson155079 -> https://www.hackerrank.com/profile/wilson155079

import java.util.Arrays;
import java.util.HashMap;

class Sherlock {
    public static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char[] arr = s.substring(i, j + 1).toCharArray();
                Arrays.sort(arr);
                String keyVal = String.valueOf(arr);
                
                map.put(keyVal, map.getOrDefault(keyVal, 0) + 1);
            }
        }        
        
        int pairs = 0;
        for (String key : map.keySet()) {
            Integer val = map.get(key);
            pairs += (val * (val - 1)) / 2; 
        }

        return pairs;
    }
}
