import java.util.LinkedList;

public class ch16ex3_isSorted {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        System.out.println("list1 is sorted: " + isSorted(list1));

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(7);
        list2.add(2);
        list2.add(9);
        System.out.println("list2 is sorted: " + isSorted(list2));

        LinkedList<Integer> list3 = new LinkedList<>();
        System.out.println("list3 is sorted: " + isSorted(list3));
    }

    public static boolean isSorted(LinkedList<Integer> list) {
        if (list.isEmpty() || list.size() == 1) {
            return true;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }


}
