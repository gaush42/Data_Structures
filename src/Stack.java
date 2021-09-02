public class Stack {
    static int size,topElement;
    static int[] stack;

    Stack(int Capacity){
        size = Capacity;
        topElement = -1;
        stack = new int[size];
    }
    boolean IsEmpty(){
        return (topElement == -1);
    }
    boolean IsFull(){
        return (size-1 == topElement);
    }
    void Push(int data){
        if(!IsFull()){
            topElement++;
            stack[topElement] = data;
        }else{
            System.out.println("Stack Full");
        }
    }
    int Pop(){
        if (!IsEmpty()) {
            int returnedtopElement = topElement;
            topElement--;
            System.out.println("Element Popped from Stack is :" + stack[returnedtopElement]);
            return stack[returnedtopElement];
        } else {
            System.out.println("Stack is empty...");
            return -1;
        }
    }
    void Traverse(){
        if(!IsEmpty()){
            for(int i=0;i<topElement+1;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
    void Peek(){
        if(!IsEmpty()){
            System.out.println(stack[topElement]);
        }
    }


    public static void main(String[] args) {
        Stack s = new Stack(4);
        System.out.println(s.IsEmpty());
        s.Push(2);
        s.Push(4);
        System.out.println(s.IsFull());
        s.Push(6);
        s.Push(8);
        System.out.println(s.IsFull());
        s.Traverse();
        s.Peek();
        s.Pop();
        s.Traverse();
        s.Peek();
        s.Pop();
        s.Pop();
        s.Pop();
    }
}
