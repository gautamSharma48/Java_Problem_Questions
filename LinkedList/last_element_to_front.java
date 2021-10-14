package LinkedList;

import LinkedList.pair_wise_swap.Node;


public class last_element_to_front {
	
	Node headnode;
	
	public class Node{
		int data;
		Node nextNode;
		public Node(int d) {
			// TODO Auto-generated constructor stub
		this.data=d;
		nextNode=null;
		}
	}
	
	public Node add(Node t,int d) {
		Node xNode=t;
		Node newNode=new Node(d);
		if (xNode==null) {
			xNode=newNode;
			newNode=xNode;   // that means t contains null;
		}
		else {
			newNode.nextNode=xNode;
			xNode=newNode;
		}
		return xNode;
	}
	
	public Node move(Node g) {
		Node teNode=g;
		Node secondlastNode=null;
		while(teNode.nextNode!=null) {
			secondlastNode=teNode;
			teNode=teNode.nextNode;
		}
		secondlastNode.nextNode=null;
		teNode.nextNode=headnode;
		g=teNode;
		return g;
	}
	public Node display(Node t) {
		while(t!=null) {
			System.out.print(t.data+"-->");
			t=t.nextNode;
		}
		System.out.println("null");
		return t;
	}
	
	public static void main(String[] args) {
		last_element_to_front l=new last_element_to_front();
		l.headnode=l.add(l.headnode,8);
		l.headnode=l.add(l.headnode,9);
		l.headnode=l.add(l.headnode,10);
		l.headnode=l.add(l.headnode,12);
		l.display(l.headnode);
		l.headnode=l.move(l.headnode);
		l.headnode=l.display(l.headnode);
		
	}

}
