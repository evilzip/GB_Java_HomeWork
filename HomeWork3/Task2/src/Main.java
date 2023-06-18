// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> testList = (ArrayList<Integer>) filling_list.generateRandomList(10,10);
        System.out.println("Изначальный список: " + testList);
        System.out.println("Список без четныйх элементов" + remove_even_elements.deleteEvenElements(testList));
    }

}