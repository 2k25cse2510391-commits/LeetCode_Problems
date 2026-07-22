class Solution {
    public String intToRoman(int num) {
        if(num==0){
            return new String("");
        }
        HashMap<Integer,String> table = new HashMap<>();
        table.put(0,"");
        table.put(1000,"M");
        table.put(2000,"MM");
        table.put(3000,"MMM");

        table.put(100,"C");
        table.put(200,"CC");
        table.put(300,"CCC");
        table.put(400,"CD");
        table.put(500,"D");
        table.put(600,"DC");
        table.put(700,"DCC");
        table.put(800,"DCCC");
        table.put(900,"CM");

        table.put(10,"X");
        table.put(20,"XX");
        table.put(30,"XXX");
        table.put(40,"XL");
        table.put(50,"L");
        table.put(60,"LX");
        table.put(70,"LXX");
        table.put(80,"LXXX");
        table.put(90,"XC");

        table.put(1,"I");
        table.put(2,"II");
        table.put(3,"III");
        table.put(4,"IV");
        table.put(5,"V");
        table.put(6,"VI");
        table.put(7,"VII");
        table.put(8,"VIII");
        table.put(9,"IX");

    int x=(int)Math.pow(10,(int)Math.log10(num)+1);
    String str = "";
    
    while(x!=0){
        str = str+table.get((int)(num/x)*x);
        num%=x;
        x/=10;
    }

    return str;
    }
}