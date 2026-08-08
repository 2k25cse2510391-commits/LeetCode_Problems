class Solution {
    val ls = ArrayList<ArrayList<Int>>()
    fun generate(numRows: Int): List<List<Int>> {
        ls.clear();
        ls.add(arrayListOf(1))
        if(numRows==1){
            return ls
        }
        ls.add(arrayListOf(1,1))
        build(numRows-2)
        return ls
    }

    fun build(n: Int){
        if(n==0){
            return
        }

        val lst = ArrayList<Int>()
        lst.add(1)
        val temp = ls.get(ls.size-1)
        var x =0

        var y = 1;
        while(y!=temp.size){
            lst.add(temp.get(x)+temp.get(y))
            x++;
            y++;
        }
        lst.add(1)
        ls.add(ArrayList(lst))
        build(n-1)
    }
}