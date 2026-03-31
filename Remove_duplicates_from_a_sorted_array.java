import java.util.Scanner;

public class Remove_duplicates_from_a_sorted_array {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Value " +(i+1)+" :");
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            System.out.println(i);
        }
        sc.close();
    }
}
