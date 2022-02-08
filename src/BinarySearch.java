public class BinarySearch {

    public static int BinarySearch(int arr[], int x, int low, int high){
        if(low<=high) {
            int mid = low + (high - low) / 2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                return BinarySearch(arr,x,low,mid-1);
            }
            return BinarySearch(arr,x,mid+1,high);

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 12, 67, 123, 125};
        int n = arr.length;
        int res = BinarySearch(arr,67,0,n-1);
        System.out.println(arr[res]+" is present at index " +res);
    }
}
