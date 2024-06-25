public class countzero {
public static void main(String[] args) {
    System.out.println(count(33342322));
    
}
static int count(int x){
    return helper(x,0);
}

private static int helper(int x,int c){
    if(x==0) {
    return c;
    }
    int rem=x%10;
    if(rem==4){
        return helper(x/10,c+1);

    }
    return helper(x/10,c);

}
}
