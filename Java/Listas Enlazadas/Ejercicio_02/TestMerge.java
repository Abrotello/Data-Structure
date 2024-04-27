package Ejercicio_02;

public class TestMerge {
    public static void main(String[] args) {
        MergeTwoLists merge = new MergeTwoLists();
        SingleLinkedList list1 = new SingleLinkedList();
        SingleLinkedList list2 = new SingleLinkedList();
        SingleLinkedList list3 = new SingleLinkedList();
        
        list1.appendToTail(1);
        list1.appendToTail(2);
        list1.appendToTail(4);
        list1.appendToTail(6);

        list2.appendToTail(2);
        list2.appendToTail(3);
        list2.appendToTail(5);
        list2.appendToTail(10);

        list3.head = merge.mergeTwoList(list1.head, list2.head);
        list3.print();
    }
}
