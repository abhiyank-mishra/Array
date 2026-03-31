public class sum_of_all_elements_in_an_array {
    public static void main(String[] arr) {
        int a[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }
}