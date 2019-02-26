class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int maxProfit = 0;
        // init helper array
        int[] h = new int[prices.length - 1];
        for (int i = 0; i < prices.length - 1; i++) {
            h[i] = prices[i+1] - prices[i];
        }

        for (int i = 0; i < h.length; i ++) {
            int current = findMax(h, 0, i) + findMax(h, i, h.length);
            if (current > maxProfit) maxProfit = current;
        }
        return maxProfit;
    }

    public int findMax(int[] priceDiff, int start, int end) {
        int max = 0, current = 0;
        for (int i = start; i < end; i ++) {
            current += priceDiff[i];
            if (current > max) max = current;
            if (current < 0) current = 0;
        }
        return max;
    }
}