import java.util.ArrayList;

public class remove_even_elements {

    public static ArrayList<Integer> deleteEvenElements(ArrayList<Integer> inputList){
        ArrayList<Integer> deleteList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            if(inputList.get(i) %2==0){
                deleteList.add(inputList.get(i));
            }

        }
        inputList.removeAll(deleteList);
        return inputList;
    }
}
