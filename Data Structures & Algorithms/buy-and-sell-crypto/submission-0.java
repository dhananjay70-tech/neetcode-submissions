class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0 ;
        for(int i = 0 ; i < prices.length ; i++){
            for(int j = i+1 ; j<prices.length ; j++){
                int p = prices[j]-prices[i];
                ans = Math.max(ans,p);
            }
        }

        return ans;
    }
}
