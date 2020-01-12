class LinkedList<type> {

    class Node{
        private type info;
        private Node next;
        public Node(type info){
            this.info = info;
            this.next = null;
        }
    }

    private Node head = null;

    public LinkedList(type info){
        head = new Node(info);
    }

    void append(type info){
        if(head==null)
            head = new Node(info);
        else{
            Node ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            Node node = new Node(info);
            ptr.next = node;
        }
    }

    void prepend(type info){
        if(head==null)
            head = new Node(info);
        else{
            Node node = new Node(info);
            node.next = head;
            head = node;
        }
    }

    void display(){
        Node ptr = head;
        if(head==null)
            System.out.print("Empty Linked List");
        else {
            System.out.print("[" + ptr.info + "] ");
            while (ptr.next != null) {
                ptr = ptr.next;
                System.out.print("[" + ptr.info + "] ");
            }
        }
    }
}