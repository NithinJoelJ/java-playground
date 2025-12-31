class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head=null;
    void insertBegining(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertLast(int data){
        Node newnode = new Node(data);
        if(head==null){
            insertBegining(data);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next = temp.next.next;
    }

    void insertMiddle(int index, int data){
        if(index<0){
            System.out.println("Enter a Valid Index");
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        if(index==1){
            insertBegining(data);
            return;
        }

        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void deleteIndex(int index){
        if(index<0){
            System.out.println("Enter a Valid Index");
            return;
        }
        if(index==0){
            head = head.next;
        }
        Node temp = head;

        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void deleteData(int data){
        Node temp = head;
        if(head.data == data){
            head=head.next;
            return;
        }
        while(temp.next!=null && temp.next.data!=data){
            temp=temp.next;
        }
        if(temp.next == null){
            System.out.println("Data Not Found");
            return;
        }
        temp.next=temp.next.next;
    }

    void search(int data){
        Node temp = head;
        while(temp.next!=null){
            if(temp.data==data){
                System.out.println(true);
                return;
            }
            temp = temp.next;
        }
        System.out.println(false);
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
}

class SimplerLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertBegining(1);
        list.insertBegining(2);
        list.insertBegining(3);

        list.insertLast(4);

        list.insertMiddle(2, 5);

        list.display();

        list.deleteIndex(3);
        System.out.println();
        list.display();
        System.out.println();
        list.search(5);
        list.search(3);
        list.search(123);
    }
}