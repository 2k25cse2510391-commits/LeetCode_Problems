class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==1){
            if(needle.equals(haystack)){
                return 0;
            }
            else{
                return -1;
            }
        }
        int p=0;
        int q = needle.length();

        while(q<=haystack.length()){
            if(needle.equals(haystack.substring(p,q))){
                return p;
            }
            p++;
            q++;
        }
        return -1;
    }
}