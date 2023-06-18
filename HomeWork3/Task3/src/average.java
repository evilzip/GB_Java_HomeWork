import java.util.ArrayList;

import static java.lang.Math.abs;

public class average {

    public static Integer findAverageElement(ArrayList<Integer> inputList) {
        float mathAverage = mathAverage(inputList);
        int average = inputList.get(0);
        for (int i = 0; i < inputList.size(); i++) {
            if (abs(inputList.get(i) - mathAverage) < abs(mathAverage - average)) {
                average = inputList.get(i);
            }
        }
        return average;
    }

    public static Float mathAverage(ArrayList<Integer> inputList) {
        int sum = 0;
        for (int elements : inputList) {
            sum += elements;
        }
        return (float) sum / inputList.size();
    }
}
