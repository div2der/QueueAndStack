package Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.top());
        queue.pop();
        System.out.println(queue.top());
        queue.pop();
        System.out.println(queue.top());
        queue.pop();

        scanner.close();
    }
}
