import java.util.*;

public class printSubarraySum {
    public static void printSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                int currSum =0;
                for(int k=i; k<=j; k++) {
                     currSum += numbers[k];
                 }
                 System.out.println(currSum);
                 if(maxSum < currSum) {
                 maxSum = currSum;
                 }
            }
        }
        System.out.println("max Subarray Sum is " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarraySum(numbers);
    }
}
