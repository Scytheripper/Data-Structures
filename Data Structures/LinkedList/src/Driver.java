public class Driver {

    public static void main(String [] args){

        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        list.deleteIndex(2);
        list.printList();

    }
}
