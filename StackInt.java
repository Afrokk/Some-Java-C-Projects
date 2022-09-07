public class StackInt {
    private int bufferSize;         //Size of the Stack.
    private int[] arr;              //Initializing main int array of the stack.
    private int head, size, top;    //Initializing head, size & top vars.

    StackInt() {                    //Constructor.
        top = -1;
        size = 0;
        head = 0;
    }

    //Initializing the size of the stack, with input from driver program.
    public StackInt(int size) {
        this.bufferSize = size;
        arr = new int[bufferSize];
    }

    public void push(int var) {
        if (size == this.bufferSize) {
            System.out.println("Stack Overflow!");
            System.exit(-1);
        } 
        else {
            arr[head] = var; 
            size++;
            head++;
            top++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return 0;
        } 
        else {
            head--;
            size--;
            top--;
        }
        return arr[head];
    }

    public int top() {
        int var;
        if (top < 0) {
            System.out.println("Stack Underflow!");
            return 0;
        } 
        else {
            var = arr[top];
            return var;
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == bufferSize)
            return true;
        else
            return false;
    }
    
    public int size()
    {
        return size;
    }
}