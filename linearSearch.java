import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter elemt of Array: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        boolean flag = true;
        System.out.println("Enter search element: ");
        int search = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (a[i] == search) {
                System.out.println(i);
                flag = false;
            }
        }
        if (flag) System.out.println("-1");
        sc.close();
    }
}
