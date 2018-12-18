public class Main {

    public static void main(String[] args) {

    }

    public static void printList(MyLinkedList myLinkedList) {
        Element current = myLinkedList.getHead();
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public static MyLinkedList reverse(MyLinkedList source) {
        if (source == null) {
            return null;
        }
        MyLinkedList result = new MyLinkedList();
        while (source.getHead() != null) {
            Element nextSourceHead = source.getHead().getNext();
            source.getHead().setNext(result.getHead());
            result.setHead(source.getHead());
            source.setHead(nextSourceHead);
        }
        source.setHead(result.getHead());
        return source;
    }
}
