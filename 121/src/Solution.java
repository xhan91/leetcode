class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] h = new int[prices.length - 1];
        int maxProfit = 0, currentProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            h[i] = prices[i+1] - prices[i];
        }
        for (int i = 0; i < h.length; i ++) {
            currentProfit += h[i];
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
            if (currentProfit < 0) {
                currentProfit = 0;
            }
        }
        return maxProfit;
    }
}