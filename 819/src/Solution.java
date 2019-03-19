import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String b : banned) {
            map.put(b, -1001);
        }

        for (String word : paragraph.split("\\s|!|\\?|\\\\|,|;|\\.|'")) {
            int l = word.length();
            if (l == 0) continue;
            word = word.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        int max = 0;
        String result = "";
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey());
            System.out.print(" : ");
            System.out.println(entry.getValue());
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}