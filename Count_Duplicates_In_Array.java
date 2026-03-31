public class Count_Duplicates_In_Array {
    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 3, 3, 9, 9, 9, 9 };
        int n = a.length;

        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int c = 1;

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true;
                    c++;
                }
            }

            System.out.println(a[i] + " -> " + c);
        }
    }
}