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
    void SelectionSort(int[] arr){
         int n=arr.length;
         for(int i=0;i<n-1;i++){
             int min_index=i;
             for(int j=i+1;j<n;j++){
                 if(arr[j]<arr[min_index]){
                     min_index=j;
                 }
             }
             int t = arr[min_index];
             arr[min_index] = arr[i];
             arr[i] = t;
         }
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,8,1,4,6,3};
        sorting s = new sorting();
        //s.BubbleSort(arr);
        //s.InsertionSort(arr);
        s.SelectionSort(arr);
    }
}
