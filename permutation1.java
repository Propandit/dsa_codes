
import java.util.*;
public class permutation1 {
public static void main(String args[]) {
    int [] arr= {1,2,3};
    ArrayList<Integer> list = new ArrayList<>();
    boolean[] used= new boolean[3];
    List<ArrayList<Integer>> ans = new ArrayList<>();
    print(arr,used,list,ans);
    System.out.println(ans);
}
private static void print(int[] arr,boolean[] used,ArrayList<Integer> list,List<ArrayList<Integer>> ans) {
    if(list.size()== arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i])
            continue;
            used[i] = true;
            list.add(arr[i]);
        print(arr, used, list, ans);
            list.remove(list.size() - 1);
            used[i] = false;
        }
        }
    
}