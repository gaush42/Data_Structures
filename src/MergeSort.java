public class MergeSort {

    static void Merge(int[]arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int a[] = new int[n1];
        int b[] = new int[n2];

        for(int i=0; i<n1;i++){
            a[i]=arr[l+i];
        }
        for(int i=0; i<n2; i++){
            b[i]=arr[mid+1+i];
        }

        int i= 0;
        int j = 0;
        int k = l;

        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                arr[k]=a[i];
                 i++;
            }
            else{
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=a[i];
            k++; i++;
        }
        while(j<n2){
            arr[k]=b[j];
            k++; j++;
        }
    }

    static void MergeSort(int[] arr, int l, int r){
        if(l<r){
            int mid = l+(r-l)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr, mid+1, r);
            Merge(arr,l,mid,r);
        }
    }
    static void PrintArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        System.out.println(n);
        System.out.println(n-1);
        MergeSort(arr,0,n-1);
        PrintArray(arr);
    }
}
