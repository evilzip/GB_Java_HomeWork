import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //2) Реализуйте алгоритм сортировки пузырьком числового массива,
        // результат после каждой итерации запишите в лог-файл.
        Logging();


    }

    public static int[] createRandomArray(int size, int maxElement) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * maxElement));
            //System.out.println(array[i]);
        }
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        return array;
    }

    public static void bubbleSort(Logger logger) {
        int[] array = createRandomArray(10, 30);
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    logger.info(array[i]+"<--->"+ array[i+1]);
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }

            }
        }
        System.out.println("Отсортированный массив: "+Arrays.toString(array));
    }

    public static void Logging() {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);
        try {
            FileHandler fh = new FileHandler("src/BubbleSortLog.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            bubbleSort(logger);
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}