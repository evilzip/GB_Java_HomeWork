import java.util.ArrayList;

public class create_random_list {
    public static ArrayList<Integer> generateRandomList(Integer length, Integer maxElement) {
        ArrayList<Integer> randomIntList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            randomIntList.add((int) (Math.random() * maxElement));
        }
        //System.out.println(randomIntList);
        return randomIntList;
    }

}
