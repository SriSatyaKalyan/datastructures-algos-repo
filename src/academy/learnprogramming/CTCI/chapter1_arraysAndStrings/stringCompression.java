package academy.learnprogramming.CTCI.chapter1_arraysAndStrings;

import java.util.HashMap;

public class stringCompression {

    public static void main(String[] args) {
        char[] arr = {'a','a','b','b','c','c','c', 'a', 'a'};
        char[] arrII = {'a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        compressTheString(arr);
    }

    private static int compressTheString(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c:chars){
            System.out.print(c + " ");
        }
        System.out.println();

        for(char c:chars){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c)+1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c:map.keySet()){
            System.out.println(c + " " + map.get(c));
            sb.append(c);
            if(map.get(c) > 1){
                sb.append(map.get(c));
            }
        }

        String newString = sb.toString();
        System.out.println("newString is " + newString);
        int newLength = chars.length < newString.length() ? chars.length : newString.length();
        for(int i=0; i < newLength; i++){
            System.out.println("i: " + i + " | " + " newString.charAt(i): " + newString.charAt(i));
            chars[i] = newString.charAt(i);
        }

        for(char c:chars){
             System.out.print(c + " ");
        }

        return (sb.length());
    }


}
