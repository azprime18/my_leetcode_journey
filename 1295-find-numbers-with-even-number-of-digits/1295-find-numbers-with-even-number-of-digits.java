class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
           String str=Integer.toString(nums[i]);
           char[] arr=new char[str.length()];
           if(arr.length%2==0) count++;           
        }
        return count;
    }
}