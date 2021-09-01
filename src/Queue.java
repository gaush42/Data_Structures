
public class Queue {

    static int front, rear, capacity;
    static int[] queue;

    Queue(int Size){
        front = rear = 0;
        capacity = Size;
        queue = new int[capacity];
    }
    static boolean IsEmpty(){
        if(front == rear){
            return true;
        }
        return false;
    }
    static boolean IsFull(){
        if(capacity == rear){
            return true;
        }
        return false;
    }
    static void enQueue(int data){
        if(IsFull()){
            System.out.println("Queue Full");
            return;
        }else{
            queue[rear] = data;
            rear++;
        }
        //return;
    }
    static void deQueue(){
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
    static void FrontAndRear(){
        System.out.println("Front "+ queue[front]+" Rear "+ queue[rear-1]);
    }
    static void Traverse(){
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
        Traverse();
        enQueue(3);
        enQueue(1);
        enQueue(6);
        enQueue(4);
        Traverse();
        FrontAndRear();
        deQueue();
        Traverse();
        deQueue();
        deQueue();
        deQueue();
        deQueue();
        Traverse();
        enQueue(2);
        enQueue(2);
        enQueue(2);
        enQueue(2);
        enQueue(2);
        Traverse();
    }
}
