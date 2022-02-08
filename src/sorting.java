import java.util.*;

public class sorting {
     void BubbleSort(int[] arr){                    //TC O(N^2)
        for(int i=0; i<arr.length; i++){            //In Place Sorting
            for(int j=0; j<arr.length; j++){        //Stable
                if(arr[i]<arr[j]){                  //AS O(1)
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    void InsertionSort(int[] arr){
         for(int i = 1; i<arr.length; i++){         //TC O(N^2)
             int temp = arr[i];                     //AS O(1)
             int j = i-1;                           //In Place Sorting
             while(j >= 0 && temp <= arr[j]){       //Stable
                 arr[j+1]=arr[j];
                 j=j-1;
             }
             arr[j+1] = temp;
         }
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void SelectionSort(int[] arr){              //TC O(N^2)
         int n=arr.length;                      //AS O(1)
         for(int i=0;i<n;i++){                //Unstable
             int min_index=i;                   //In Place Sorting
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
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,4,8,1,4,6,3};
        sorting s = new sorting();
        //s.BubbleSort(arr);
        //s.InsertionSort(arr);
        s.SelectionSort(arr);
    }
}
