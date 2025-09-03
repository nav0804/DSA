package dsa.arrays.logicbuilding.unionOfSortedList;

import java.util.ArrayList;
import java.util.List;

public class Optimal {

    public int[] unionArray(int[] arr1, int[] arr2){
        List<Integer> unionList = new ArrayList<>();
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]){
                    unionList.add(arr1[i]);
                }
                i++;
            }else{
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]){
                    unionList.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n){
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]){
                unionList.add(arr1[i]);
            }
            i++;
        }

        while(j < m){
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]){
                unionList.add(arr2[j]);
            }
            j++;
        }

        int[] ans = new int[unionList.size()];
        for(int k = 0 ; k < unionList.size();k++){
            ans[k] = unionList.get(k);
        }

        return ans;
    }

    public static void main(String args[]){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {0,0};

        Optimal o = new Optimal();
        int[] ans = o.unionArray(arr1,arr2);

        for(int i : ans){
            System.out.print(i +" ");
        }
    }
}
