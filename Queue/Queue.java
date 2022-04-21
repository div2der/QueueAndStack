package Queue;

public class Queue{
    private int[] array = new int[10];
    private int front_pointer = 0;
    private int back_pointer = 0;
    private int capacity = 10;
    
    void add(int value) {
        if (back_pointer == capacity) {
            capacity *= 1.5;
            int[] new_array = new int[capacity];
            for (int i = 0; i < back_pointer; ++ i)
                new_array[i] = array[i];
            array = new_array;
        }
        array[back_pointer++] = value;
    }

    void pop() {
        if (isEmpty())
            System.out.print("Queue is empty\n");
        else
            ++front_pointer;
    }

    public int top() throws ArrayIndexOutOfBoundsException{
        if (isEmpty())
           throw new ArrayIndexOutOfBoundsException("Queue is empty\n");
        else
            return array[front_pointer];
    }
    boolean isEmpty() {
        return front_pointer == back_pointer;
    }
}
