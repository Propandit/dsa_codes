public class climbstair {
    
public static void main(String[] args) {
    int n=2;
    stair(n,"");
}
    private static void stair(int n , String ans) {
    
    if (n==0) {
        System.out.println(ans);
        return;
    }
    if(n<0){
        return;
    }
    stair(n - 1, ans + "1");
    stair(n - 2, ans + "2");
    stair(n - 3, ans + "3");

}    
}