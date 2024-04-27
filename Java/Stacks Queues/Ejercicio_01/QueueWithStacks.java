package Ejercicio_01;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Implementa una clase MyQueue utilizando dos stacks
 * 
 * Como Stack usaremos la interfaz Deque, que proporciona las operaciones de una cola doblemente terminada,
 * permitiendola usar como Pila o Cola (solo las operaciones de Pila estan permitidas en este ejercicio).
 * 
 * Java tambien tiene la clase Stack, pero su uso no esta recomendado por extender de la clase Vector, que
 * no tiene demasiado sentido, y por ser una clase especifica y no una interfaz.
 * 
 */

public class QueueWithStacks {
    private Deque<Integer> firstStack = new ArrayDeque<>();
    private Deque<Integer> secondStack = new ArrayDeque<>();

    public void add(Integer value) {
        firstStack.push(value);
    }

    public int peek() {
        fillSecondStack();
        return secondStack.peek();
    }

    public int remove() {
        fillSecondStack();
        return secondStack.pop();
    }

    private void fillSecondStack() {
        if(secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return firstStack.size() + secondStack.size();
    }

    public static void main(String[] args) {
        QueueWithStacks queue = new QueueWithStacks();

        queue.add(1);
        queue.add(2);
        queue.add(5);


        System.out.println(queue.remove());

        queue.add(6);

        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}