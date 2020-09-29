package linkedlist;

public class ReverseLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node() {}
        Node(int data) {
            this.data = data;
        }
        Node(int data, Node next) {
            this.data = data; this.next = next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.addToLast(new ReverseLinkedList.Node(5));
        reverseLinkedList.addToLast(new ReverseLinkedList.Node(10));
        reverseLinkedList.addToLast(new ReverseLinkedList.Node(15));
        reverseLinkedList.addToLast(new ReverseLinkedList.Node(20));
        reverseLinkedList.addToLast(new ReverseLinkedList.Node(25));
        System.out.println("Original List :: ");
        reverseLinkedList.printList();

        head = reverseLinkedList.reverseLinkedListFun(head);
        System.out.println("Reverse list :: ");
        reverseLinkedList.printList();
    }


    private void addToLast(Node node){
        if(head == null){
            head = node;
        } else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            } temp.next = node;
        }
    }

    private void printList() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ->" );
             temp = temp.next;
        }
        System.out.println();
    }

    private Node reverseLinkedListFun(Node head) {
      if(head == null || head.next==null){
          return head;
      }
      Node tail = reverseLinkedListFun( head.next );
      head.next.next = head;
      head.next = null;
      return tail;
    }
}
