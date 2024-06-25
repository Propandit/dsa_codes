public class queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean board [] = new boolean[4];
int q=2;
print(board,q,"",0,0);
	}

private static void print(boolean[]board,int q,String ans , int qp,int lp) {
	
	if(qp==q) {
		System.out.println(ans);
		return;
	}
	
	for (int i=lp;i<board.length;i++) {
		
		if(board[i]==false){
			board[i]=true;
		print(board,q,ans+"B"+i+"Q"+qp,qp+1,i+1);
		board[i]=false;
	}
}
}
}
