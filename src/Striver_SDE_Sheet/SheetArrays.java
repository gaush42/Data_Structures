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
    static void BetterApprochSetMatrixToZero(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        int dummy1[] = new int[row];
        int dummy2[] = new int [col];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);

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

    }

    public static void main(String[] args) {
        BruteForceSetMatrixToZero();
    }
}
