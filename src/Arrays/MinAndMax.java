package Arrays;

public class MinAndMax {
    public int max(int[] a){
        int max = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public int min(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {10,7,3,16,5,6};
        MinAndMax m = new MinAndMax();
        System.out.println(m.max(a));
        System.out.println(m.min(a));
    }
}
