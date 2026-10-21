class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int result=nums2[0]-nums1[0];
        for(int i=0;i<nums1.length;i++){
            if(nums2[i]-nums1[i]!=result) return -1;
        }
        return result;
    }
}