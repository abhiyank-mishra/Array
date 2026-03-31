import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int[] c = { 4, 2, 1, 1, 2 };
        int e = 1;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> ans = new ArrayList<>();
        // boolean[] answer = new boolean[c.length];2d
        for(int i:c){
            list.add(i);
        }
        for(int i=0;i<list.size();i++){
            if((c[i]+e)>Collections.max(list)){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        System.out.println(ans);
    }
}
