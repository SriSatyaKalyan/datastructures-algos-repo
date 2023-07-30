package academy.learnprogramming.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _1700numberOfStudentsUnableToEatLunch {

    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        System.out.println("The returned value is: " + countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int count = students.length;

        List<Integer> studs = new ArrayList<>();

        for(int i : students){
            studs.add(i);
        }

        int noOfSandwiches = 0;
        while(count > 0){
            System.out.println(studs.get(0) + " || " + sandwiches[noOfSandwiches]);
            if(studs.get(0) == sandwiches[noOfSandwiches]){
                studs.remove(0);
                noOfSandwiches++;
                count--;
            }else{
                int moves = 0;
                while(studs.get(0) != sandwiches[noOfSandwiches]){
                    if(moves == count){
                        return count;
                    }else{
                        studs.add(studs.get(0));
                        studs.remove(0);
                        moves++;
                    }
                }
            }
        }

        return 0;
    }
}
