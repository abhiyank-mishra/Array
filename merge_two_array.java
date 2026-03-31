public class merge_two_array {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        int b[] = { 4, 5, 6 };
        int t = a.length + b.length;
        int c[] = new int[t];

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            c[j] = a[i];
            j++;
        }
        for (int i = 0; i < b.length; i++) {
            c[j] = b[i];
            j++;
        }
        for (int i : c) {
            System.out.print(i+" ");
        }
    }
}
