public class LinkList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        // step-1-create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2-newNode next=head
        newNode.next = head;// link

        // step3-head=newNode
        head = newNode;
    }

    public void addLast(int data) {

        // step-1-create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2-newNode next=tail
        tail.next = newNode;// link

        // step3-tail=newNode
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkList l1 = new LinkList();
        l1.print();
        l1.addFirst(1);
        l1.print();
        l1.addFirst(2);
        l1.print();
        l1.addLast(3);
        l1.print();
        l1.addFirst(4);
        l1.print();

    }
}
