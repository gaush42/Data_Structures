public class CircularLinkedList {

    Node head = null;
    Node tail = null;

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            //tail = newNode;
            //newNode.next = head;
        }else{
            tail.next = newNode;
            //tail = newNode;
            //tail.next = head;
        }
        tail = newNode;
        tail.next = head;
    }
    void printlist(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.data+" ");
                temp= temp.next;
            }while(temp!=head);
        }
        /*Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
            do{
                //Prints each node by incrementing pointer.
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
    }*/
}

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(5);
        cll.add(3);
        cll.add(6);
        cll.add(7);
        cll.add(8);
        cll.printlist();
    }
}
