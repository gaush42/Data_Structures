public class QuickSort {
    static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /*static int Partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;

        for(int j = low; j<= high-1; j++){
            if(arr[j] < pivot){
                i++;
                Swap(arr,i,j);
            }
        }
        Swap(arr, i+1, high);
        return i+1;
    }
    static void QuickSort(int[] arr, int low, int high){
        if(low<high){
            int p = Partition(arr, low, high);
            QuickSort(arr, low, p-1);
            QuickSort(arr, p+1, high);
        }
    }*/

    static int Partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i=(low-1);
        for(int j=low; j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                Swap(arr,i,j);
            }
        }
        Swap(arr, i+1, high);
        return i+1;
    }

    static void QuickSort(int[]arr,int low, int high){
        if(low<high){
            int p = Partition(arr, low, high);
            QuickSort(arr, low, p-1);
            QuickSort(arr, p+1, high);
        }
    }
    static void PrintArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,8,1,4,6,3};
        int n = arr.length;
        QuickSort(arr,0,n-1);
        PrintArray(arr);
    }
}
