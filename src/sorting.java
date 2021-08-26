import java.util.*;

public class sorting {
     void BubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    void InsertionSort(int[] arr){
         for(int i = 1; i<arr.length; i++){
             int temp = arr[i];
             int j = i-1;
             while(j>=0&&temp<=arr[j]){
                 arr[j+1]=arr[j];
                 j=j-1;
             }
             arr[j+1] = temp;
         }
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,8,1,4,6,3};
        sorting s = new sorting();
        //s.BubbleSort(arr);
        s.InsertionSort(arr);
    }
}
