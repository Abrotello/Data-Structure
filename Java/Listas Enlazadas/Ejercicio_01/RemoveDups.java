import java.util.HashSet;
import java.util.Set;

/*
 * Escribe un algoritmo para eliminar los elementos duplicados en una lista enlazada
 * 
 * Ejemplo:
 * Input: 1->2->2->3->4->1
 * Output: 1->2->3->4
 * 
 */

public class RemoveDups {
    
    public void removeDups(Node head) {
        if(head == null) return;
        Set<Integer> foundValues = new HashSet<>();
        foundValues.add(head.value);
        
        while(head != null && head.next != null) {
            if(!foundValues.add(head.next.value)) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        System.out.println(foundValues);
    }

    /* Complejidad temporal cuadratica O(N^2) */
    /* Complejidad espacial constante O(1) */
    public void secondMethod(Node head) {
        if(head == null) return;

        for(; head != null && head.next != null; head = head.next) {
            for(Node current = head; current != null && current.next != null; current = current.next) {
                if(current.next.value == head.value) {
                    current.next = current.next.next;
                }
            }
        }

        // while(head != null && head.next != null) {
        //     Node current = head;
        //     while(current != null && current.next != null) {
        //         if(current.next.value == head.value) {
        //             current.next = current.next.next;
        //         }
        //         current = current.next;
        //     }
        //     head = head.next;
        // }
    }
}