class Solution {
    static boolean temp = false;
    public boolean exist(char[][] board, String word) {
        List<int[]> ls = new ArrayList<>();
        
        temp = false;
        for(int x =0;x<board.length;x++){
            for(int y = 0; y < board[0].length;y++){
                if(word.charAt(0)==board[x][y]){
                    ls.add(new int[]{x,y});
                }
            }
        }

        for(int[] arr : ls){
            search(board,arr[0],arr[1],word,1);
            if(temp==true){
                return true;
            }
        }
        return false;
        
    }

    public static void search(char[][] board , int x , int y , String st, int n){
        if(n==st.length()){
            temp = true;
            return;
        }
        if(temp==true){
            return;
        }
        char temp = board[x][y];
        board[x][y]='@';

        if(x!=board.length-1 && board[x+1][y]==st.charAt(n)){
            search(board,x+1,y,st,n+1);
        }
        if(x!=0 && board[x-1][y]==st.charAt(n)){
            search(board,x-1,y,st,n+1);
        }
        if(y!=board[0].length-1 && board[x][y+1]==st.charAt(n)){
            search(board,x,y+1,st,n+1);
        }
        if(y!=0 && board[x][y-1]==st.charAt(n)){
            search(board,x,y-1,st,n+1);
        }
        board[x][y]=temp;
        return ;
    }
}