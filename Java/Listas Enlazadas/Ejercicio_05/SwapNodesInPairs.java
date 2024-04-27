package Ejercicio_05;

/*
 * Escribe un algoritmo que intercambie parejas de nodos adyacentes sin modificar
 * el valor interno de los nodos.
 * 
 * Ejemplo:
 *  Input: 1->2->4->6->8
 *  Output: 2->1->6->4->8
 */

public class SwapNodesInPairs {

    public Node swapNodesInPairs(Node head) {
        if(head == null || head.next == null) return head;

        Node tmp = head.next.next; // 4->6->8
        head.next.next = head; //(head)1->2->(head.next.next)1->2->1...
        System.out.println("head = head.next");
        head = head.next; //2->1...
        head.next.next = swapNodesInPairs(tmp);

        return head;
    }

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(4);
        list.appendToTail(6);
        list.appendToTail(8);

        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        swapNodesInPairs.swapNodesInPairs(list.head);

        list.print();

    }
}
