package cp;
import java.util.*;
import java.lang.*;
import java.io.*;

public class cp {
    static void KL(){
        Scanner sc = new Scanner(System.in);
        int t=0;
        if(sc.hasNextInt()){
            t=sc.nextInt();
        }
        //t=sc.nextInt();
        while(t>0) {

            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();

            double o1 = Math.pow(t1,2) / Math.pow(r1,3);
            double o2 = Math.pow(t2,2) / Math.pow(r2,3);

            System.out.println(o1 + "  " + o2);
            t--;
        }
    }
    static void CK(){
        Scanner sc = new Scanner(System.in);
        int t=1;
        if(sc.hasNextInt()){
            t=sc.nextInt();
        }
        while(t>0) {
            int n= sc.nextInt();
            int k= sc.nextInt();
            //k=k%(n-2);
            System.out.println(k);
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(0,1);
            for(int i=1;i<n;i++){
                ans.add(i+1);
            }
            //System.out.println(ans);
            for(int i=1;i<=k;i++){
                int c=1;
                for(int j=1;j<n;j++){
                    if(j % 2 == 0){
                        Collections.swap(ans,c,j);
                        c++;
                    }
                }
                Collections.swap(ans,n-2,n-3);
            }
            System.out.println(ans);
            t--;
        }
    }

    public static void TravelPass(){
        Scanner sc = new Scanner(System.in);
        int t=0;
        if(sc.hasNextInt()){
            t=sc.nextInt();
        }
        //t=sc.nextInt();
        while(t>0){

            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s = sc.next();
            char[] c = s.toCharArray();
            int s1=0;
            int s2=0;
            int sum=0;
            for(int i=0;i<c.length;i++){
                if(c[i] == '1'){
                    s1++;
                }
                else {
                    s2++;
                }
            }
            sum = (s1*b)+(s2*a);
            System.out.println(s1+" "+s2);
            System.out.println(sum);
            //System.out.println(s);
            t--;
        }

    }


    //Utkarsh and Placement tests December 2021 Long codechef
    public static void Placement(){
        Scanner input = new Scanner(System.in);
        int t=0;
        if(input.hasNextInt()){
            t = input.nextInt();
        }
        while(t>0){
            int j=0;
            char[] preferenceOrder = input.next().toCharArray();
            char[] offerLetter = input.next().toCharArray();

            for(int i=0; i< 3;i++){
                System.out.println(j);
                if(preferenceOrder[i] == offerLetter[j]){
                    System.out.println(preferenceOrder[i]);
                    break;

                }
                j++;
            }
            t--;
        }
    }

    public static void main(String[] args) {

        int len = 1;
        int k=100000;
        int m=100000;
        int ans;

        if(len%2==0){
            ans = (len*len)-m;
        }else {
            ans=(len*len)+k;
        }
        System.out.println(ans);
        //TravelPass();
        //Placement();
        //CK();
    }
}