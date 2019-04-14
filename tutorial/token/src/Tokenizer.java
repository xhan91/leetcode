import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Tokenizer {
    public List<String> tokenize(String s, String[] tokens) throws Exception {
        int[] a = new int[1];
        Map<String, Boolean> dictionary = new HashMap<>();
        Map<String, List<String>> memo = new HashMap<>();
        for (String word : tokens) {
            dictionary.put(word, true);
        }
        List<String> result = rec(s, dictionary, memo);
        if (result != null) {
            return result;
        } else {
            throw new Exception("Failed to tokenize");
        }
    }

    private List<String> rec(String toTokenize, Map<String, Boolean> dictionary, Map<String, List<String>> memo) {
        int l = toTokenize.length();
        if (l == 0) return new LinkedList<>();
        List<String> m = memo.get(toTokenize);
        if (m != null) return m;
        for(int i = 1; i < l + 1; i++) {
            String token = toTokenize.substring(0, i);
            if (dictionary.get(token) != null) {
                String rest = toTokenize.substring(i, l);
                List<String> list = new LinkedList<>();
                list.add(token);

                List<String> result = rec(rest, dictionary, memo);
                if (result != null) {
                    list.addAll(result);
                    memo.put(toTokenize, list);
                    return list;
                }
            }
        }
        return null;
    }
}
