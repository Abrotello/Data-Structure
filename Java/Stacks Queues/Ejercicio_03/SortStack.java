package Ejercicio_03;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Ordena un Stack de forma que los elementos mas pequeños queden en el tope del Stack.
 * Puedes usar un Stack adicional, pero no esta permitido copiar los elementos a otra
 * estructura de datos.
 * 
 * Ejemplo:
 *  Input: (tope) 5->1->4->2
 *  Output: (tope) 1->2->4->5
 * 
 */
public class SortStack {
    
    public Deque<Integer> sort(Deque<Integer> stack) {
        if(stack.isEmpty()) return stack;

        Deque<Integer> sortedStack = new ArrayDeque<>();
         
        while (!stack.isEmpty()) {
            int element = stack.pop();
            while (!sortedStack.isEmpty() && element > sortedStack.peek()) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(element);
        }

        return sortedStack;
    }

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        stack.push(10);

        System.out.println(stack);
        SortStack sortStack = new SortStack();
        System.out.println(sortStack.sort(stack));
    }
}
