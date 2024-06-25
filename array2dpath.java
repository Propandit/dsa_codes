public class array2dpath {
    static int count=0;
    public static void main(String[] args){
int [][] arr = new int[3][3];

print(arr,0,0,"");
System.out.println(count);
    }
private static void print(int arr[][] , int row, int col , String ans){
    
    if(row == 2 && col == 2){
        System.out.println(ans);
        count++;
        return;
        
        
    }

if(col<arr[0].length)
    print(arr,row,col+1,ans+"H");
    if(row<arr.length)
    print(arr,row+1,col,ans+"V");
    col-=1;
    row-=1;



}
}