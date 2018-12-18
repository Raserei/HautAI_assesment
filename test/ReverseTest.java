public class ReverseTest {

    public static void main(String[] args) {
        testNull();
        testEmpty();
        testSingleElement();
        testMultipleElements();
    }

    public static void testNull() {
        System.out.println("Null linked list given: ");
        MyLinkedList testResult = Main.reverse(null);
        System.out.println(testResult == null ? "success" : "fail \n");
    }

    public static void testEmpty() {
        System.out.println("Empty linked list given: ");
        MyLinkedList source = new MyLinkedList();
        MyLinkedList target = Main.reverse(source);
        boolean result = target != null && target.getHead() == null && source == target;
        System.out.println(result ? "success" : "fail \n");
    }

    public static void testSingleElement() {
        System.out.println("Single element linked list given: ");
        MyLinkedList source = new MyLinkedList();
        source.add(1);
        MyLinkedList target = Main.reverse(source);
        boolean result = target != null && target.getHead() != null && target.getHead().getNext() == null;
        System.out.println(result ? "success" : "fail \n");
    }

    public static void testMultipleElements() {
        System.out.println("Multiple element linked list given: ");
        MyLinkedList source = new MyLinkedList();
        MyLinkedList sourceCopy = new MyLinkedList();
        source.add(1);
        source.add(2);
        source.add(3);
        sourceCopy.add(3);
        sourceCopy.add(2);
        sourceCopy.add(1);
        MyLinkedList target = Main.reverse(source);
        boolean result = compare(sourceCopy, target) && source.getHead() == target.getHead();
        System.out.println(result ? "success" : "fail \n");
    }

    private static boolean compare(MyLinkedList list1, MyLinkedList list2) {
        if (list1 == null && list2 == null) {
            return true;
        }
        if (list1 == null || list2 == null) {
            return false; //если сюда пришли, значит один из них точно не null
        }
        Element currentList1 = list1.getHead();
        Element currentList2 = list2.getHead();
        while (currentList1 != null) {
            if (currentList2 == null) {
                return false;
            }

            if (!currentList1.getValue().equals(currentList2.getValue())) {
                return false;
            }
            currentList1 = currentList1.getNext();
            currentList2 = currentList2.getNext();
        }
        return currentList2 == null;
    }
}
