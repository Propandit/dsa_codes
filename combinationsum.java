
import java.util.*;

public class combinationsum {
public static void main(String[] args) {
    int [] arr = {2,3,6,7};
    int target=7;
    int lp=0;
    List<Integer>list =new ArrayList<>();
    List<List<Integer>> ll =new ArrayList<List<Integer>>();
    print(arr,target,list,ll,0);
}
private static void print(int[] arr,int target,List<Integer> list,List<List<Integer>> ll, int lp) {
if(target==0) {
    System.out.println(list);
    ll.add(new ArrayList<Integer> (list));
    return;
}
if(target<0) {
    return;
}
for(int i=lp;i<arr.length;i++) {
    list.add(arr[i]);
    print(arr,target-arr[i],list,ll,i);
    list.remove(list.size()-1);
}
}
}