package LinkedList;

public class swap_node_without_swapping_data {
	
	static Node headNode;
	
	public static class Node {
		int data;
		Node nexNode;
		
		public Node(int d) {
			// TODO Auto-generated constructor stub
		this.data=d;
		nexNode=null;
		}
			
	}
	
	public Node add(Node a,int d) {
		Node tempNode=a;
		Node newNode=new Node(d);
		if (tempNode==null) {
			tempNode=newNode;
			newNode=tempNode;
		}else {
			newNode.nexNode=tempNode;
			tempNode=newNode;
		}
		return tempNode;
	}
	
	
	public Node swapNode(Node t,int x,int y) {
		Node tempNode=t;
		Node prevXnode=null,currXnode=tempNode;
		Node prevYnode=null,currYnode=tempNode;
		
		while(currXnode!=null && currXnode.data!=x) {
			prevXnode=currXnode;
			currXnode=currXnode.nexNode;
		}
		
		while(currYnode!=null && currYnode.data!=y) {
			prevYnode=currYnode;
			currYnode=currYnode.nexNode;
		}
		
		if (prevXnode!=null) {
			prevXnode.nexNode=currYnode;
		}else {
			tempNode=currYnode;
		}
		
		if (prevYnode!=null) {
			prevYnode.nexNode=currXnode;
		}
		else {
			tempNode=currYnode;
		}
		
		Node t2=null;
		t2=currXnode.nexNode;
		currXnode.nexNode=currYnode.nexNode;
		currYnode.nexNode=t2;
		
		return tempNode;
	}
	public Node display(Node x) {
		Node tNode=x;
		while(tNode!=null) {
		System.out.print(tNode.data+"-->");
		tNode=tNode.nexNode;
		}
		System.out.println("null");
		return tNode;
	}
	
          public static void main(String[] args) {
        	  swap_node_without_swapping_data s=new swap_node_without_swapping_data();
        	  headNode=s.add(headNode, 14);
        	  headNode=s.add(headNode, 20);
        	  headNode=s.add(headNode, 13);
        	  headNode=s.add(headNode, 12);
        	  headNode=s.add(headNode, 15);
        	  headNode=s.add(headNode, 10);
        	  	  
        	  s.display(headNode);
        	  
        	  headNode=s.swapNode(headNode, 12, 20);
        	  s.display(headNode);

	
   }
 }
