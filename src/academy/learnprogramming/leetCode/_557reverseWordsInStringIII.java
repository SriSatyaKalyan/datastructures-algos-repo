package academy.learnprogramming.leetCode;

public class _557reverseWordsInStringIII {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println("The reversed words are: " + reverseWords(s));
    }

    private static String reverseWords(String s) {
       int firstP = 0;
       int secondP = 0;
       char[] arr = s.toCharArray();

       for(int i = 0; i < arr.length+1; i++){
           if(i == arr.length || arr[i] == ' '){
               secondP = i - 1;
               while(firstP < secondP){
                   char temp = arr[firstP];
                   arr[firstP] = arr[secondP];
                   arr[secondP] = temp;
                   firstP++;
                   secondP--;
               }
               firstP = i+1;
           }
       }

       return new String(arr);
    }


//    public static String reverseThis(String str){
//        StringBuilder reversedStr = new StringBuilder();
//        int j = str.length();
//
//        for(int i = str.length() - 1; i > -1; i--){
//            reversedStr.append(str.charAt(i));
//        }
//
//        return reversedStr.toString();
//    }
}
