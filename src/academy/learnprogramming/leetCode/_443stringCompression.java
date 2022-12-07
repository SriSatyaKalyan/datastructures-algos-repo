package academy.learnprogramming.leetCode;

public class _443stringCompression {

    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'a', 'a', 'b', 'b', 'c', 'd'};

        System.out.println("The length of the new array is: " + compress(chars));
        for(char c: chars){
            System.out.print(c + " || ");
        }
    }

    private static int compress(char[] chars) {
        int ans=0, j=0;
        while(j < chars.length){
            char c = chars[j];
            int count = 0;
            while((j < chars.length) && chars[j] == c){
                j++;
                count++;
            }
            chars[ans++] = c;
            if(count != 1){
                for(char d : Integer.toString(count).toCharArray()){
                    chars[ans++] = d;
                }
            }
        }
        return ans;
    }
}
