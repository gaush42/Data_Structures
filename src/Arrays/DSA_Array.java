package Arrays;
import java.util.*;

class DSA_Array{

    public static void ReverseArray(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void MaxAndMin(int[] arr){
        int len = arr.length;
        int min=0,max=0;
        for(int i=0;i<len;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        System.out.print("Min "+ arr[min]+" "+ "Max "+ arr[max]);
    }
    public static void KthMinAndMax(int[] arr){
        int len = arr.length;
        int k=1;
        for(int i=0;i<len; i++){
            for(int j=i; j<len; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n"+ "Kth min "+arr[k-1] + "  Kth max "+ arr[len-k]);
    }
    public static void Sort012(){
        int[] arr = {1,2,0,2,1,0,0};
        int count_0=0;
        int count_1=0;
        int count_2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count_0++;
            }
            if(arr[i]==1){
                count_1++;
            }
            if(arr[i]==2){
                count_2++;
            }
        }
        for(int i=0;i<count_0;i++){
            arr[i]=0;
        }
        for(int i=count_0;i<count_0+count_1;i++){
            arr[i]=1;
        }
        for(int i=count_0+count_1;i<arr.length;i++){
            arr[i]=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void NegativeElimentOneSide(){
        int[] arr = {-2,4,7,-6,9,-4};
        int j=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
                
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Union(){
        int[] a={85, 25, 1, 32, 54, 6};
        int[] b={85, 2};
        int len = a.length + b.length;
        int arr[] = new int[len];
        int ind =0;
        for(int i=0;i<a.length;i++){
            arr[ind]=a[i];
            ind+=1;
        }
        for(int i=0;i<b.length;i++){
            arr[ind]=a[i];
            ind+=1;
        }
        int n = ind;
        Arrays.sort(arr);
        int count = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                continue;
            }
            count +=1;
        }
        
        System.out.println(count);
    }
    public static void RotateArrayByOne(){
        int a[] = {1,2,3,4,5};
        int n = a.length;

        int t = a[n-1];
        for(int i=n-2;i>=0;i--){
            a[i+1] = a[i];
        }
        a[0] = t;

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void RotateArr(){
        int a[] = {1,3,5,7,8};
        int n = a.length;

        int t = a[n-1];
    }
    public static void TravelPass(){
        Scanner sc = new Scanner(System.in);
        int t=0;
        if(sc.hasNextInt()){
            t=sc.nextInt();
        }
        while(t>0){

            int n=sc.nextInt();
            //int a=sc.nextInt();
            //int b=sc.nextInt();
            char[] s = new char[n];
            for(int i=0;i<n;i++){
                s[i]=sc.next().charAt(i);
            }

            for(int i=0;i<n;i++){
                System.out.println(s[i]);
            }


            t--;
        }
    }
    public static void removeDuplicates (char[] arg) {
        // return result;
        int start = 0;
        int end = arg.length-1;

        LinkedHashSet ch = new LinkedHashSet();
        while(start<end){
            char t = arg[start];
            arg[start] = arg[end];
            arg[end] = t;
            start++;
            end--;
        }
        for(int i=0;i<arg.length;i++){
            ch.add(arg[i]);
        }
        //Object[] objects = ch.toArray();
        String s = ch.toString();

        char[] cc = s.toCharArray();
        start = 0;
        end = cc.length-1;
        while(start<end){
            char t = cc[start];
            cc[start] = cc[end];
            cc[end] = t;
            start++;
            end--;
        }

        for(int i=0;i<cc.length;i++){
            System.out.print(cc[i]);
        }
        //System.out.println(s);

        //return cc;


    }
    public static void countWordOccurrences (String text) {
        // return "dog,1\ncat,2";
        int i,len,count,j,k;
        String word, result;

        String newText = text.replaceAll("[?!,.]","");
        String lText = newText.toLowerCase();

        String words[] = lText.split(" ");
        len = words.length;

        for(i=0;i<len;i++){
            word = words[i];
            count=1;
            for(j=(i+1); j<(len-1);j++){
                if(word.equals(words[j])){
                    count++;
                    for(k=j; k<(len-1);k++){
                        words[k] = words[k+1];
                    }
                    len--;
                    j--;
                }
            }
            System.out.println(word+ " occurs " +count);
            count = 0;
        }
    }
    public static void ReverseSentence(){
        String input = "   Hello How       are you   ";
        //String Space = input.replaceAll("\\s+"," ");
        String strArrray[] = input.split(" ");
        String output = "";

        for(int i=strArrray.length;i>0;i--){
            output = output +" " +strArrray[i-1];
        }
        output = output.replaceAll("\\s+"," ");
        System.out.println(output);
        for(int i=0;i<strArrray.length;i++){
            System.out.println(strArrray[i]);
        }
    }
    public static int Reverse_Int(int x){
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int res = 0;
        while (x > 0) {
            if (Integer.MAX_VALUE / 10 < res || (Integer.MAX_VALUE - x % 10) < res * 10) {
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }

        return sign * res;
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int[] arr = {7,9,2,4,6,3};
        //ReverseArray(arr);
        //MaxAndMin(arr);
        //KthMinAndMax(arr);
        //Sort012();
        //NegativeElimentOneSide();
        //Union();
        //RotateArrayByOne();
        //TravelPass();
        //char[] a = {'a', 'b', 'a', 'b', 'c', 'd', 'd', 'e', 'a', 'd'};
        //char[] b = removeDuplicates(a);
        //removeDuplicates(a);
        //String s = "Hey How, you you hey, yo?";
        //System.out.println(countWordOccurrences(s));
        //ReverseSentence();
        //System.out.println(Reverse_Int(-1534236469));

    }
}