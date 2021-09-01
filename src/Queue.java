
public class Queue {

    static int front, rear, capacity;
    static int[] queue;

    Queue(int Size){
        front = rear = 0;
        capacity = Size;
        queue = new int[capacity];
    }
    boolean IsEmpty(){
        if(front == rear){
            return true;
        }
        return false;
    }
    boolean IsFull(){
        if(capacity == rear){
            return true;
        }
        return false;
    }
    void enQueue(int data){
        if(IsFull()){
            System.out.println("Queue Full");
            return;
        }else{
            queue[rear] = data;
            rear++;
        }
        //return;
    }
    void deQueue(){
        if(IsEmpty()){
            System.out.println("Queue is Empty");
            return;
        }else{
            for(int i=0;i<rear-1;i++){
                queue[i] = queue[i+1];
            }
            if(rear<capacity){
                queue[rear] = 0;
            }
            rear--;
        }
        //return;
    }
    void FrontAndRear(){
        System.out.println("Front "+ queue[front]+" Rear "+ queue[rear-1]);
    }
    void Traverse(){
        if(IsEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
        //return;
    }


    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.Traverse();
        q.enQueue(3);
        q.enQueue(1);
        q.enQueue(6);
        q.enQueue(4);
        q.Traverse();
        q.FrontAndRear();
        q.deQueue();
        q.Traverse();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.Traverse();
        q.enQueue(2);
        q.enQueue(2);
        q.enQueue(2);
        q.enQueue(2);
        q.enQueue(2);
        q.Traverse();
    }
}
