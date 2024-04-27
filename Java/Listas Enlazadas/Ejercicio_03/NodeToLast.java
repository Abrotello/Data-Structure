package Ejercicio_03;

/*
 * Dada una lista enlazada simple y un valor N, devolver el nodo N empezando por el final
 * 
 * Ejemplo:
 * lista: 1->2->4->6, Input valor 2
 * Output: 4
 */

public class NodeToLast {
    
    public Node nthNodeToLast(Node head, int n) {
        if(head == null) return null;
        
        //O(N)
        int nodeLength = nodeLength(head);
        if(n > nodeLength) return null;
        
        int steps = nodeLength-n+1;
        Node aux = null;

        for(int i=0; i<steps; i++) {
            aux = new Node(head.value);
            head = head.next;
        }

        return aux;
    }

    private int nodeLength(Node list) {
        int length = 0;
        while( list != null ) {
            list = list.next;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        SingleLinkedList list2 = new SingleLinkedList();
        list.appendToTail(1);
        list.appendToTail(2);
        list.appendToTail(4);
        list.appendToTail(6);

        NodeToLast nodeToLast = new NodeToLast();
        list.print();
        list2.head = nodeToLast.nthNodeToLast(list.head, 2);
        list2.print();
    }

}
