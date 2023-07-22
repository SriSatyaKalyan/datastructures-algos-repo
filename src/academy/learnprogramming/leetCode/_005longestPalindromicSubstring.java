package academy.learnprogramming.leetCode;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Objects;

public class _005longestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "aacabdkacaa";
//        String s = "java";
        System.out.println("The longest palindromic string is: " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);

        int maxLength = 0;
        String answer = s.substring(0,1);
//        System.out.println(answer);

        for(int p1 = 0; p1 < sb.length(); p1++){
            for(int p2 = sb.length() - 1; p2 >= p1 + maxLength; p2--){
                System.out.println("p1: " + p1 + " || p2: " + p2 + " || sb.charAt(p1): " + sb.charAt(p1) + " || sb.charAt(p2) " + sb.charAt(p2));
                if(sb.charAt(p1) == sb.charAt(p2)){
                    if(checkForPalindrome(sb.subSequence(p1, p2+1).toString()) && sb.subSequence(p1, p2+1).toString().length() > maxLength){
                        answer = sb.subSequence(p1, p2+1).toString();
                        maxLength = sb.subSequence(p1, p2+1).toString().length();
                    }
                }
            }
        }

        return answer;
    }

    private static boolean checkForPalindrome(String string) {
        StringBuilder strB = new StringBuilder(string);

        System.out.println(strB);
        System.out.println(strB.reverse());
        System.out.println("------------------");

        if(strB.toString().equals(strB.reverse().toString())) {
            System.out.println("These are the same in equals");
        }

        return (strB.toString().equals(strB.reverse().toString()));
    }
}
