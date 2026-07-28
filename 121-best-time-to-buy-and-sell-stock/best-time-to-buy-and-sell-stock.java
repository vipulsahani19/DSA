class Solution {
    public int maxProfit(int[] prices) {
        int best_buy=prices[0];
        int max_profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<best_buy){
                best_buy=prices[i];
            }
            else if(prices[i]-  best_buy>max_profit){
                max_profit=prices[i]-best_buy;
            }
        }
    
        return max_profit;
       
    }
}