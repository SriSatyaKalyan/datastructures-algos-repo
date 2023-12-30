package academy.learnprogramming.leetCode;

public class _2264largest3SameDigitNumberInString {

    public static void main(String[] args) {
        String num = "6777188839";
        System.out.println("The string is: " + largestgoodInteger(num));
    }

    private static String largestgoodInteger(String num) {
        if(num.length() <= 2) return "";
        int index = -1;

        for(int i = 2; i < num.length(); i++){
            System.out.println(index + " || " + num.charAt(i));
            if(num.charAt(i) == num.charAt(i-1) && num.charAt(i) == num.charAt(i-2) && (index == -1 || num.charAt(index) < num.charAt(i))){
                System.out.println("Entered the condition");
                index = i;
            }
        }

        if(index == -1) return "";
        return num.substring(index - 2 , index + 1);
    }
}
