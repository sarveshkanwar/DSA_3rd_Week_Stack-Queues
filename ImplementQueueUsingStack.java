import java.util.*;

class Queue_using_Stack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    // Constructor name fixed
    public Queue_using_Stack() {
    }

    // Push element to the queue
    void push(int val) {
        while (!input.isEmpty()) {
            output.push(input.pop());
        }

        input.push(val);

        while (!output.isEmpty()) {
            input.push(output.pop());
        }
    }

    // Pop element from the queue
    int pop() {
        if (input.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return input.pop();
    }

    // Peek at the front element
    int peek() {
        if (input.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return input.peek();
    }

    // Print queue elements without removing them
    void printQueue() {
        Stack<Integer> temp = new Stack<>();
        temp.addAll(input);
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }
    }
}

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        Queue_using_Stack queue = new Queue_using_Stack(); // Fixed instantiation

        queue.push(23);
        queue.push(37);
        queue.push(35);
        queue.push(34);
        queue.push(89);

        System.out.println("Deleted element: " + queue.pop());
        System.out.println("Front element: " + queue.peek());

        System.out.println("Queue elements:");
        queue.printQueue();
    }
}
