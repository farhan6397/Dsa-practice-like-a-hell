public class LinkedList{
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // Add first.........
    public static void addfirst(int data){

        // Step 1:- Create new node..
         Node newNode = new Node(data);
         size++;

        if (head == null){
            head = tail = newNode;
            return;
        }
        // Step 2 = newNode's next = head 
        newNode.next = head;
        // Step 3 = head = newNode
        head = newNode;
    }
    // Add at last.....
    public static void addlast(int data){
        // step 1 = create newNode...
        Node newNode = new Node(data);
        size++;

        if (head == null){
            head = tail = newNode;
            return;
        }

        // Step 2: tail's next = newNode
        tail.next = newNode;

        // Step 3: tail = newNode
        tail = newNode;
    }
     // add at any specific position...

    public static void addMiddle(int index, int data){
        if( index == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // Printing data method...
    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
   
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        addMiddle(2, 3);
        print();
        System.out.println("size of linked list: "+ll.size);
    }
}