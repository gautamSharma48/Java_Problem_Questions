package LinkedList;

import java.util.*;

public class SingleLinkedList {
	
	static Node headNode;
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			
			// TODO Auto-generated constructor stub
			this.data=data;
			this.next=null;
		}
	}
	
	public Node insertBegining(Node tempnode,int d) {
		
		
		Node n=new Node(d);
		n.next=tempnode; //points to next node head node contain previous first node
		tempnode=n;
		return tempnode;
		
	}
	
	public Node insertEnd(Node n,int d) {
		
		Node tempNode=n;
		Node newNode=new Node(d);
		if (tempNode==null) {
			tempNode=newNode;
			return tempNode;
		}
		
		while(tempNode.next!=null) {
			tempNode=tempNode.next;
		}
		tempNode.next=newNode;
		newNode.next=null;
		
		tempNode=n;
		return tempNode;
		
	}
	
	public void insertatposition(int da,int pos) {
		Node newNode=new Node(da);
		Node tempNode=headNode;
		int count=0,positon=pos;
		
		while(count<(pos-1)) {
			tempNode=tempNode.next;
			count++;
			
		}
		newNode.next=tempNode.next;
		tempNode.next=newNode;
	}
	

	
	public void deleteatFront() {
		Node tempNode=headNode;
		
		headNode=tempNode.next;
		
		tempNode.next=null;
	}
	
	public void deleteatPosition(int pos) {
		
		Node currentNode=headNode,prevNode=headNode;
		int count=0;
		
		
		if (pos==1) {
			headNode=headNode.next;
		}else {
			while(count < pos-1) {
				prevNode=prevNode.next;
				count++;
			}
			currentNode=prevNode.next;
			prevNode.next=currentNode.next;
			
		}
	}
	public void deleteatkey(int key) {
		Node tempNode=headNode;
		Node prevNode=null;
		//when head node contain key
		if (tempNode!=null && tempNode.data==key) {
			headNode=tempNode.next;
			return;
		}
		//traverse a linked list
		while(tempNode!=null && tempNode.data!=key) {
			prevNode=tempNode;
			tempNode=tempNode.next;
			
		}
		//if list has not contain key
		if (tempNode==null) {
			return;
		}
		prevNode.next=tempNode.next;
		
	}
	
	public Node deleteatLast() {
		Node tempNode=headNode;
		Node prevNode=null;
		
		if (headNode==null || headNode.next==null) {
			return headNode;
		}
		
		
		while(tempNode.next!=null) {
			prevNode=tempNode;
			tempNode=tempNode.next;
		}
		prevNode.next=null;
		return tempNode;
	}
	
	public void reverse() {
		
		Node prevNode=null;
		Node currentNode=headNode;
		Node nextNode=null;
		
		while(currentNode!=null) {
			nextNode=currentNode.next;
			currentNode.next=prevNode;
			prevNode=currentNode;
			currentNode=nextNode;
		}
		headNode=prevNode;
		display(headNode);
	}
	
	public  Node display(Node x) {
		Node tempNode=x;
		while(tempNode!=null) {
			System.out.print(tempNode.data+"-->");
			tempNode=tempNode.next;
			
		}
		
		System.out.println("null");
		return x;
	}
	
	public void countLength() {
		int count=0;
		Node tempNode=headNode;
		while (tempNode!=null) {
			count++;
			tempNode=tempNode.next;
			
		}
		System.out.println("No. of Element"+count);
		
	}
	public int exitstatus() {
		System.exit(0);	
		System.out.println("successfully exit from terminal");
		return 0;
	}
	
	

	public static void main(String[] args) {
		int input;
		SingleLinkedList sLinkedList=new SingleLinkedList();
		
		while(true) {
		System.out.println("\n\nEnter your choice:-\n"
				+ "1.insert at begining\n"
				+"2.insert at End\n"
	 			+"3.insert at position"
				+"4.delete at front\n"
				+"5.delete at front\n"
				+"6.delete at position\n"
				+"7.delete at last\n"
				+"8.reverse a linked list\n"
				+"9.display\n"
				+"10.count Length\n"
				+"11.Exit\n");
		        
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ur choice:-");
		int x=sc.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("Enter data");
			 input=sc.nextInt();
			headNode=sLinkedList.insertBegining(headNode,input);
			System.out.println("Succesfully inserted");
			break;
			
		case 2:
			input=sc.nextInt();
			headNode=sLinkedList.insertEnd(headNode,input);
			System.out.println("Succesfully inserted");
			break;
			
		case 9:
			sLinkedList.display(headNode);
			break;
		case 11:
			sLinkedList.exitstatus();
			
		}
		}
		
		
		
	}

}
