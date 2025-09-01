package dsa.arrays.logicbuilding.removeDuplicatesFromSortedArray;

import java.util.Set;
import java.util.TreeSet;

public class Brute {

    public int removeDuplicates(int[] arr){

        Set<Integer> s = new TreeSet<>();

        for(int i : arr){
            s.add(i);
        }

        int j = 0 ,k = s.size();
        for(int i : s){
            arr[j++] = i;
        }

        return k;
    }

    public static void main(String args[]){
        int[] arr = {0,0,3,3,5,6};

        System.out.println("Array before alteration:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        Brute b = new Brute();
        int ans = b.removeDuplicates(arr);

        System.out.println("Array after alteration");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Answer:" +ans);
    }
}
