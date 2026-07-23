class Solution {
    public void nextPermutation(int[] nums) {
        int flag =0;
        for(int a = 1;a<nums.length;a++){
            if(nums[a-1]<nums[a]){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            Arrays.sort(nums);
            return;
        }
    int p=nums.length-1;

    while(nums[p]<=nums[p-1]&&p>=0){
        p--;
    }
    Arrays.sort(nums,p,nums.length);
    int temp1 = p-1;
    for(int a = p ; a < nums.length;a++){
        if(nums[a]>nums[temp1]){
            int temp= nums[temp1];
            nums[temp1]=nums[a];
            nums[a]=temp;
            break;
        }
    }

    

    }
}