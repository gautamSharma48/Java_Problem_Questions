package LinkedList;


//not complete code
public class group_of_linked_list {

static Node headNode;

	static class Node{
		int data;
		Node nextNode;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
		this.data=data;
	      this.nextNode=null;
		}
		
	}
	
	public Node  insertatend(Node n,int data) {
		Node tempNode=n;
            Node newNode=new Node(data);
		if (tempNode==null) {
			tempNode=newNode;
			return tempNode;
		}
		
		while(tempNode.nextNode!=null) {
			tempNode=tempNode.nextNode;
		}
		tempNode.nextNode=newNode;
		tempNode=n;
	
		return tempNode;
	}
	
	

	public Node Display(Node tempNode) {
		
		
		while(tempNode!=null) {
			
			System.out.print(tempNode.data+"-->");
			tempNode=tempNode.nextNode;
		}
		System.out.print("null\n");
		return tempNode;
	}
	
	public Node reverseGroup(Node n,int x) {
		Node currNode=n;
		Node prevNode=null;
		Node next=null;
		int count=0;
		
		while(count < x && currNode!=null) {
			next=currNode.nextNode; //move to next node
			currNode.nextNode=prevNode; //link on reverse way
			
			prevNode=currNode;          //prevNode one goes to next
			currNode=next;          //currNode goes to next
			
			count++;
		}
		  if (next != null)
	            n.nextNode = reverseGroup(next, x);
		
		return prevNode;
	}
	
	public static void main(String[] args) {
		group_of_linked_list rs=new group_of_linked_list();
		rs.headNode=rs.insertatend(headNode,15);
		rs.headNode=rs.insertatend(headNode,16);
		rs.headNode=rs.insertatend(headNode,17);
		rs.headNode=rs.insertatend(headNode,18);
		rs.headNode=rs.insertatend(headNode,19);
		
		rs.Display(headNode);
		rs.headNode=rs.reverseGroup(headNode, 2);
		rs.Display(headNode);
		
	
	
	
}
}
