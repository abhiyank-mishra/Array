// import java.util.Arrays;

public class Remove_Duplicates {

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }


    public static void main(String[] args) {


        int[] a = { 1, 1, 2, 2, 2,3,3,3,4,4,4 };
        System.out.println(removeDuplicates(a));
        // int count = 0;
        // for (int i = 1; i < a.length; i++) {
        //     int j;
        //     for (j = 1; j < a.length; j++) {
        //         if (a[i] == a[j]) {
        //             count++;
        //             break;
        //         }
        //     }
        //     if (i == j) {
        //         System.out.print(a[i] + " ");
        //     }
        // }
    }
     
}