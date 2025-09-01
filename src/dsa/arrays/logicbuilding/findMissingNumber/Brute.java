package dsa.arrays.logicbuilding.findMissingNumber;

public class Brute {

    public int findNumber(int[] arr){
        int n = arr.length;
        int[] temp = new int[n+1];
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            temp[arr[i]]++;
        }

        for(int i = 0 ; i < temp.length;i++){
            if(temp[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = {0,2,3,1,4};

        Brute b = new Brute();

        int ans = b.findNumber(arr);
        System.out.println("Answer:" +ans);
    }
}
