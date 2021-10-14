package LinkedList;


//addition of two linked list

public class AdditionoftwoLinkedList {
	 static Node head1,head2;
	
	  static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	 void printlist(Node temp) {
		 
		 while(temp!=null) {
			
			 System.out.print(temp.data+"--->");
			 temp=temp.next;
		 }
		 System.out.println("null");
	 }
	 
	 public Node reverselist(Node node) {
		Node currNode=node;
		Node nextNode=null;
		Node prevNode=null;
		
		while (currNode!=null) {
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
			
		}
		node=prevNode;//assigning a head
		printlist(node);
		return node;
	 }
	 
	 public Node addtwoumber(Node firstNode,Node secondNode) {
		 int carry=0,sum=0;
		 //Node firstNode=reverselist(fNode);
		 //Node secondNode=reverselist(sNode);
		 Node res=null;  //head for resulant linked list
		 Node tempNode=null;
		 Node prevNode=null;
		 
		 while(firstNode!=null && secondNode!=null) {
			 
			 sum=carry+ (firstNode!=null?firstNode.data:0)+(secondNode!=null?secondNode.data:0);
			 
			 carry=(sum>=10)?sum/10:0;
			 
		 sum=sum%10;
			 
			 tempNode=new Node(sum);
			 
			 if(res==null) {
				 res=tempNode;
			 }else {
				 prevNode.next=tempNode;	 
			 }
			 prevNode=tempNode;//for next inseration
			 
			 if (firstNode!=null) {
				firstNode=firstNode.next;
			}
			 if (secondNode!=null) {
				secondNode=secondNode.next;
			}
			 
		 }
		 
		 if (carry>0) {
			tempNode.next=new Node(carry);
			
		}
		 printlist(res);
		 return res;
		 
	 }
	 
	 
	 public static void main(String[] args) {
		 AdditionoftwoLinkedList ll=new AdditionoftwoLinkedList();
		  ll.head1=new Node(8);
		  ll.head1.next=new Node(7);
		  ll.head1.next.next=new Node(9);
		  ll.printlist(head1);
		  
		  ll.head2=new Node(9);
		  ll.head2.next=new Node(4);
		  ll.head2.next.next=new Node(9);
		  ll.printlist(head2);
		  
		//  ll.reverselist(head1);
		  //ll.reverselist(head2);
		  
		  Node resultNode=ll.addtwoumber(head1, head2);
		  
	}
}
