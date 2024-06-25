public class pathall {

    public static void main(String[] args){
int [][] arr = new int[3][3];

print(arr,0,0,"");

    }
private static void print(int arr[][] , int row, int col , String ans){
    
    if(row == arr.length-1 && col == arr[0].length-1){
    System.out.println(ans);
     return;   
    }
    if( row<0||col<0||row == arr.length || col == arr[0].length||arr[row][col]==1){
        return;
    }

if(arr[row][col]==0){
    arr[row][col]=1;
     
    print(arr,row+1,col,ans+"V");
    print(arr,row,col+1,ans+"H");
    print(arr,row-1,col,ans+"V");
    print(arr,row,col-1,ans+"H");
    arr[row][col]=0;
}
}
}
