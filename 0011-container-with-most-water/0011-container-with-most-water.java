class Solution {
    public int maxArea(int[] height) {
        // int maxWater=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int width=j-i;
        //         int ht=Math.min(height[i],height[j]);
        //         int area=width*ht;
        //         maxWater=Math.max(maxWater,area);
        //     }
        // }
        // return maxWater;

        int i=0;
        int j=height.length-1;
        int maxWater=0;
        while(i<j){
            int width=Math.abs(j-i);
            int ht=Math.min(height[i],height[j]);
            int area=width*ht;
            maxWater=Math.max(area,maxWater);
            if(height[i] < height[j])
                i++;
            else
                j--;
            }
        return maxWater;
    }
}