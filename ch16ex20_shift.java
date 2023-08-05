import java.util.LinkedList;

public class ch16ex20_shift {

    public static void main(String[] args) {
        // Example usage
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(31);
        list.add(42);
        list.add(23);
        list.add(44);
        list.add(75);
        list.add(86);
        System.out.println("Original List: " + list);
        shift(list);
        System.out.println("After shifting odd-indexed elements: " + list);
    }

    public static void shift(LinkedList<Integer> list) {
        LinkedList.Node<Integer> prev = null;
        LinkedList.Node<Integer> current = list.getFirst();

        while (current != null && current.getNext() != null) {
            LinkedList.Node<Integer> nextNode = current.getNext();

            if (prev == null) {
                list.setFirst(nextNode);
            } else {
                prev.setNext(nextNode);
            }

            current.setNext(nextNode.getNext());
            nextNode.setNext(null);

            prev = current;
            current = current.getNext();
        }
    }

}
