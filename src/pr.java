import java.io.*;
import java.util.*;

public class pr {

    public static int countCustomer(int[] bill ){
        int answer = 0;
        int n = bill.length;
        for(int i = 0; i<n; i++){
            double sq = (Math.sqrt(bill[i]));
            double x = sq-Math.floor(sq);
            if(x == 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int bill_size = in.nextInt();
        int bill[] = new int[bill_size];
        for(int idx = 0; idx < bill_size; idx++){
            bill[idx] = in.nextInt();
        }
        int result = countCustomer(bill);
        System.out.print(result);
    }
}
