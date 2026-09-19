class Solution {
    public int maxProfit(int[] prices) {
        int BestBuy=prices[0];
        int MaxProfit=0;
       for(int i=1;i<prices.length;i++){
        if(prices[i]>BestBuy){
            MaxProfit=Math.max(MaxProfit,prices[i]-BestBuy);
        }
        BestBuy=Math.min(BestBuy,prices[i]);
       } 
       return MaxProfit;
    }
}