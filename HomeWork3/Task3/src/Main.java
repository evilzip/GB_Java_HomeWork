import java.util.ArrayList;
import java.util.Collections;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> testList = create_random_list.generateRandomList(10, 10);
        System.out.println("Заданный список: " + testList);
        Collections.sort(testList);
        System.out.println("Сортированный список: " + testList);
        System.out.println("Минимальное значение: " + Collections.min(testList));
        System.out.println("Максимальное значение: " + Collections.max(testList));
        System.out.printf("Cреднее африфметическое списка %.2f, ближайший к нему элемент: %d",
                average.mathAverage(testList), average.findAverageElement(testList));


    }
}