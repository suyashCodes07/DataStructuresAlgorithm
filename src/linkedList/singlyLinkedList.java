package linkedList;

public class singlyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public singlyLinkedList() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;

    }

    public void insertAtEnd(int val){
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
    }

    public void insert(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        Node node = new Node(val);

        // Case: Insert at head (index 0)
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node temp = head;
            int i = 1; // start from 1 because we want to stop at (index - 1)

            while (i < index) {
                temp = temp.next;
                i++;
            }

            node.next = temp.next;
            temp.next = node;
        }

        size++;
    }

    public int size (){
        return size+1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }



}
