package dsa.arrays.logicbuilding.moveZerosToEnd;

import java.util.ArrayList;
import java.util.List;

public class Brute {
    public List<Integer> moveZeros(List<Integer> arr){
        List<Integer> ans = new ArrayList<>();
        int n = arr.size();
        for(int i : arr){
            if(i!=0){
                ans.add(i);
            }
        }
        for(int i : arr){
            if(i == 0){
                ans.addLast(i);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(0);
        arr.add(2);
        Brute b = new Brute();
        List <Integer> answer = b.moveZeros(arr);

        for(int i : answer){
            System.out.print(i + " ");
        }
    }
}
