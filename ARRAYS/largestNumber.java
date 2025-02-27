
import java.util.*;

public class largestNumber {

    public static int getLargest(int numbers[]) {

        //Time complexity - O(n).
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;


    //    Most optimized way - TC - O(1).
    //    Arrays.sort(numbers);
    //    return numbers[numbers.length-1];
    }
    public static void main(String args[]) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("largest number is : " + getLargest(numbers));
    }
}
