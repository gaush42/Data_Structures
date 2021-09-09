import java.util.*;

public class prime {

    static void isPrime()
    {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int count;
        for(int i = start ; i <= end ; i++)
        {
            //logic for checking number is prime or not
            count = 0;
            for(int j = 1 ; j <= i ; j++)
            {
                if(i % j == 0)
                    count = count+1;
            }
            if(count == 2)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {

        isPrime();
    }
}
