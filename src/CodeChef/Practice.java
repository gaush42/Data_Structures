package CodeChef;

public class Practice {
    public static void main(String[] args) {
        int n=12345;
        int t=n;
        int sum=0;
        while (n!=0){
            int r = n%10;
            sum=sum+r;
            n/=10;
        }
        System.out.println(sum);
    }
}
