public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next = null;
        }
    }
    void Add(int data){
        Node toAdd = new Node(data);
        if(head == null){
            head = toAdd;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    void printLl(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.Add(1);
        ll.Add(3);
        ll.Add(5);
        ll.Add(7);

        ll.printLl();
    }
}
