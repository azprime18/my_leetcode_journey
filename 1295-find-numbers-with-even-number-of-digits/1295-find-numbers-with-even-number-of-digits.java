class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int freq=0;
            int x=nums[i];
            while(x>0){
                freq++;
                x=x/10;
            }
            if(freq%2==0){
                count++;
            }
        }
        return count;
    }
}