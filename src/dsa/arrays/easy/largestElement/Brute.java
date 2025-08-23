package dsa.arrays.easy.largestElement;
import java.util.*;

public class Brute {
    public int largest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String args[]){
        Brute b = new Brute();
        int[] arr = {3,4,5,1};
        long startTime = System.nanoTime();
        int ans = b.largest(arr);
        long finishTime = System.nanoTime();

        long durationInNanos = finishTime - startTime;
        double durationInMicros = durationInNanos / 1000.0;
        double durationInMillis = durationInNanos / 1000000.0;

        System.out.println("The largest element is: " + ans);
        System.out.println("Execution Time: " + durationInNanos + " nanoseconds");
        System.out.println("Execution Time: " + String.format("%.2f", durationInMicros) + " microseconds");
        System.out.println("Execution Time: " + String.format("%.2f", durationInMillis) + " milliseconds");

    }

}

