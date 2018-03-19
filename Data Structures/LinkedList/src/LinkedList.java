public class LinkedList {

    private Node head;
    private Node tail;
    private int count;

    public LinkedList(){
        this.count = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }
    //Linked List functions
    public void addNode(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else{
            Node cursor = this.head;
            while(cursor.getNext() != null){
                cursor = cursor.getNext();
            }
            cursor.setNext(node);
            node.setPrev(cursor);
            this.tail = node;
        }
        this.count++;
    }

    public Node getIndex(int index){
        Node cursor = this.head;
        int currentIndex = 0;
        while(cursor != null){
            if(currentIndex == index){
                return cursor;
            }
            cursor = cursor.getNext();
            currentIndex++;
        }
        return null;
    }

    public void deleteIndex(int index){
        Node cursor;
        if(index >= count){
            System.out.println("Index too large for list");
            return;
        }
        else{
            cursor = this.getIndex(index);
            if(cursor.getPrev() == null){
                this.head = cursor.getNext();
                cursor.getNext().setPrev(null);
                cursor.setNext(null);
                this.count--;
            }
            else if(index == this.count-1){
                cursor.getPrev().setNext(cursor.getNext());
                cursor.setNext(null);
                cursor.setPrev(null);
            }
            else{
                cursor.getPrev().setNext(cursor.getNext());
                cursor.getNext().setPrev(cursor.getPrev());
                cursor.setNext(null);
                cursor.setPrev(null);
            }
        }
    }

    public void printList(){
        Node cursor = this.head;//start at the head
        int index = 0;
        while(cursor != null){
            System.out.println("Node: "+ index+ " Data: "+ cursor.getData());
            index +=1;
            cursor = cursor.getNext();
        }
    }

    public void reverseList(){
        
    }
}
