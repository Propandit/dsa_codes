public class longSubstringnorepest {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(print(s));
    }
    private static int print(String s){
        int ans=0;
        int [] arr=new int[128];
        for(int start=0,end=0;end<s.length();end++){
            arr[s.charAt(end)]++;

            while(arr[s.charAt(end)]>1){
                arr[s.charAt(start++)]--;
            }
            ans=Math.max(ans,end-start+1);
        }
    return ans;
    }
}
