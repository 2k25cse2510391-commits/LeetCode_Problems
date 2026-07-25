class Solution {
    public int myAtoi(String t) {
        String s = t.trim();
        if(s.length()==0){
            return 0;
        }
        char[] ch = s.toCharArray();
        int start=0;
        int multi=1;
        if(ch[0]=='-'){
            start=1;
            multi=-1;
        }
        else if(ch[0]=='+'){
            start=1;
            multi=1;
        }
        int digit = 0;
        long num=0;
        for(int a = start; a<ch.length;a++){
            digit = ch[a]-'0';
            if(ch[a] < '0' || '9' < ch[a]){
                break;
            }
            if (num > Integer.MAX_VALUE / 10 || 
               (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (multi == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num=(num*10)+(long)(ch[a]-'0');
        }
        return (int)(num*multi);

    }
}