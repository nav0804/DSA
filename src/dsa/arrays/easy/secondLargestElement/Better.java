package dsa.arrays.easy.secondLargestElement;

public class Better {
    public int secondLargest(int[] arr){
        int n = arr.length;
        int second = -1, largest = Integer.MIN_VALUE;
        if(n<2){
            return second;
        }
        for(int i = 0 ; i < n ; i++){
            largest = Integer.max(largest,arr[i]);
        }

        for(int i = 0 ; i < n ; i++){
            if(second < arr[i] && arr[i] != largest)
                second = arr[i];
        }
        return second;
    }
    public static void main(String args[]){
        Better b = new Better();
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
