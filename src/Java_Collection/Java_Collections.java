package Java_Collection;
import java.util.*;

public class Java_Collections {

    public static void ArrayListExamples(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(11);


        System.out.println(arrayList);

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(4);
        System.out.println(arrayList);
        arrayList.add(4,9);
        System.out.println(arrayList);
        arrayList.set(1,50);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains(9));
        System.out.println(arrayList.indexOf(10));
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        ArrayListExamples();
    }
}
