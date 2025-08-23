package dsa.arrays.easy.consecutiveOnes;

public class Optimal {
    public int ones(int[] arr){
        int count = 0, maxCount = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 1)
                count++;
            else
                count = 0;
            maxCount = Integer.max(count,maxCount);
        }
        return maxCount;
    }

    public static void main(String args[]){
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        Optimal b = new Optimal();

        int ans = b.ones(arr);
        System.out.println(ans);
    }
}
