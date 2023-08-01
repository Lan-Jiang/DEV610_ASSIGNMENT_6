import java.util.ArrayList;

public class ch15ex17_stretch {

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(7);
        list.add(4);
        list.add(24);
        list.add(11);

        System.out.println("Before stretch: " + list);
        list = stretch(list, 3);
        // list = stretch(list, 0);
        System.out.println("After stretch: " + list);
    }

    public static ArrayList<Integer> stretch(ArrayList<Integer> list, int factor) {
        ArrayList<Integer> stretchedList = new ArrayList<>();

        if (factor <= 0) {
            return stretchedList; // Return an empty list if factor is zero or negative
        }

        for (int num : list) {
            for (int i = 0; i < factor; i++) {
                stretchedList.add(num);
            }
        }

        return stretchedList;
    }


}
