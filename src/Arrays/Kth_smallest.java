package Arrays;

public class Kth_smallest {

    public int Kth_smallest(int[] arr, int k){
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        int[] arr = {8,6,7,3,4,9,10};
        int k=2;
        Kth_smallest kt = new Kth_smallest();
        System.out.println(kt.Kth_smallest(arr,k));
    }
}
