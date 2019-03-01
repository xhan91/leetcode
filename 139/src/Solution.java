import java.util.Collections;
import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        Boolean[] dp = new Boolean[length + 1];
        // use DFS, from longest to shortest to maximize step
        Collections.sort(wordDict, (a, b) -> b.length() - a.length());
        dp[0] = true;
        return helper(s, wordDict, dp);
    }

    public boolean helper(String s, List<String> wordDict, Boolean[] dp) {
        for (String word : wordDict) {
            if (s.endsWith(word)) {
                if (dp[s.length() - word.length()] != null) {
                    if (dp[s.length() - word.length()]) {
                        dp[s.length()] = true;
                        return true;
                    }
                    continue;
                }
                if (helper(s.substring(0, s.length() - word.length()), wordDict, dp)) {
                    dp[s.length()] = true;
                    return true;
                }
            }
        }
        dp[s.length()] = false;
        return false;
    }
}