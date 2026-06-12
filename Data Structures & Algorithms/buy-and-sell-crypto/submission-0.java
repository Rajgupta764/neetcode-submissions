class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int n=prices.length;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            maxprofit=Math.max(maxprofit,prices[i]-min);
        }
        return maxprofit;
    }
}
