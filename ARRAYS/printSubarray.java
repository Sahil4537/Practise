import java.util.*;

public class printSubarray {
    public static void printSubarray(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(numbers[k] + " ");

                    //sum of sub-arrays
                    // int sum = numbers[i] + numbers[j];
                    // System.out.println("Sum of subarray is: " + sum);
                    
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarray(numbers);
    }
}
