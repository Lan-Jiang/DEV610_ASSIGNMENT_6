import java.util.ArrayList;

public class ch15ex20_rotate {

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(23);
        list.add(19);
        list.add(7);
        list.add(12);
        list.add(4);

        System.out.println("Before rotate: " + list);
        rotate(list);
        System.out.println("After rotate: " + list);
    }

    public static void rotate(ArrayList<Integer> list) {
        if (list.isEmpty() || list.size() == 1) {
            return;
        }

        int firstValue = list.remove(0);
        list.add(firstValue);
    }

}
