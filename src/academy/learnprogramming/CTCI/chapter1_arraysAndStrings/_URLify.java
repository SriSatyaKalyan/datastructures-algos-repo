package academy.learnprogramming.CTCI.chapter1_arraysAndStrings;

public class _URLify {
    public static void main(String[] args) {
        String s = "Mr John Smith   ";
        int trueLength = 13;
        convertIntoURL(s, trueLength);
    }

    private static String convertIntoURL(String s, int trueLength) {
        System.out.println("the length of the string is " + s.length());

//        return (s.substring(0, 13).replace(" ", "%20"));  //but this is not in-place
        char[] stringArray = s.toCharArray();
        int spaceCount = 0, index = 0, i=0;
        for(i = 0; i < trueLength; i++){
            if(stringArray[i] == ' '){
                spaceCount++;
            }
        }

        System.out.println("spaceCount is: " + spaceCount);
        index = (trueLength + (spaceCount * 2)); //There need to be only two spaces added as there is already one space present for ' '
        System.out.println("index is " + index);

        System.out.println("index | i" );
        for(i = trueLength-1; i >= 0 && index >= 1; i--){
            System.out.println(index + "     " + i + " ");
            if(stringArray[i] == ' '){
                stringArray[index-1] = '0';
                stringArray[index-2] = '2';
                stringArray[index-3] = '%';
                index = index-3;
            }else{
                stringArray[index-1] = stringArray[i];
                index--;
            }
        }


        for(char c:stringArray){
            System.out.print(c);
        }

        System.out.print("|");
        return stringArray.toString();
    }
}

//time complexity: O(n)
//space complexity: O(1 - Two Sum)