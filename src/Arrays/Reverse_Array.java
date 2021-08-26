package Arrays;

public class Reverse_Array {

    public void Reverse_Array(int[] a , int start, int end){
        int i = 0;
        while(start<end){
            int t = a[end];
            a[end]=a[start];
            a[start]=t;
            start++;
            end--;
        }
        while(i < a.length){
            System.out.println(a[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        Reverse_Array ra = new Reverse_Array();
        int[] a = {4,8,6,9,7};
        ra.Reverse_Array(a,0,4);
    }
}

