class Solution {
    public int maxProfit(int[] prices) {
      int[] buy=new int[prices.length];
      buy[0]=prices[0];
      for(int i=1;i<prices.length;i++){
            buy[i]=Math.min(buy[i-1],prices[i]);
      }

      
      int[] sell=new int[prices.length];  
      sell[prices.length-1]=prices[prices.length-1];
      for(int j=prices.length-2;j>=0;j--){
        sell[j]=Math.max(sell[prices.length-1],prices[j]);
      }
        
        int maxProfit=0;
        for(int k=0;k<prices.length;k++){
            maxProfit=Math.max(maxProfit,sell[k]-buy[k]);
        }
        return maxProfit;
    }
}