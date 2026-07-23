class Solution {
    public int searchInsert(int[] nums, int target) {
        int p=0;
        int q = nums.length-1;
        while(p<=q){
            if(nums[(p+q)/2]==target){
                return (p+q)/2;
            }
            else if(nums[(p+q)/2]>target){
                q=((p+q)/2)-1 ;
            }
            else if(nums[(p+q)/2]<target){
                p=((p+q)/2)+1;
            }
        }
        return p;
    }
}