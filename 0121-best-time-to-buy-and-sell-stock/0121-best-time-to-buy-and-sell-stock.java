class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] left=new int[n];
        int[] right=new int[n];
        
        left[0]=prices[0];
        for(int i=1;i<n;i++){
            left[i]=Math.min(left[i-1],prices[i]);
        }
        
        right[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],prices[i]);
        }
        
        int maxProfit=0;
        for(int i=0;i<n;i++){
            maxProfit=Math.max(maxProfit,right[i]-left[i]);
        }
        return maxProfit;
    }
}