package Ejercicio_04;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * ¿Como diseñarias un Stack que ademas de las oeraciones de push y pop
 * contase con una operacion para obtener el minimo
 */

public class StackMin {
    
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> minStack = new ArrayDeque<>();

    public void push(int data) {
        stack.push(data);
        if(minStack.isEmpty() || data < minStack.peek()) {
            minStack.push(data);
        }
    }

    public int pop() {
        int value = stack.pop();
        if(value == minStack.peek()) {
            minStack.pop();
        }

        return value;
    }

    public int min() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        
        StackMin stackMin = new StackMin();

        stackMin.push(10);
        stackMin.push(1);
        stackMin.push(8);
        stackMin.push(0);
        stackMin.push(-3);
        stackMin.push(2);

        System.out.println(stackMin.min());

    }
}
