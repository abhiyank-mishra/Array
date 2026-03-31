public class Solution {
    public static void main(String[] arg) {
        int n = 521;
        String s = n + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sum += s.charAt(i) - '0';
            } else {
                sum -= s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}