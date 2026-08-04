class Solution {
    public String simplifyPath(String path) {
        String[] srr = path.split("/");
        System.out.print(Arrays.toString(srr));
        //return path;

        Deque<String> st1 = new ArrayDeque<>();
        Deque<String> st2 = new ArrayDeque<>();
        for(String st : srr){
            if(st.trim().equals("..")){
                if(st1.isEmpty()==false){
                st1.pop();}
                continue;
            }
            else if(st.trim().equals("")||st.trim().equals(".")){
                continue;
            }
            else{
                st1.push(st.trim());
            }
        }
        while(st1.isEmpty()==false){
            st2.push(st1.pop());
        }

        StringBuilder temp = new StringBuilder();
        if(st2.isEmpty()==true){
            return "/";
        }
        while(st2.isEmpty()==false){
            temp.append('/');
            temp.append(st2.pop());
        }
        return temp.toString();
    }
}