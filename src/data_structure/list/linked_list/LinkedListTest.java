package data_structure.list.linked_list;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hello");
        list.add("hello2");
        list.add("hello3");
        list.add(10,"one");
        list.printList();

    }
}
