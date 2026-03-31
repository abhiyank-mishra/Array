import java.util.*;

public class array_rotate_2D {
    public static int minner(int[][] a, int n) {
        if (a.length > 4) {
            return -1;
        }

        return (a[1][1]*a[2][2])-(a[1][2]*a[2][1]);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (sc.nextInt());
            }
        }
        System.out.println(minner(a, 1));
        sc.close();
    }
    
}
