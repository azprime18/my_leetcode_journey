class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        char[] arr=str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true ;
    }
}