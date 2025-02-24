import java.util.*;

// public class printSubarraySum {
//     public static void printSubarraySum(int numbers[]) {
//         int maxSum = Integer.MIN_VALUE;
//         for(int i=0; i<numbers.length; i++) {
//             for(int j=i; j<numbers.length; j++) {
//                 int currSum =0;
//                 for(int k=i; k<=j; k++) {
//                      currSum += numbers[k];
//                  }
//                  System.out.println(currSum);
//                  if(maxSum < currSum) {
//                  maxSum = currSum;
//                  }
//             }
//         }
//         System.out.println("max Subarray Sum is " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printSubarraySum(numbers);
//     }
// }


//Prefix Sum Method.
public class printSubarraySum {

    public static void prefixSum(int numbers[]) {
        int currSum=0;
        int maxSum=0;
        int prefix[] = new int[numbers.length];

        //claculate prefix
        prefix[0] = numbers[0];
        for(int i=1; i<numbers.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        prefixSum(numbers);
    }

}
