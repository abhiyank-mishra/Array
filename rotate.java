import java.util.*;

public class rotate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] a = { 1, 2, 2, 7, 5, 6, 2 };
        int n = 3;


        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        Collections.rotate(list, n);
        System.out.println(list);

    }
}

