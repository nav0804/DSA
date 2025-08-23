package dsa.arrays.easy.leftRotateByK;

public class Solution {

    public void revereArray(int[] arr, int i, int j){
        int n = arr.length;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public void rotation(int[] arr, int k){
        int n = arr.length;
        k = k % n ;

        revereArray(arr,0,k-1);
        revereArray(arr,k,n-1);
        revereArray(arr,0,n-1);

    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int k = 9;
        Solution s = new Solution();
        s.rotation(arr,k);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
