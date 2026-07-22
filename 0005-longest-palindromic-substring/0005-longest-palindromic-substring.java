class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int p = 0;
        int q = s.length();
        int temp=p;

        for(int a = 0 ; a < s.length() ; a++ ){
            while(p>=0){
                
                if(s.charAt(p)==s.charAt(q-1)&&is_Palindrome(s.substring(p,q))){
                    return s.substring(p,q);
                }
                p--;
                q--;
            }
            p=temp+1;
            q=s.length();
            temp=p;
        }
        return new String("");
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