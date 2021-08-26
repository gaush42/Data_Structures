import java.util.*;

public class mislinious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        float amount = sc.nextFloat();
        System.out.println("Enter ecpm");
        float ecpm = sc.nextFloat();
        double impressions = 0;
        impressions = (amount/ecpm) * 1000;
        System.out.println("Impression required "+impressions);
    }
}
