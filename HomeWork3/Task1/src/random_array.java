import java.util.Arrays;

public class random_array {
    public static int[] createRandomArray(int size, int maxElement) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * maxElement));
            //System.out.println(array[i]);
        }
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        return array;
    }
}
