package Ejercicio_04;

/*
 * Escribe un algoritmo que realice la suma de dos listas que representan
s * dos enteros positivos. Las listas estan en posicion invertida.
 * 
 * Ejemplo:
 *  Input: 1->2->4->6, 5->2->8
 *  Output: 6->4->2->7
 *  6421 + 825 = 7246
 */


public class AddTwoNumbers {

    public static Node addTwoNumbers(Node list1, Node list2) {
        if( (list1 == null) || (list2 == null) ) return null;
        
        final Node result = new Node(-1);
        Node current = result;
        int carry = 0;

        while(list1 != null || list2 != null) {
            current.next = new Node(-1);
            current = current.next;
            int digit = carry;

            if(list1 != null) {
                digit += list1.value;
                list1 = list1.next;
            }

            if(list2 != null) {
                digit += list2.value;
                list2 = list2.next;
            }

            carry = digit / 10;
            digit = digit % 10;

            current.value = digit;
        }

        if(carry > 0) {
            current.next = new Node(carry);
        }

        return result.next;
    }

    public static void main(String[] args) {
        SingleLinkedList list1 = new SingleLinkedList();
        SingleLinkedList list2 = new SingleLinkedList();

        list1.appendToTail(1);
        list1.appendToTail(2);
        list1.appendToTail(4);
        list1.appendToTail(6);

        list2.appendToTail(5);
        list2.appendToTail(2);
        list2.appendToTail(8);


        SingleLinkedList result = new SingleLinkedList();
        result.head = AddTwoNumbers.addTwoNumbers(list1.head, list2.head);

        result.print();
    }
}