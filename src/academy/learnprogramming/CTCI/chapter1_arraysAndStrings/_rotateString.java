package academy.learnprogramming.CTCI.chapter1_arraysAndStrings;

public class _rotateString {

    public static void main(String[] args) {

//        String s = "abcde"; String goal = "cdeab";

        String s = "abcde"; String goal = "abced";
        System.out.println("Are \"" + s + "\" and \"" + goal + "\" shifted? : " +  rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        int commonLength = 0;

        if(s.length() != goal.length()){
            return false;
        }else{
            commonLength = s.length();
        }

        char c = (char) s.charAt(0);
        int startOfString = 0;
        for(int i=0; i < goal.length(); i++){
            if((char)goal.charAt(i) == c){
                System.out.println("The char is at " + i);
                startOfString = i;
                break;
            }
        }

        if(s.substring(0, commonLength - startOfString).equals(goal.substring(startOfString, commonLength)) &&
           s.substring(commonLength - startOfString, commonLength).equals(goal.substring(0, startOfString))){
            return true;
        }

        return false;
    }
}
