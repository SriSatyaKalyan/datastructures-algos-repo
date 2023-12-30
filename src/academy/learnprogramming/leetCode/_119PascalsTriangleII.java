package academy.learnprogramming.leetCode;

import java.util.ArrayList;
import java.util.List;

public class _119PascalsTriangleII {

    public static List<Integer> list;

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer>  pre = new ArrayList<>();
        pre.add(1);
        List<Integer> row = getRowsRecursively(1, rowIndex, pre);
//        for(int i = 0; i <= rowIndex; i++){
//            row = new ArrayList();
//            for(int j = 0; j <= i; j++){
//                if(j == 0 || j == i){
//                    row.add(1);
//                }else{
//                    row.add(pre.get(j-1) + pre.get(j));
//                }
//            }
//            pre = row;
//        }
        return row;
    }

    public static List<Integer> getRowsRecursively(int index, int rowIndex, List<Integer> pre){
        List<Integer> row = new ArrayList<>();
        if(index < rowIndex){
            for(int j = 0; j <= index; j++){
                if(j == 0 || j == index){
                    row.add(1);
                }else{
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
        }
        pre = row;
        index++;
        if(index < rowIndex) getRowsRecursively(index, rowIndex, pre);
        return pre;
    }

//    private static void generatePascalsTriangle(int index, int rowIndex, List<Integer> list) {
//        List<Integer> arr = null;
//        System.out.println("Entered the generatePascalsTriangle with index: " + index);
//
//        if (index < rowIndex) {
//            System.out.println("----------");
//            arr.add(1);
//            for (int i = 1; i <= index; i++) {
//                System.out.println("Entered the second condition: ");
//                // System.out.println("list.get(1): " + list.get(1) + " list.get(0): " + list.get(0));
//                arr.add(list.get(i) + list.get(i - 1));
//            }
//            arr.add(1);
//            index++;
//        }
//
//        if (index != rowIndex) generatePascalsTriangle(index, rowIndex, arr);
//    }
}
