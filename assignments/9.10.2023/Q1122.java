import java.util.Arrays;

public class Q1122 {
    class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pos = 0;

        for(int i = 0 ; i < arr2.length ; i++){
            for(int j = pos ; j < arr1.length ; j++){
                if(arr2[i] == arr1[j]){
                    int tmp = arr1[j];
                    arr1[j] = arr1[pos];
                    arr1[pos] = tmp;
                    pos++;
                }
            }
        }

        int n = pos;
        int[] arr = new int[arr1.length - pos];
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = arr1[pos];
            pos++;
        }

        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            arr1[n] = arr[i];
            n++;
        }

        return arr1;
    }
}
}
