public class StackChar {
    private int bufferSize;         //Size of the stack.
    private char[] arr;             //Initilizing the main char array of the stack.
    private int head, size, top;    //Initializing the head, size and top elements.

    StackChar() {                   //Constructor.
        top = -1;
        size = 0;
        head = 0;
    }

    public StackChar(int size) {       //Initilizing the stack with the input size.
        this.bufferSize = size;
        arr = new char[bufferSize];
    }

    public void push(char var) {
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

    public char pop() {
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

    public char top() {
        char var;
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