import java.util.*;

public class recursionBasics {

    //Print in Decreasing order.
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    //Print in Increasing order.
    public static void printInc(int n) {
        if(n==1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    //Print Factorial
    public static int printFact(int n) {
        if(n == 0) {
            return 1;
        }
        int fnm1 = printFact(n-1);
        int fn = n * printFact(n-1);
        return fn;
    }

    //Sum of n natural no.
    public static int naturalSum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = naturalSum(n-1);
        int sumOfn = n + snm1;
        return sumOfn;
    }

    //Calculate Fibonacci series
    public static int calcFib(int n) {
        if(n == 0) {
            return 0;
        } if (n == 1){
            return 1;
        }
      
      int fibNm1 = calcFib(n-1);
      int fibNm2 = calcFib(n-2);
      int fibN = fibNm1 + fibNm2;
      return fibN;
    }

    //Sorted an array
    public static boolean sortArray(int[] arr, int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return sortArray(arr, i+1);
    }

    //First Occurence
    public static int firstccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstccurence(arr, key, i+1);
    }

    //Last occurence
    public static int lastOcurrence(int arr[], int key, int i) {
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcurrence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        //optimized way.
        return x * power(x, n-1);

    }

    //Tiling Problem
    public static int tilingProblem(int n) {
        //base case
        if(n==0 || n ==1){
            return 1;
        }
        //main kaam
        //verticle calculation
        int fnm1 = tilingProblem(n-1);

        //horizontal calculation
        int fnm2 = tilingProblem(n-2);

        //inner call
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String args[]) {
        //int n=36;
      //  printDec(10);
      //  printInc(10);
     // System.out.println(printFact(5));
    // System.out.println(naturalSum(10));
    //System.out.println(calcFib(n));

    // int arr[] = {1,2,3,4};
    // System.out.println(sortArray(arr, 0));

    // int arr[] = {1,2,3,4,5,6,4};
    // System.out.println(lastOcurrence(arr, 4, 0));

   // System.out.println(power(2, 10));
    System.out.println(tilingProblem(4));
    }
}
