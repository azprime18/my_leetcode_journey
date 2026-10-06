class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxFreq=0;
        int count=1;
        int ans=0;
        if(nums.length == 1) return nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) count++;
            else count=1;
            if(count>maxFreq){
                maxFreq=count;
                ans=nums[i];
            }
            if(maxFreq>nums.length/2) return ans;
        }return -1;
    }
}