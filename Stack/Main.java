package Stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.pop();

        scanner.close();
    }
}
