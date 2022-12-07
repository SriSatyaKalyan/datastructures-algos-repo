package academy.learnprogramming.leetCode;

import java.util.Arrays;
import java.util.List;

public class _1235maximumProfitInJobScheduling {

    public static void main(String[] args) {
        int[] startTime =  {1, 2, 3, 3};
        int[] endTime =    {3, 4, 5, 6};
        int[] profit =  {50, 10, 40, 70};

        System.out.println("The max profit is: " + jobScheduling(startTime, endTime, profit));
    }

    private static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int maxProfit = 0;

        List startTimeList = Arrays.asList(startTime);
        List endTimeList = Arrays.asList(endTime);
        List profitList = Arrays.asList(profit);

        for(int i=0; i < startTimeList.size(); i++){
            maxProfit += (int) profitList.get(i);
            System.out.println("The profit here is: " + maxProfit);

            if(startTimeList.indexOf(endTimeList.get(i)) != -1){

            }

            //This needs Dynamic Programming Concepts!!
        }

        return 0;
    }
}
