import java.util.Arrays;
import java.util.Scanner;


public class panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a1 = "qwertyuiopasdfghjklzxcvbnm";
        String input = sc.next();
        char[] a = a1.toCharArray();
        char[] b = input.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        sc.close();
        
        System.out.println(Arrays.equals(a, b));

    }
}
