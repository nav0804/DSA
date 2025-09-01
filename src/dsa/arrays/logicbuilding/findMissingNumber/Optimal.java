package dsa.arrays.logicbuilding.findMissingNumber;

public class Optimal {

    public int findNumber(int[] arr){
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        return expectedSum - sum;
    }

    public static void main(String args[]){
        int[] arr = {0,2,3,1,4};

        Optimal o = new Optimal();
        int ans = o.findNumber(arr);

        System.out.println("Answer:" +ans);
    }
}
