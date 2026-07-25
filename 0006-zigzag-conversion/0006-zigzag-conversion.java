class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        List<char[]> arr = new ArrayList<>();
        int count =0;
        while(count != s.length()){
            count=ver(arr,numRows,count,s);
            count = dig(arr,s,numRows,count);
        }
        return print(arr,numRows);
    }

    public static int ver(List<char[]> arr, int row , int point , String str){
    char[] brr = new char[row];
    for(int a = 0 ;a<row;a++){
        if(point==str.length()){
            break;
            }
        brr[a]=str.charAt(point);
        point++;
        }
        arr.add(brr);
        return point;
    }
    public static int dig(List<char[]> arr , String str , int row, int point){
        char[] ch = new char[row];
        for(int a = 0 ; a<row-2 ; a++){
            if(point==str.length()){
                break;
            }            
            ch[ch.length-2-a]=str.charAt(point);
            point++;
        }
        arr.add(ch);
        return point;
    }

    public static String print(List<char[]> arr , int row){
        int count = 0;
        StringBuilder STR = new StringBuilder();
        while(count!=row){
            for(char[] crr : arr){
                if(crr[count]!='\u0000'){
               STR.append(crr[count]);
               } 
            }
            count++;
        }
        return STR.toString();
    }
}