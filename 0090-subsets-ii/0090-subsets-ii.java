class Solution {
    static HashSet<List<Integer>> st = new HashSet<>();
   static  List<List<Integer>> ls = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ls.clear();
        st.clear();
        Arrays.sort(nums);
        sub(new ArrayList<Integer>(),nums,0);
        return ls;
    }

    public static void sub(List<Integer> lt,int[] nums , int n){
        if(lt.size()<=nums.length){
            if(st.contains(lt)==false){
                st.add(new ArrayList(lt));
                ls.add(new ArrayList(lt));
            }
        }

        for(int a = n;a<nums.length;a++){
            if(nums[a]==11){
                continue;
            }
            int temp = nums[a];            
            lt.add(nums[a]);
            nums[a]=11;
            sub(lt,nums,a+1);
            lt.remove(lt.size()-1);
            nums[a]=temp; 
        }
    }
}