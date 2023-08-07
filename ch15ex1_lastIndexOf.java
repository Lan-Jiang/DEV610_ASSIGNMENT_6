import java.util.ArrayList;

public class ch15ex1_lastIndexOf {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(39);
        list.add(18);
        list.add(40);

        int valueToFind1 = 18;
        int valueToFind2 = 3;

        System.out.println("Last index of " + valueToFind1 + ": " + lastIndexOf(list, valueToFind1));
        System.out.println("Last index of " + valueToFind2 + ": " + lastIndexOf(list, valueToFind2));
    }

    public static int lastIndexOf(ArrayList<Integer> list, int value) {
        int lastIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
