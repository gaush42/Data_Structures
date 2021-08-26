package Arrays;

import java.util.*;

public class UnionOfTwoArray {

    public int UnionofTwoArray(int[] a, int[] b){
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<a.length;i++){
            res.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            res.add(b[i]);
        }
        /*for(int num:a)
            res.add(num);
        for(int num:b)
            res.add(num);*/
        return res.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 3};
        int[] b = {8, 9,7,6,5};
        UnionOfTwoArray m = new UnionOfTwoArray();
        System.out.print(m.UnionofTwoArray(a,b));
    }
}
