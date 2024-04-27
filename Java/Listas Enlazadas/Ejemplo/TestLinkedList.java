public class TestLinkedList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.appendToTail(10);
        list.appendToTail(20);
        list.appendToTail(30);
        list.appendToTail(40);
        list.appendToTail(50);
        list.appendToTail(60);
        list.appendToTail(70);
        list.appendToTail(80);
        list.appendToTail(90);
        list.appendToTail(100);

        list.deleteNode(50);
        list.print();
    }
}
