package data_structure.list.linked_list;

public class Node<T> {
    Node<T> next;
    T data;

    public Node(T data){
        this.data = data;
    }
    public T getData() {
        return data;
    }
}
