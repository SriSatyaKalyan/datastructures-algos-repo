package academy.learnprogramming.leetCode;

import java.util.Arrays;

public class _161oneEditDistance {

    public static void main(String[] args) {
        String s = "abcde";
        String t = "abcde";

        System.out.println("\nIs there one edit distance between s: \"" + s + "\" and t: \"" + t + "\"? " + isOneEditDistance(s, t));
    }

    private static boolean isOneEditDistance(String s, String t) {
        if(s.equals(t)) { return false; }

        if(Math.abs(s.length() - t.length()) <= 1){
            if(t.length() > s.length()) {
                return diffElement(s, t, 0);
            }
            else if(t.length() < s.length()) {
                return diffElement(s, t, 1);
            }
            else{
                return diffElement(s, t, 2);
            }
        }

        return false;
    }

    private static boolean diffElement(String s, String t, int state) {
        for(int i = 0; i < ((s.length() < t.length()) ? s.length() : t.length()); i++){
            if(s.charAt(i) != t.charAt(i)) {
                if(state == 0){
                    //adding element into s
                    return s.substring(i).equals(t.substring(i+1));
                } else if (state == 1) {
                    //remove element from s
                    return s.substring(i+1).equals(t.substring(i));
                } else {
                    //replacing element in s
                    return s.substring(i+1).equals(t.substring(i+1));
                }
            }
        }
        return true;
    }
}