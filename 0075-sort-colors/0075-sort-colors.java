class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        count[0]=count[1]=count[2]=0;
        for(int i : nums ){
            count[i]++;
        }
        int x =0;
        for(int a =0;a<count[0];a++){
            nums[x++]=0;
        }
        for(int a =0;a<count[1];a++){
            nums[x++]=1;
        }for(int a =0;a<count[2];a++){
            nums[x++]=2;
        }
    }
}