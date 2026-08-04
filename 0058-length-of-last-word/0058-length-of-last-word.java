class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        s=s.trim();
        for(int a = s.length()-1;a>=0;a--){
          if(s.charAt(a)==' '){
            break;
          }
          else{
            count++;
          }
        }
        return count;
    }
}