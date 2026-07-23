class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int a =0 ; a<nums.length; a++){
            if(nums[a]!=val){
                count++;
            }
            else{
                nums[a]=101;
            }
        }
        Arrays.sort(nums);
        return count;

    }
}