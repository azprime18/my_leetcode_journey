class Solution {
    public String largestOddNumber(String num) {
        int index=-1;
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            int x=ch-0;
            if(x%2==1){
                index=i;
                break;
            }
        }
        String str="";
        for(int j=0;j<=index;j++){
            str+=num.charAt(j);
        }
        return str;
    }
}