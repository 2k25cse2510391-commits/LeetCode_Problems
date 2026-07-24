class Solution {
    static HashMap<Character,List<String>> ls = new HashMap<>();
    static List<String> list_str = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        ls.put('2',new ArrayList<>(List.of("a", "b", "c")));
        ls.put('3',new ArrayList<>(List.of("d", "e", "f")));
        ls.put('4',new ArrayList<>(List.of("g", "h", "i")));
        ls.put('5',new ArrayList<>(List.of("j", "k", "l")));
        ls.put('6',new ArrayList<>(List.of("m", "n", "o")));
        ls.put('7',new ArrayList<>(List.of("p", "q", "r","s")));
        ls.put('8',new ArrayList<>(List.of("t", "u", "v")));
        ls.put('9',new ArrayList<>(List.of("w", "x", "y","z")));
        StringBuilder str = new StringBuilder();
        list_str.clear();
        sol(str,digits,0);
        return list_str;
    }

    public static void sol(StringBuilder str , String Digit , int value){
        if(value==Digit.length()){
            list_str.add(str.toString());
            return;
        }

        for(String s : ls.get(Digit.charAt(value))){
            str.append(s);
            sol(str,Digit,value+1);
            str.deleteCharAt(str.length()-1);
        }

    }
}