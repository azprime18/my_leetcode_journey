class Solution {
    public int maxArea(int[] height) {
        // int maxWater=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int width=j-i;
        //         int ht=Math.min(height[i],height[j]);
        //         int currentwater=width*ht;
                
        //         maxWater=Math.max(maxWater,currentwater);
        //     }
        // }
        // return maxWater;


         int lp=0, rp=height.length-1 , maxWater=0;
        while(lp<rp){
            int width=rp-lp;
            int ht=Math.min(height[lp],height[rp]);
            int current_water=width*ht;
            maxWater=Math.max(maxWater,current_water);
            int move=(height[lp] < height[rp]) ? lp++ : rp-- ;
        }
        return  maxWater;
    }
}