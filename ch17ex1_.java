import java.util.LinkedList;

public class ch17ex1_ {
    public static void main(String[] args) {
        // Example usage
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(8);
        list.add(19);
        list.add(4);
        list.add(17);
        System.out.println("Original List: " + list);
        reverse(list);
        System.out.println("Reversed List: " + list);
    }

    public static void reverse(LinkedList<Integer> list) {
        LinkedList.Node<Integer> prev = null;
        LinkedList.Node<Integer> current = list.getFirst();

        while (current != null) {
            LinkedList.Node<Integer> nextNode = current.getNext();
            current.setNext(prev);
            prev = current;
            current = nextNode;
        }

        list.setFirst(prev);
    }
}
