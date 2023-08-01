import java.util.ArrayList;

public class ch15ex6_fill {
    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(-7);
        list.add(3);
        list.add(0);
        list.add(15);

        fill(list, 2);
        System.out.println(list);
    }

    public static void fill(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }
}
