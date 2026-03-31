public class Rotate_Array189 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int n = a.length;
        for (int i = n-1; i > k; i--) {
            System.out.print(a[i]+" ");
        }
    }
}