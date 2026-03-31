import java.util.*;
public class arraylist_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 3;
        for(int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(list);
        sc.close();
    }
}
