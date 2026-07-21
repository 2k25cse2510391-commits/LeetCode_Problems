class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> S = new HashSet<>();
        for(int a : nums){
            if(S.contains(a)){
                return true;
            }
            else{
                S.add(a);
            }
        }
        return false;
    }
}