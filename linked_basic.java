


public class linked_basic {
	public class Node{
		int data;
		Node next;
	}
	Node head;
	Node tail;
	int size;
	public void add(int val){
		Node nn=new Node();
		nn.data=val;
		if(size==0){
			head=nn;
			tail=nn;
			
		}
		else{
		nn.next=head;
		head=nn;
		
		}
		size++;
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"--->>");
			temp=temp.next;
		}
		System.out.println();
	}
	public void last(int val) {
		if(size==0) {
			add(val);
		}
		else {
			Node nn=new Node();
			nn.data=val;
			tail.next=nn;
			tail=nn;
			size++;
			
		}
		
	}
	public Node getNode(int k) {
		Node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		return temp;
		
	}
	public int getFirst() {
		return head.data;
	}
	public int getLast() {
		return tail.data;
	}
	public int getKthData(int k) {
		return getNode(k).data;
	}
	public void deletefirst() {
		head=head.next;
		size--;
	}
	public void deletelast() {
		Node tt=getNode(size-2);
		tt.next=null;
		tail=tt;
		size--;
	}
	public void addkth(int val,int k) {
		if(size==k) {
			last(val);
		}
		else if(size==0) {
			add(val);
		}
		else {
			Node prevNode=getNode(k-1);
			Node nn=new Node();
			Node temp2=prevNode.next;
			nn.data=val;
			prevNode.next=nn;
			nn.next=temp2;
			size++;
			
			
		}
	}
	

	public static void main(String[] args) {
		linked_basic ll=new linked_basic();
		ll.add(10);
		ll.add(20);
		ll.display();
		ll.last(30);
		ll.display();
		ll.addkth(70,2);
		ll.display();
		System.out.println(ll.getLast());
		ll.deletefirst();
		ll.display();
		ll.deletelast();
		ll.display();
		

		

	}

}
