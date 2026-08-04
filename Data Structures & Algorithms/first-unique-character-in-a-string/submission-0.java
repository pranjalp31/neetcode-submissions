class Solution {
    public int firstUniqChar(String s) {
        int res=s.length();
        for(char ch='a'; ch<='z';ch++){
            int f=s.indexOf(ch);
            if(f!=-1 && s.lastIndexOf(ch)==f){
                res=Math.min(res,f);
            }
        }
        return res==s.length()? -1:res;
    }
}