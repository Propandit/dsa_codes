import java.util.*;

public class subset2 {
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        int lp = 0;
        ArrayList<Integer> list= new ArrayList<>();
        List<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(nums,0,list,ans);
        System.out.println(ans);
    }
    
    private static void generateSubsets(int [] nums ,int lp, ArrayList<Integer> list, List<ArrayList<Integer>> ans){
                                        
        ans.add(new ArrayList<>(list));

        for (int i = lp; i < nums.length; i++) {
            if (i >  lp&& nums[i] == nums[i - 1])
        continue;
        list.add(nums[i]);
        generateSubsets(nums, i + 1, list, ans);
        list.remove(list.size() - 1);

    }
}
}
