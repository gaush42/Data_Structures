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

        ll.printLl();
        //System.out.println(ll.SearchElement(5));
        //System.out.println(ll.countList());
        //ll.DeleteKey(5);
        //System.out.println(ll.SearchElement(5));
        //ll.DeleteList();
        ll.DeleteNode(2);
        ll.printLl();
    }
}
