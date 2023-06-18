import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = random_array.createRandomArray(30, 20);
        sort_merge.mergeSort(array, array.length);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

    }

}