package dsa.arrays.logicbuilding.removeDuplicatesFromSortedArray;

public class Optimal {

    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }

        }
        return i + 1;
    }

    public static void main(String args[]){
        int[] arr = {0,0,3,3,5,5,6,6};

        System.out.println("Array before alteration:");
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        Optimal o = new Optimal();
        int ans = o.removeDuplicates(arr);

        System.out.println("Array after alteration");
        for(int k = 0; k < ans; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        System.out.println("Answer:" + ans);
    }
}