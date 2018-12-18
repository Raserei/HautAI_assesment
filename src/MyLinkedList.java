public class MyLinkedList {

    private Element head;

    public void add(Integer value) {
        Element newElement = new Element(value);
        if (head == null) {
            head = new Element(value);
            return;
        }
        getLast().setNext(newElement);
    }

    public void add(Element element) {
        if (head == null) {
            head = element;
            return;
        }
        getLast().setNext(element);
    }

    public Element getHead() {
        return head;
    }

    public void setHead(Element head) {
        this.head = head;
    }

    private Element getLast() {
        Element current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }
}
