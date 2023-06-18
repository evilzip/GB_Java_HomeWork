import java.util.ArrayList;
import java.util.List;

public class filling_list {

    public static List<Integer> generateRandomList(Integer length, Integer maxElement ){
        ArrayList<Integer> randomIntList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            randomIntList.add((int)(Math.random()*maxElement));
        }
        //System.out.println(randomIntList);
        return randomIntList;

    }
}
