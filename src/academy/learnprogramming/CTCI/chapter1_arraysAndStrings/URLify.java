package academy.learnprogramming.CTCI.chapter1_arraysAndStrings;

import java.util.Arrays;

public class URLify {

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        char[] arr = s.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        System.out.println("The trueLength is " + trueLength);
        replaceSpaces(arr, trueLength);
//        System.out.println("\n" + "The URLified version of the string is: " + s);
    }

    private static int findLastCharacter(char[] arr) {
        for(int i = arr.length - 1; i > 0 ; i--){
            if(arr[i] != ' '){
                System.out.println("The last character is at " + i);
                return i;
            }
        }

        return -1;
    }

    //when in-place modification is mandated
    private static void replaceSpaces(char[] arr, int trueLength){
        int spaceCount = 0;
        for(int i = 0; i < trueLength; i++){
            if(arr[i] == ' '){
                spaceCount++;
            }
        }

        int index = trueLength + (spaceCount * 2);
        System.out.println("The index is " + index);

        for(int i = trueLength - 1; i > 0; i--){
            if(arr[i] == ' '){
                arr[index - 1] = '0';
                arr[index - 2] = '2';
                arr[index - 3] = '%';
                index = index - 3;
            }else{
                arr[index - 1] = arr[i];
                index--;
            }
        }

        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j]);
        }
    }

    //when in-place modification is not mandated
    private static String URL(String s) {
        char[] str = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : str){
            if(Character.isWhitespace(c)){
                sb.append("%20");
            }else{
                sb.append(c);
            }

        }

        return sb.toString();
    }
}
