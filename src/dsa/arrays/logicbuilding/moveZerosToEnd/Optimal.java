package dsa.arrays.logicbuilding.moveZerosToEnd;

public class Optimal {

    public void moveZeros(int[] arr){
        int j = 0;
        int n = arr.length;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String args[]){
        int[] arr = {0,1,4,0,5,2,0};
        Optimal o = new Optimal();
        o.moveZeros(arr);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
