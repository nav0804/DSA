package dsa.arrays.medium.rearrangeElementsBySign;

import java.util.ArrayList;
import java.util.List;

public class Optimal {

    public int[] rearrange(int arr[]){
        int neg = 1, pos = 0;
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] > 0){
                ans[pos] = arr[i];
                pos+=2;
            }else{
                ans[neg] = arr[i];
                neg+=2;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int[] nums = {2, 4, 5, -1, -3, -4};
        Optimal o = new Optimal();
        int[] ans = o.rearrange(nums);

        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
