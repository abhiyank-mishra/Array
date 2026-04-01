public class num_vo {
    public static void main(String[] args) {
        String s = "Wasifarshad@43210#";
        String m1 = s.replaceAll("[^a-zA-Z]", "");
        String m = m1.toLowerCase();
        System.out.println(m);
        int v = 0;
        int c = 0;
        for (int i = 0; i < m.length(); i++) {
            char ch = m.charAt(i);

            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
                v++;
            else
                c++;
        }
        System.out.println(v);
        System.out.println(c);
    }
}
