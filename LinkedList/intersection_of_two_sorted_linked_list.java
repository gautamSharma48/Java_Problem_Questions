package LinkedList;

import oops.classesObject;

public class intersection_of_two_sorted_linked_list {
	
	static Node headNode,headNode2;
	static Node dummyNode=null;
	public static class Node{
		int data;
		Node nextNode;
		public Node(int d) {
			this.data=d;
			nextNode=null;
		}
	}
	
	public Node add(Node t,int data) {
		Node xNode=t;
		Node newNode=new Node(data);
		
		if (xNode==null) {
		xNode=newNode;
		return xNode;
		}
		else {
		while(xNode.nextNode!=null) {
			xNode=xNode.nextNode;
		}	
		xNode.nextNode=newNode;
		newNode.nextNode=null;
		xNode=t;
		return xNode;
		}
	}
	public Node display(Node x) {
		while(x!=null) {
			System.out.print(x.data+"-->");
			x=x.nextNode;
		}
		System.out.println("null");
		return x;
	}
	
	public Node intersection(Node p,Node q) {
		
		while(p!=null && q!=null) {
			if (p.data==q.data) {
				dummyNode=add(dummyNode, p.data);
				p=p.nextNode;
				q=q.nextNode;
				
			}else if (p.data <q.data) {
				p=p.nextNode;
			}
			else {
				q=q.nextNode;
			}
		}
		
		return dummyNode;
		
	}
	public static void main(String[] args) {
		intersection_of_two_sorted_linked_list is=new intersection_of_two_sorted_linked_list();
		headNode=is.add(headNode,15);
		headNode=is.add(headNode,25);
		headNode=is.add(headNode,30);
		headNode=is.add(headNode,35);
		headNode=is.add(headNode,35);
		headNode=is.add(headNode,45);
		
		headNode2=is.add(headNode2,10);
		headNode2=is.add(headNode2,20);
		headNode2=is.add(headNode2,25);
		headNode2=is.add(headNode2,35);
		is.display(headNode);
		is.display(headNode2);
		is.intersection(headNode, headNode2);
		System.out.print("intrsection of two sorted Node:-");
		is.display(dummyNode);
	
	}

}
