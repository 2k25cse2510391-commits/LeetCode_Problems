class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        int count = 1;
        int flag = 0;
        for(int a =0;a<nums.length;a++){
            if(nums[a]==1){
                num=a;
                flag=1;
                break;
            }
        }
        if(flag==0){
            return 1;
        }

        for(int a = num+1;a<nums.length;a++){
            if(nums[a]-nums[a-1]>1){
                return nums[a-1]+1;
            }
            else{
                count++;
            }
        }
        return nums[nums.length-1]+1;
    }
}