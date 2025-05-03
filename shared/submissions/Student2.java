import java.util.HashMap;

class Sherlock {
    public static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char[] arr = s.substring(i, j + 1).toCharArray();
                String keyVal = String.valueOf(arr);
                
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
