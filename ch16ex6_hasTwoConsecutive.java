import java.util.LinkedList;

public class ch16ex6_hasTwoConsecutive {

    public static void main(String[] args) {
        // Example usage
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(18);
        list1.add(2);
        list1.add(7);
        list1.add(8);
        list1.add(39);
        list1.add(18);
        list1.add(40);
        System.out.println("List 1 has two consecutive: " + hasTwoConsecutive(list1)); // Output: true

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(18);
        list2.add(2);
        list2.add(7);
        list2.add(39);
        list2.add(18);
        list2.add(40);
        System.out.println("List 2 has two consecutive: " + hasTwoConsecutive(list2)); // Output: false
    }

    public static boolean hasTwoConsecutive(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int current = list.get(i);
            int next = list.get(i + 1);
            if (next == current + 1 || next == current - 1) {
                return true;
            }
        }
        return false;
    }


}
