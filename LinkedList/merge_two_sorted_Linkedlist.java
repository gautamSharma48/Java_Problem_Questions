package LinkedList;



public class merge_two_sorted_Linkedlist {
	
	static Node headNode,headNode2;
	
	static class Node{
		int data;
		Node nextNode;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data=data;
			this.nextNode=null;
		}
	}
	public void addtolast(Node node) {
		if (headNode==null) {
			headNode=node;
		}else {
			Node tempNode=headNode;
			while(tempNode.nextNode!=null) {
				tempNode=tempNode.nextNode;
				
			}
			tempNode.nextNode=node;
		}
	}
	public void display(Node node) {
		Node tempNode=node;
		
		while(tempNode!=null) {
			System.out.print(tempNode.data+"-->");
			tempNode=tempNode.nextNode;
		}
		System.out.print("null\n");
	}
	//Recursive way
	public Node meragerecursive(Node headNode,Node headNode2) {
		
		Node resultNode;
		
		if (headNode==null) {
			return headNode2;
		}
		
		if (headNode2==null) {
			return headNode;
		}
		if(headNode.data<headNode2.data) {
			resultNode=headNode;
			resultNode.nextNode=meragerecursive(headNode.nextNode, headNode2);
		}
		else {
			resultNode=headNode2;
			resultNode.nextNode=meragerecursive(headNode, headNode2.nextNode);
		}
		return resultNode;
	}
	//iterative way
	public Node merage(Node headNode,Node headNode2) {
		Node p1=headNode;
		Node p2=headNode2;
		Node dummyNode=new Node(0);
		Node p3=dummyNode;
		
		while(true) {
			
			if (p1==null) {
				p3.nextNode=p2;
				break;
			}
			if (p2==null) {
				p3.nextNode=p1;
				break;
			}
			
			if (p1.data< p2.data) {
				p3.nextNode=p1;
				p1=p1.nextNode;
			}
			else {
				p3.nextNode=p2;
				p2=p2.nextNode;
			}
			p3=p3.nextNode;
			
			
		}
		return dummyNode.nextNode;
		
	}
	public static void main(String[] args) {
	merge_two_sorted_Linkedlist mg=new merge_two_sorted_Linkedlist();
	/* Alert Sorted linked list means two linked list already sorted*/
	mg.headNode=new Node(7);
	mg.headNode.nextNode=new Node(8);
	mg.headNode.nextNode.nextNode=new Node(9);
	
	mg.headNode2=new Node(11);
	mg.headNode2.nextNode=new Node(12);
	mg.headNode2.nextNode.nextNode=new Node(20);
	mg.display(headNode);
	mg.display(headNode2);
	//using iterative
	//Node hNode=mg.merage(headNode, headNode2);
	//mg.display(hNode);
	//using recursive
	// working either iterative or recursive
	Node hNode2 =mg.meragerecursive(headNode, headNode2);
	mg.display(hNode2);
	
	}

}
