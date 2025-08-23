package dsa.arrays.easy.secondLargestElement;

import java.util.Arrays;

public class Brute {

    public int secondLargest(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int second = -1 , large = arr[n-1];
        if(n<2){
            return second;
        }
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] != large){
                second = arr[i];
                break;
            }
        }
        return second;
    }

    public static void main(String args[]){
        Brute b = new Brute();
        int[] arr = {2,2,4,3,3,1};

        long startTime = System.nanoTime();
        int ans = b.secondLargest(arr);
        long finishTime = System.nanoTime();

        long durationInNanos = finishTime - startTime;
        double durationInMicros = durationInNanos / 1000.0;
        double durationInMillis = durationInNanos / 1000000.0;

        System.out.println("The second largest element is: " + ans);
        System.out.println("Execution Time: " + durationInNanos + " nanoseconds");
        System.out.println("Execution Time: " + String.format("%.2f", durationInMicros) + " microseconds");
        System.out.println("Execution Time: " + String.format("%.2f", durationInMillis) + " milliseconds");


    }
}
