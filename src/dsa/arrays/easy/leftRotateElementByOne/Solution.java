package dsa.arrays.easy.leftRotateElementByOne;

import java.util.Arrays;

public class Solution {

    public int[] rotation(int[] arr){
        int n = arr.length;
        int first = arr[0];
        for(int i = 1 ; i < n;i++){
            arr[i-1] = arr[i];
        }
        arr[n - 1] = first;
        return arr;
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        Solution s = new Solution();
        s.rotation(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
