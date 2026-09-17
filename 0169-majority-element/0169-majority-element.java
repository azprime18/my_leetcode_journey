class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int maxFreq=0;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count>maxFreq){
                maxFreq=count;
                ans=nums[i];
            }
        }
        if(maxFreq>nums.length/2) return ans;
        else return nums[0];
    }
}