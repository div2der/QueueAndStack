package Stack;

public class Stack {
    private int[] array = new int[10];
    private int top_pointer = 0;
    private int capacity = 10;
    
    void add(int value) {
        if (top_pointer == capacity) {
            capacity *= 1.5;
            int[] new_array = new int[capacity];
            for (int i = 0; i < top_pointer; ++ i)
                new_array[i] = array[i];
            array = new_array;
        }
        array[top_pointer++] = value;
    }
    
    void pop() {
        if (isEmpty())
            System.out.print("Stack is empty\n");
        else
            --top_pointer;
    }

    int top() throws ArrayIndexOutOfBoundsException{
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Stack is empty\n");
        else
            return array[top_pointer - 1];
    }

    boolean isEmpty() {
        return top_pointer == 0;
    }
}
