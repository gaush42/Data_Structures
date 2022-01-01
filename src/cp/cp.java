package cp;
import java.util.*;
import java.lang.*;
import java.io.*;

public class cp {
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

        //TravelPass();
        Placement();
    }
}