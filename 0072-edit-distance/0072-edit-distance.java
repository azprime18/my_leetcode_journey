class Solution {
    public int minDistance(String word1, String word2) {
        StringBuilder s1=new StringBuilder(word1);
        StringBuilder s2=new StringBuilder(word2);
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return edit(s1,s2,m-1,n-1,dp);
    }
    static int edit(StringBuilder s1,StringBuilder s2,int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=edit(s1,s2,i-1,j-1,dp);
        int insert=1+edit(s1,s2,i,j-1,dp);
        int remove=1+edit(s1,s2,i-1,j,dp);
        int replace=1+edit(s1,s2,i-1,j-1,dp);
        return dp[i][j]=Math.min(insert,Math.min(remove,replace));
    }
}