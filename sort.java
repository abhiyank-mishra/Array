import java.util.*;

public class sort {
    public static void main(String[] args) {
        int[] a = { 3, 2, 5, 4, 1 };
        String s = "Abhiyank";
        char[] ch = s.toCharArray();

        String st = s.replace(" ", "");
        Arrays.sort(ch);

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println(st);
    }
}
