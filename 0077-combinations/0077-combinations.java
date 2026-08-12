class Solution {
    public List<List<Integer>> combine(int n, int k) {
        lst.clear();
        sol(new ArrayList<Integer>(),n,k,1);
        return lst;
    }
    static List<List<Integer>> lst = new ArrayList<>();
    public static void sol(ArrayList<Integer> ls , int n , int k , int f){
        if(ls.size()==k){
            lst.add(new ArrayList<>(ls));
        }

        for(int a = f; a<=n ;a++){
            ls.add(a);
            sol(ls,n,k,a+1);
            ls.remove(ls.size()-1);
        }
    }
}