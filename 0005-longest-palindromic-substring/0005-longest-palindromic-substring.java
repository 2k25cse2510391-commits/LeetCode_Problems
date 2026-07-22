class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int p = 0;
        int q = 1;
        int temp=q;
        int start = 0;
        int end = 0;

        for(int a = 0 ; a < s.length() ; a++ ){
            while(q<=s.length()){
                if(is_Palindrome(s.substring(p,q))){
                    start=p;
                    end=q;
                    break;
                }
                p++;
                q++;
            }
            p=0;
            q=temp+1;
            temp=q;
        }
        return s.substring(start,end);
    }
    public boolean is_Palindrome(String S){
        int p=0;
        int q=S.length()-1;
        boolean flag = true;
        while(p<q){
            if(S.charAt(p)!=S.charAt(q)){
                flag = false;
                break;
            }
            p++;
            q--;
        }
        return flag;
    }
}