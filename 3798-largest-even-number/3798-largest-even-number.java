class Solution {
    public String largestEven(String s) {
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            int x=s.charAt(i)-'0';
            if(x%2==0){
                ans=i;
                String str="";
                for(int j=0;j<=ans;j++){
                    str=str+s.charAt(j);
                }
                return str;
            }
        }
        return "";
    }
}