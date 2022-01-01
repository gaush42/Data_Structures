public class DoublyLinkedList {

    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }
    void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            head.prev = null;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        tail.next = null;
    }
    void PrintListRev(){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
    void PrintLisfwd(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(7);
        dll.add(1);
        dll.add(2);
        dll.add(5);
        dll.add(3);

        dll.PrintListRev();
        dll.PrintLisfwd();
    }
}
