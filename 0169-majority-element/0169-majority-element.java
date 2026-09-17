class Solution {
    public int majorityElement(int[] nums) {
        int freq=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0) ans=nums[i];
            if (ans==nums[i]) freq++;
            else freq--;
        }
        
        int count=0;
        for(int val:nums){
            if(val==ans){
                count++;
            }
        }
        if(count>nums.length/2) return ans;
        return -1;
    }
}