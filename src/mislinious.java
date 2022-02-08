import java.util.*;

public class mislinious {

    public static int maxScore(int[] nums, int n) {
        int p=0;
        for(int i=0; i<n;i++){
            if(nums[i] > nums[p]){
                p=i;
            }
        }
        return p+1;
    }
    static int Pairs(int[] arr){
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int A[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(Pairs(A));
        //System.out.println(maxScore(A,2));
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        float amount = sc.nextFloat();
        System.out.println("Enter ecpm");
        float ecpm = sc.nextFloat();
        double impressions = 0;
        impressions = (amount/ecpm) * 1000;
        System.out.println("Impression required "+impressions);*/
    }
}
