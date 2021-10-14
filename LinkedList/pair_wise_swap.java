package LinkedList;

public class pair_wise_swap {
	
	static Node headNode;
	
	public static class Node{
		int data;
		Node nextNode;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data=data;
			nextNode=null;
		}
	}
	
	public Node add(Node t,int d) {
		Node tempNode=t;
		Node newNode=new Node(d);
		
		if (tempNode==null) {
			tempNode=newNode;
			newNode=tempNode;
		}
		else {
			newNode.nextNode=tempNode;
			tempNode=newNode;
			
		}
		return tempNode;
	}
	public Node pairswap(Node h) {
		Node tempNode=h;
		while(tempNode!=null && tempNode.nextNode!=null) {
			int k=tempNode.data;
			tempNode.data=tempNode.nextNode.data;
			tempNode.nextNode.data=k;
			tempNode=tempNode.nextNode.nextNode; //move to third node
		}
		tempNode=h;
		return tempNode;
		
	}
	public Node display(Node x) {
		Node tNode=x;
		while(tNode!=null) {
		System.out.print(tNode.data+"-->");
		tNode=tNode.nextNode;
		}
		System.out.println("null");
		return tNode;
	}
	public static void main(String[] args) {
		pair_wise_swap pw=new pair_wise_swap();
		headNode=pw.add(headNode, 15);
		headNode=pw.add(headNode, 25);
		headNode=pw.add(headNode, 35);
		headNode=pw.add(headNode, 45);
		pw.display(headNode);
		headNode=pw.pairswap(headNode);
		pw.display(headNode);
	}

}
