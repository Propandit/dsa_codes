import java.util.*;
public class a {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        List<String> al=new ArrayList<>();
        move(a,0,0,"",al);
        System.out.print("\n"+al.size());
    }
    static void move(int b[][],int i,int j,String s,List<String> al){
        if(i==b.length-1 && j==b[0].length-1)
        {
            System.out.print(s+" ");
            al.add(s);
            return;
        }
        if(i>b.length || j>b[0].length)
        return ;
        move(b,i+1,j,s+"V",al);
        move(b,i,j+1,s+"H",al);
        move(b,i+1,j+1,s+"D",al);
    }
}