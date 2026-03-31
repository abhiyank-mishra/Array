import java.util.*;

public class harshit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String inside = line1.substring(line1.indexOf('[') + 1, line1.indexOf(']'));
        String[] parts = inside.split(",");
        
        int n = parts.length;
        int[] nums = new int[n];
        sc.close();
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }
        
        // String line2 = sc.nextLine();
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    return;
                }
            }
        }
    }
}