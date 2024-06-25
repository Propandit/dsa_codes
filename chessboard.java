
public class chessboard {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] board= new int[3][3];
		print(board,0,0);
		System.out.println(count);

	}

	private static void print(int[][] board, int row, int col) {
		// TODO Auto-generated method stub
		
		if(row>=board.length || col>=board[0].length) {
			return;
		}
		if(row==board.length-1 && col==board[0].length-1) {
			count++;
			return;
		}
		
		//knight
		int [] r= {2,1};
		int[] c= {1,2};
		for(int i=0;i<c.length;i++) {
			print(board,row+r[i],col+c[i]);
		}
		
//		rook
		if(row==0 || row==board.length-1 || col==0 || col==board[0].length-1 ) {
//			for row
			for(int i=1;i<board.length;i++) {
				print(board,row+i,col);
			}
//		for col
			for(int i=1;i<board[0].length;i++) {
			print(board,row,col+i);	
			}
		}
//			bishop
			if(row==col || row+col==board.length-1) {
				for(int i=1;i<board.length;i++) {
					print(board,row+i,col+i);
				}
			}
			
	}

}