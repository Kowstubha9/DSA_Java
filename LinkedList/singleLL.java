class Node{
    int data;
    Node next;

    // constructor
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class singleLL {
    Node head;

    public void InsertAtBegin(int data){
        Node newnode=new Node(data); // creating a node
        newnode.next=head;
        head=newnode;
    }

    public void InsertAtEnd(int data){
        Node newnode=new Node(data); // creating a node
        
        if(head==null){
            head=newnode;
            return;
        }
        
        Node temp=head;

        while(temp.next != null) {
			temp = temp.next;
		}

        temp.next=newnode;
    }

    public void DeleteAtBeginning(){
        if(head==null){
            return;
        }
        head=head.next;
    }

    public void InsertAtSpecificPosition(int data, int position){
        if(position<1){
            System.out.println("Invalid Position");
            return;
        }
        if(position==1){
            InsertAtBegin(data);
            return;
        }
        Node temp=head;
        Node newnode=new Node(data);
        for(int i=1;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of bounds");
        }
        else{
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }

    public void DeleteAtEnd(){
        Node temp=head;
        while(temp.next.next != null) {
			temp = temp.next;
		}
        temp.next=null;
    }

    public void DeleteAtSpecificPosition(int position){
        if(position<1){
            System.out.println("Invalid Position");
            return;
        }
        if(position==1){
            DeleteAtBeginning();
            return;
        }
        Node temp=head;
        for(int i=1;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of bounds");
        }
        else{
            temp.next=temp.next.next;
        }
    }

    public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		
		System.out.print("null");
		
	}

    public static void main(String[] args){
        singleLL list = new singleLL();
     
        list.InsertAtBegin(10);
        list.InsertAtBegin(20);
        list.InsertAtBegin(30);
        list.InsertAtBegin(40);
        list.InsertAtBegin(50);

        list.InsertAtEnd(70);
        list.InsertAtEnd(80);
        list.InsertAtEnd(100);

        list.InsertAtSpecificPosition(75,4);
        list.DeleteAtSpecificPosition(4);
        list.DeleteAtEnd();
        list.display();

       // list.DeleteAtBeginning();
        
        // System.out.println("");
        // list.display();
   }
    
}
