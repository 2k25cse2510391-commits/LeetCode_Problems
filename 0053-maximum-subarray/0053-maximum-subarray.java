class Solution {
    public int maxSubArray(int[] nums) {
        int max =nums[0];
        int temp_max = nums[0];
        for(int i=1;i<nums.length;i++){
            temp_max = Math.max(nums[i],temp_max+nums[i]);

            max=Math.max(max,temp_max);
        }
        return max;
    }
}