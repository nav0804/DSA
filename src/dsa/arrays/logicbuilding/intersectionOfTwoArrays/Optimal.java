package dsa.arrays.logicbuilding.intersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.List;

public class Optimal {

    public int[] intersection(int[] arr1, int[] arr2){
        List<Integer> temp = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                temp.add(arr1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[temp.size()];
        for(int k = 0 ; k < temp.size(); k++){
            ans[k] = temp.get(k);
        }
        return ans;
    }

    public static void main(String args[]){
        int[] arr1 = {1,2,2,3,5};
        int[] arr2 = {1,2,7};

        Optimal o = new Optimal();
        int[] finalAns = o.intersection(arr1,arr2);

        for(int i : finalAns){
            System.out.print(i +" ");
        }
    }
}
