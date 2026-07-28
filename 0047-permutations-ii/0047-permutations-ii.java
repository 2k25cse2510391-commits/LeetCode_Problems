class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ls.clear();
        st.clear();
        sol(nums,new ArrayList<Integer>());
        return ls;
    }
    static List<List<Integer>> ls = new ArrayList<>();
    static Set<List<Integer>> st = new HashSet<>();

    public static void sol(int[] nums,List<Integer> li){
        if(li.size()==nums.length){
            if(st.contains(li)==false){
                ls.add(new ArrayList<>(li));
                st.add(new ArrayList<>(li));
                return;
            }
            return;
        }

        for(int a=0 ; a<nums.length ; a++){
            if(nums[a]==11){
                continue;
            }
            int temp = nums[a];
            li.add(nums[a]);
            nums[a]=11;
            sol(nums,li);
            li.remove(li.size()-1);
            nums[a]=temp;
        }

    }
}