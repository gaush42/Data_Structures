public class BinarySearch {

    public static int[] BinarySearch(int arr[], int x, int low, int high){
        int res[] = {-1,-1};
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==x){
                res[0]=mid;
                high=mid-1;
            }
            if(arr[mid]>x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        low=0;
        high= arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==x){
                res[1]=mid;
                high=mid+1;
            }
            if(arr[mid]>x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int n = arr.length;
        int[] res = BinarySearch(arr,67,0,n-1);
        System.out.println(res[0] +" "+res[1]);
    }
}
