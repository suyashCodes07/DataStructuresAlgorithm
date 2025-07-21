package linkedList;

public class test {
    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtFirst(50);
        list.insertAtEnd(60);
        list.insert(55,3);
        list.display();
        System.out.println(list.size());
    }
}
