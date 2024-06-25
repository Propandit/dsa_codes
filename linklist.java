package linked_list;
public class linklist {

		class Node {
			int data;
			Node next;
		}

		static Node head = null;
		int size;
		Node tail;

		public void addFirst(int val) {
			Node nn = new Node();
			nn.data = val;
			if(size==0) {
				head=nn;
				tail=nn;
			}else {
			nn.next = head;
			head = nn;}
			size++;
		}
		

		public void Display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "--->");
				temp = temp.next;
			}
			System.out.println("Null");
		}

		public static void main(String[] args) {
			linklist ll = new linklist();
			ll.addFirst(10);
			ll.addFirst(20);
			ll.addFirst(30);
			ll.addFirst(40);
			ll.Display();
			ll.addLast(50);
			ll.Display();
			ll.KthPosition(60,3);
			ll.Display();
			ll.DeleteFirst();
			ll.Display();
			ll.DeleteLast();
			ll.Display();
			ll.DeleteKth(2);
			ll.Display();
			ll.Rreverse(head,null,null);
			ll.Display();
		}
		public void addLast(int val) {
			if(size==0) {
				addFirst(val);
			}else {
				Node nn = new Node();
				nn.data = val;
				tail.next = nn;
				tail = nn;
			}
			size++;
		}
		public void KthPosition(int val,int k) {
			if(k==0)
				addFirst(val);
			else if(k==size)
				addLast(val);
			else {
				Node temp = getNode(k);
				Node temp2 = temp.next;
				Node nn = new Node();
				nn.data = val;
				temp.next = nn;
				nn.next = temp2;
			}
		}
		public Node getNode(int k) {
			Node temp = head;
			for (int i = 1; i < k; i++) {
				temp = temp.next;
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
		public void DeleteFirst() {
			Node temp = head;
			head = head.next;
			temp.next =null;
		}
		public void DeleteLast() {
			Node Last = getNode(size-2);
			Last.next = null;
		    tail=Last;
		    size--;
		}
		public void DeleteKth(int k) {
			Node temp=getNode(k-1);
			temp.next=temp.next.next;
		}
	
		public Node Rreverse(Node curr,Node prev,Node next) {
			if(curr==null) {
				head=prev;
				return head;
			}
			next=curr.next;
			curr.next=prev;
			
			return Rreverse( next, curr, next);
			
			
		}
	}