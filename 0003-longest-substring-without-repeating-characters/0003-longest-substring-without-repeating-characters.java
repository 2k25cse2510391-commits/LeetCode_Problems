class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int p = 0;
        int q = 0;
        int temp = 0;
        int max = 0;
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        Set<Character> S = new HashSet<>();
        for (p = 0; p < arr.length; p++) {
            for (q = p; q < arr.length; q++) {
                if (S.contains(arr[q])) {
                    if (max < temp) {
                        max = temp;
                    }
                    S.clear();
                    temp = 0;
                    break;
                }
                S.add(arr[q]);
                temp++;
            }
        }
        return max;
    }
}