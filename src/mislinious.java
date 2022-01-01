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
    public static void main(String[] args) {
        int A[] = {-3,4};

        System.out.println(maxScore(A,2));
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
