package Striver_SDE_Sheet;

import java.util.*;

public class SheetArrays {

    static void BruteForceSetMatrixToZero(){
        /*
        Time Complexity:O((N*M)*(N + M)).
        O(N*M) for traversing through each element and
        (N+M)for traversing to row and column of elements having value 0.
        Space Complexity:O(1)
        */
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[row][col];

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                mat[r][c]=sc.nextInt();
            }
        }
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(mat[r][c] == 0){

                    int ind = r-1;
                    while(ind >=0){
                        if(mat[ind][c] !=0){
                            mat[ind][c] = -1;
                        }
                        ind--;
                    }
                    ind=r+1;
                    while(ind<row){
                        if(mat[ind][c] != 0){
                            mat[ind][c] = -1;
                        }
                        ind++;
                    }
                    ind = c-1;
                    while(ind >=0){
                        if(mat[r][ind]!=0){
                            mat[r][ind] = -1;
                        }
                        ind--;
                    }
                    ind = c+1;
                    while(ind < col){
                        if(mat[r][ind]!=0){
                            mat[r][ind]=-1;
                        }
                        ind++;
                    }
                }
            }
        }
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(mat[r][c] <= 0){
                    mat[r][c]=0;
                }
            }
        }
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }

    static void BetterApprochSetMatrixToZero() {
        //Time Complexity: O(N*M + N*M)
        //Space Complexity: O(N)

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        int dummy1[] = new int[row];
        int dummy2[] = new int[col];
        Arrays.fill(dummy1, -1);
        Arrays.fill(dummy2, -1);

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                mat[r][c] = sc.nextInt();
            }
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (mat[r][c] == 0) {
                    dummy1[r] = 0;
                    dummy2[c] = 0;
                }
            }
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (dummy1[r] == 0 || dummy2[c] == 0) {
                    mat[r][c] = 0;
                }
            }
        }
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }
    static void PascalTriangle(){
        int row=5;
        for(int i=0;i<row;i++){
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    static int MaxSubArray(int[] arr){
        int sum=0;
        int max = 5;
        int c=0;
        for(int i=0;i<arr.length;i++){
            c++;
            sum += arr[i];
            if(sum>=max){
                max=sum;
                return c;
            }
            if(sum<0){
                sum=0;
            }
        }
        return -1;
    }
    static int BuyAndSellStock(int[] nums){
        int maxProfit=0;
            int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<minPrice){
                minPrice=nums[i];
            }else if(nums[i]-minPrice > maxProfit){
                maxProfit = nums[i]-minPrice;
            }
        }
        return maxProfit;
    }
    static void Roatate2DArray(){

    }
    static int FindDuplicate(int[] arr){
        return 0;
    }
    static void SubsetSumHelper(int index, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset){
        if(index == N){
            sumSubset.add(sum);
            System.out.println(sum);
            return;
        }
        SubsetSumHelper(index+1,sum+arr.get(index), arr, N, sumSubset);
        SubsetSumHelper(index+1, sum,arr,N,sumSubset);
    }
    static ArrayList<Integer> SubsetSum(ArrayList<Integer> arr){
        int n = arr.size();
        ArrayList<Integer> sumSubset = new ArrayList<>();
        SubsetSumHelper(0,0,arr,n,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    static double myPow(double x, int n) {
        double pw=1;

        for(int i=1;i<=n;i++){
            pw = pw*x;
            System.out.println(pw);
        }
        return pw;
    }

    public static void main(String[] args) {
        int[] num = {10,3};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        //BruteForceSetMatrixToZero();
        //BetterApprochSetMatrixToZero();
        //PascalTriangle();
        System.out.println(MaxSubArray(num));
        //System.out.println(BuyAndSellStock(num));
        //System.out.println(SubsetSum(arr));
        //System.out.println(myPow(2,-2));
    }
}
