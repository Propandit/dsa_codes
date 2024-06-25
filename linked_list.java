import java.util.*;
public class linked_list {

 class Node {
  int data;
  Node next;
 }

 Node head = null;
 int size;
 Node tail=null;

 
 public void addFirst(int val) {
  Node nn = new Node();
  nn.data = val;
  if(size== 0) {
    head=nn;
    tail=nn;
  }
  else {
  nn.next = head;
  head = nn;}
  size++;
 }
 public void addLast(int val) {
   if(size==0) {
     addFirst(val);
   }
   else {
     Node nn= new Node();
     nn.data=val;
     tail.next=nn;
     tail=nn;
     size++;
  
   }
 }
 public void addAtKthPos(int val,int k) {
   if(k==0) {
     addFirst(val);
   }
   else if(k==size){
     addLast(val);
   }
   else {
     Node temp= getNode(k);
     Node temp2=temp.next;
     Node nn=new Node();
     nn.data=val;
     temp.next=nn;
     nn.next=temp2;
     size++;
     
     System.out.println(temp.data);
     
     }
   
 }
 public Node getNode(int k) {
   Node temp=head;
   for(int i=1;i<=k;i++) {
     temp=temp.next;
   }
   return temp;
 }
 
 public void reverse() {
  Node prev = null;
  Node current = head;
  Node next;

  while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
  }

  head = prev;
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
  linked_list ll = new linked_list();
  ll.addFirst(10);
  ll.addFirst(20);
  ll.addFirst(30);
  ll.addFirst(40);
  ll.reverse();
  ll.Display();
  // ll.addLast(50);
  // ll.Display();
  // ll.addAtKthPos(60,2);
  // ll.Display();
  }

}