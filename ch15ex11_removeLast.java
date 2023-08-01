import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ch15ex11_removeLast {


    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(17);
        list.add(42);
        list.add(3);
        list.add(8);

        System.out.println("Before removeLast: " + list);
        int lastValue = removeLast(list);
        System.out.println("Removed value: " + lastValue);
        System.out.println("After removeLast: " + list);
    }

    public static int removeLast(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("The list is empty.");
        }

        int lastIndex = list.size() - 1;
        return list.remove(lastIndex);
    }

}
