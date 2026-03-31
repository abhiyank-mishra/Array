public class remove_zero_and_send_them_in_last {
    public static void main(String[] args) {
        int a[] = { 5, 0, 0, 3, 2, 0, 1, 4 };
        int n = a.length;
        int c = 0;
        for (int i = 0; i < n;i++) {
            if (a[i] != 0) {
                System.out.print(a[i]+ " ");
                c++;
            }
        }
        for (int i = n - (c-2); i < n;i++) {
            System.out.print(0+" ");
        }
    }
}
