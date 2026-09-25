class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='0' && str.charAt(i)<='9')){
                st.push(str.charAt(i));
            }
        }
        String str2="" ;
        while(!st.isEmpty()){
            str2+=st.pop();
        } 
        int start=0;
        int end=str2.length()-1;
        while(start<end){
            if(str2.charAt(start)!=str2.charAt(end)) return false;
            start++;
            end--;
        }
        return true ;
    }
}