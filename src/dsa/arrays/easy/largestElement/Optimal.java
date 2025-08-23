package dsa.arrays.easy.largestElement;

public class Optimal {

    public int largest(int[] arr){
        int large = Integer.MIN_VALUE;
        for(int i : arr){
            large = Integer.max(i,large);
        }
        return large;
    }

    public static void main(String args[]){
        Optimal o = new Optimal();
        int[] arr = {1,5,3,6,2,1};
        long startTime = System.nanoTime();
        int ans = o.largest(arr);
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
