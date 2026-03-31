import java.util.Arrays;
// import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        
        
        String a1 = "abdc";
        String b1 = "cdba";
        char[] a = a1.toCharArray();
        char[] b = b1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b));

    }
}



// silent
// listen

