package Striver_SDE_Sheet;

import java.util.*;

public class Sheet_Recursion {

    static void SubsetSumHelper(int index, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> subsetSum){
        if(index == N){
            subsetSum.add(sum);
            return;
        }
        SubsetSumHelper(index+1,sum+arr.get(index),arr,N,subsetSum);
        SubsetSumHelper(index+1,sum,arr,N,subsetSum);
    }
    static ArrayList<Integer> SubsetSum(ArrayList<Integer> arr){
        int n =arr.size();
        ArrayList<Integer> sumSubset = new ArrayList<>();
        SubsetSumHelper(0,0,arr,n,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    static void SubsetHelper(int[] arr, int i, List<Integer> cur, List<List<Integer>> ans){
        if(i==arr.length){
            ans.add(new ArrayList<Integer>(cur));
            return;
        }
        cur.add(arr[i]);
        SubsetHelper(arr, i+1, cur, ans);
        cur.remove(cur.size()-1);
        SubsetHelper(arr,i+1,cur,ans);
    }
    static List<List<Integer>> AllSubset(int[] arr){
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        SubsetHelper(arr,0,cur,ans);
        return ans;
    }
    static void UniqueSubsetHelper(int[] arr, int index, List<Integer> cur, List<List<Integer>> ans){
        ans.add(new ArrayList<Integer>(cur));
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i] == arr[i-1]){
                continue;
            }
            cur.add(arr[i]);
            UniqueSubsetHelper(arr,i+1,cur,ans);
            cur.remove(cur.size()-1);
        }
    }
    static List<List<Integer>> UniqueSubset(int[] arr){
        Arrays.sort(arr);
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        UniqueSubsetHelper(arr,0,cur,ans);

        return ans;
    }
    static void CombinationSumHelper(int[] arr,int index,int target,List<Integer> cur, List<List<Integer>> ans){
        if(index == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(cur));
            }
            return;
        }
        if(arr[index] <= target){
            cur.add(arr[index]);
            CombinationSumHelper(arr,index,target-arr[index], cur, ans);
            cur.remove(cur.size()-1);
        }
        CombinationSumHelper(arr,index+1,target,cur,ans);
    }
    static List<List<Integer>> CombinationSum(int[] arr, int target){
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        CombinationSumHelper(arr,0,target,cur,ans);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        int[] subarr = {2,3,6,7};
        int target = 7;
        //System.out.println(SubsetSum(arr));
        //System.out.println(AllSubset(subarr));
        System.out.println(UniqueSubset(subarr));
        //PrintCombinationSum(subarr,target);
        //List<List<Integer>> ls = CombinationSum(subarr,target);
        //System.out.println(CombinationSum(subarr,target));

    }
}
