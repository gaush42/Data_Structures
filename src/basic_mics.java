import java.util.*;

public class basic_mics {

    static void Factorial(int n){ //  TC=O(N) SC=O(1)
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    static int RecursiveFact(int n){ // TC=O(N) SC=O(N)
        if(n==0){
            return 1;
        }
        return (n*RecursiveFact(n-1));
    }
    static void Fibonacci(){ // TC=O(N)
        int i=0,n=10,firstterm=0,secondterm=1;
        while(i<=n){
            System.out.print(firstterm+", ");
            int nextterm = firstterm+secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
            i++;
        }
    }
    static void Swap(){
        int a=5,b=9;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(a+" "+b);
    }
    static void ReverseString(){
        String str, rev="";
        str="abcde";
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
    static void ReverseSentence(){
        String Sen = "Hello How Are You";
        String[] str = Sen.split(" ");
        String rev = "";
        int len = str.length;
        for(int i=len-1;i>=0;i--){
            rev = rev + str[i]+" ";
        }
        System.out.print(rev);
    }
    static void Palindrome(){
        String str, rev="";
        str="Radar";
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        str = str.toLowerCase();
        rev = rev.toLowerCase();

        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
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
    static void Permutation(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int pn = RecursiveFact(n);
        int pr = RecursiveFact(n-r);
        System.out.print(pn/pr);
    }

    public static void main(String[] args) {
        //Factorial();
        //System.out.println(RecursiveFact(6));
        //Fibonacci();
        //Swap();
        //Palindrome();
        //ReverseString();
        //ReverseSentence();
        //isPrime();
        //Permutation();
    }
}
