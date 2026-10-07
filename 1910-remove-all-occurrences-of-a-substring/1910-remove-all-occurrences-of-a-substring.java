class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
            if(st.size()>=part.length()){

                String temp="";
                for(int j=0;j<part.length();j++){
                    temp=st.pop()+temp;

                }
            
                if(!temp.equals(part)){
                    for(int j=0;j<part.length();j++){
                        st.push(temp.charAt(j));
                    }
                }
            }
        }
        String ans="";
            while(st.size()!=0){
                ans=st.pop()+ans;
            }
        return ans;
    }
}

