class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> mp1 = new HashMap<>();
        int count = 0;
        for(int a =0;a<nums1.length;a++){
            for(int b =0;b<nums2.length;b++){
                mp1.put(nums1[a]+nums2[b],mp1.getOrDefault(nums1[a]+nums2[b],0)+1);
            }
        }

        for(int a =0;a<nums3.length;a++){
            for(int b =0;b<nums4.length;b++){
                if(mp1.containsKey(-(nums3[a]+nums4[b]))){
                    count+=mp1.get(-(nums3[a]+nums4[b]));
                }
            }
        }

        return count;
    }
}