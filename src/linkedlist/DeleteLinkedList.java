package linkedlist;

public class DeleteLinkedList {

    static Node head;
    static class Node{
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        DeleteLinkedList reverseLinkedList = new DeleteLinkedList();
        reverseLinkedList.addToLast(new DeleteLinkedList.Node(5));
        reverseLinkedList.addToLast(new DeleteLinkedList.Node(10));
        reverseLinkedList.addToLast(new DeleteLinkedList.Node(15));
        reverseLinkedList.addToLast(new DeleteLinkedList.Node(20));
        reverseLinkedList.addToLast(new DeleteLinkedList.Node(25));
    }

    private void addToLast(Node node){
        if(head == null){
            head = node;
        } else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            } temp.next = node;
        }
    }

    private void printList(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        } System.out.println();
    }

    private Node deleteList( Node head, int deleteData ){
        Node p, q;
        q = head;
        p = head.next;
        if(q.data == deleteData){
            head = p;
            deleteList(head, deleteData);
        } else {
            while(p.data!=deleteData){
                p = p.next;
                q = q.next;
            }
        }
        if(p.next == null){
            q.next = null;
            deleteList(head, deleteData );
        } else {
            q.next = p.next;
            deleteList(head, deleteData );
        }

        return head;
    }

}
