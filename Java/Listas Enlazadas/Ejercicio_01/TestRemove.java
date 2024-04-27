public class TestRemove {
    public static void main(String[] args) {
        RemoveDups remove = new RemoveDups();
        SingleLinkedList list = new SingleLinkedList();

        for(int i=1; i<=10; i++) {
            list.appendToTail(i);
            list.appendToTail((int)(Math.random() * 11 - 1 ));
        }

        list.print();
        remove.secondMethod(list.head);
        list.print();

    }
}
