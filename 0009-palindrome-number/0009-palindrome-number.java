class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int size = 0;
        int temp = x;
        while (temp != 0) {
            temp /= 10;
            size++;
        }
        int p = 0;
        int q = size - 1;
        int[] arr = new int[size];
        while(size>0){
            size--;
            arr[size]=x%10;
            x/=10;
        }     
        while (p < q) {
            if (arr[p] != arr[q]) {
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
}