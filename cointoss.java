public class cointoss {
public static void main(String[] args) {
    int n=3;
    coin(n,"");
}
    private static void coin(int n , String ans) {
    
    if (n==0) {
        System.out.println(ans);
        return;
    }
    if(ans.length()==0 || ans.charAt(ans.length()-1)=='H')
    coin(n - 1, ans + "H");
    coin(n - 1, ans + "T");

}    

}
