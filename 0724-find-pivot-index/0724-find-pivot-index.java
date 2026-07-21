class Solution {
    public int pivotIndex(int[] nums) {
        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        temp1[0]=nums[0];
        temp2[nums.length-1]=nums[nums.length-1];
        for(int a = 1;a<nums.length;a++){
            temp1[a]=nums[a]+temp1[a-1];
            temp2[nums.length-1-a]=nums[nums.length-1-a]+temp2[nums.length-a];
        }
        for(int a = 0;a<nums.length;a++){
            if(temp1[a]==temp2[a]){
                return a;
            }
        }
        return -1;
    }
}