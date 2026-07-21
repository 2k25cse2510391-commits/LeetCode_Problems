class Solution {
    public boolean isValid(String s) {
        char[] crr = s.toCharArray();

        if(s.length()==1){
            return false;
        }
        Deque<Character> stackk = new ArrayDeque<>();

        for(char a : crr){
            if(a=='('||a=='{'||a=='['){
                stackk.push(a);
            }
            else if(a==')' && !stackk.isEmpty() && stackk.peek()=='('){
                stackk.pop();
            }
            else if(a=='}'&& !stackk.isEmpty() && stackk.peek()=='{'){
                stackk.pop();
            }
            else if(a==']'&& !stackk.isEmpty() && stackk.peek()=='['){
                stackk.pop();
            }
            else{
                stackk.push(a);
            }
        }
        return stackk.isEmpty();

    }
}