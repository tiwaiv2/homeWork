package jdk;

public class LinkList {
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next=null;
		}
		
		
		
		
	}
	
	void addNode(int data){
		 
		Node n=new Node(data);
		if(head==null){
			head=n;
			trail=n;
			
		}else{
			trail.next=n;
			
		}
		
		
		
	}
	
	Node head;
	Node trail;
	
	public static void main(String[] args) {
		LinkList l1= new LinkList();
		l1.addNode(1);
		l1.addNode(2);
		l1.addNode(3);
		l1.addNode(4);
		
		Node current = l1.head;    
        
        if(l1.head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();  
		
	}
	

}
