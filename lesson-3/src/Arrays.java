import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        List<String> fruitsList = new ArrayList<>();

        fruitsList.add("apple");
        fruitsList.add("orange");
        fruitsList.add("banana");
        fruitsList.add("pineapple");
        fruitsList.add("orange");
        fruitsList.add("banana");
        fruitsList.add("apricot");
        fruitsList.add("lemon");
        fruitsList.add("tomato");
        fruitsList.add("pineapple");
        fruitsList.add("orange");
        fruitsList.add("cherry");
        fruitsList.add("grapes");
        fruitsList.add("peach");
        fruitsList.add("watermelon");

        System.out.println(fruitsList);

        Set<String> fruitsSet = new HashSet<>(fruitsList);

        for (String sSet : fruitsSet) {
            int count = 0;
            for (String sList : fruitsList) {
                if (sSet.equals(sList)) {
                    count++;
                }
            }
            System.out.println(String.format("%s - %d",sSet, count));
        }
    }
}