package dsa.arrays.medium.leadersInArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Optimal {

    public int[] leaders(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.length;
        int j = n-1, i = n-2;
        temp.add(arr[j]);

        while(i > 0 && j > 0){
            if(arr[i] > arr[j]){
                temp.add(arr[i]);
                j = i;
                i--;
            }else{
                i--;
            }
        }
        Collections.reverse(temp);

        int[] ans = new int[temp.size()];
        for(int k = 0; k<temp.size();k++){
            ans[k] = temp.get(k);
        }
        return ans;
    }

    public static void main(String args[]){
        int[] arr = {1,2,5,3,1,2};

        Optimal o = new Optimal();
        int[] finalAns = o.leaders(arr);

        for(int i : finalAns){
            System.out.print(i +" ");
        }
    }
}
