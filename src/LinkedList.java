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
    void DeleteKey(int k){
        Node temp = head, prev = null;
        if(temp == null){
            return;
        }
        if(temp != null && temp.data == k){
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != k){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }
    void DeleteNode(int position){
        Node temp = head;
        if(head == null || temp == null || temp.next == null){
            return;
        }
        if(position == 0){
            head = temp.next;
            return;
        }
        for(int i = 0; i<position-1; i++){
            if(temp != null){
                temp = temp.next;
            }
        }
        Node next = temp.next.next;
        temp.next = next;

    }
    void DeleteList(){
        head = null;
    }
    int countList(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    boolean SearchElement(int x){
        Node temp = head;
        while (temp != null){
            if(temp.data == x){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    void MiddleLinkedList(int count){
        Node temp = head;
        int middle = count/2;
        while(middle>0)
        {
            temp = temp.next;
            middle--;
        }
        System.out.println("The middle element is " + temp.data );
    }
    void InsertData(int data, int pos){
        Node Insert = new Node(data);
        Node prev = null;
        Node temp = head;

        if (head == null) {
            //if head is null and position is zero then exit.
            if (pos != 0) {
                return;
            } else { //node set to the head.
                temp = Insert;
            }
        }

        if (head != null && pos == 0) {
            head = Insert;
            head.next = temp;
            return;
        }

        while(pos > 0){
            prev = temp;
            temp = temp.next;
            pos--;
        }
        Insert.next = temp;
        prev.next = Insert;

    }
    void printLl(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.Add(1);
        ll.Add(3);
        ll.Add(5);
        ll.Add(7);
        //ll.Add(9);

        ll.printLl();
        ll.MiddleLinkedList(ll.countList());
        //System.out.println(ll.SearchElement(5));
        //System.out.println(ll.countList());
        //ll.DeleteKey(5);
        //System.out.println(ll.SearchElement(5));
        //ll.DeleteList();
        //ll.DeleteNode(2);
        ll.InsertData(2,0);
        ll.printLl();
    }
}
