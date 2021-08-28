import java.util.*;

public class prime {

    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 2; i <= num; i++)
        {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
}
