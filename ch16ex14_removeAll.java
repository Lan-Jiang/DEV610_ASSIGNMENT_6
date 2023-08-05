import java.util.LinkedList;

public class ch16ex14_removeAll {

    public static void main(String[] args) {
        // Example usage
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(17);
        list.add(4);
        list.add(3);
        list.add(18);
        System.out.println("Original List: " + list);
        removeAll(list, 3);
        System.out.println("After removing all occurrences of 3: " + list);
    }

    public static void removeAll(LinkedList<Integer> list, int value) {
        list.removeIf(n -> n == value);
    }

}
