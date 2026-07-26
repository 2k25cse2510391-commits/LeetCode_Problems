class Solution {
    public static boolean ans = false;
    public static int flag = 0;
   
    public boolean canJump(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        flag = 0;
        ans = false;
        jump(nums,0,visited);
        return ans;
        
    }
    
    public static void jump(int[] nums, int pos,boolean[] visited){
        if(pos>=nums.length){
            return;
        }
        if(visited[pos]==true){
            return;
        }

        if(pos==nums.length-1){
            ans = true;
            flag = 1;
            return ;
        }
        if(flag==1){
            return ;
        }

        for(int a = nums[pos] ; a >= 1 ; a--){
            jump(nums,pos+a,visited);
        }
        visited[pos]=true;
        return;
    }
}