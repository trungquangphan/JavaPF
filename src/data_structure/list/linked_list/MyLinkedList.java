package data_structure.list.linked_list;

public class MyLinkedList<T> {
    Node<T> head;
    Node<T> last;
    int numNodes;

    public Node<T> getLast() {
        return last;
    }

    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            head.next = null;
            last = head;
        }else{
            newNode.next = head;
            head = newNode;
        }
        numNodes++;
    }

    public void add(T data){
        if(head == null){
            addFirst(data);
        }else{
            Node<T> newNode = new Node<>(data);
            last.next = newNode;
            last = newNode;
        }
        numNodes++;
    }

    public void add(int index, T data){
        Node temp = head;

        for (int i = 0; i < index -1 ; i++){
            temp = temp.next;
            if(temp == null) {
                System.out.println("Index is greater than ");
                return;
            }
        }

        Node holder = temp.next;

        Node<String> newNode = new Node(data);
        temp.next = newNode;
        newNode.next = holder;
        numNodes++;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
