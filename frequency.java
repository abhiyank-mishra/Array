import java.util.*;

public class frequency {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] a = { 1, 1, 1 };
        int[] b = { 2, 4, 6 };

        // usko chahiye - 121416
        // tumhara - 111246

        //Output => [1,2,3,4,5,6]

        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        System.out.println(list);

        int j = 0;
        for (int i = 1; i < b.length+a.length; i=i+2) {
            list.add(i, b[j]);
            j++;
        }
        
        System.out.println(list);
    }
}