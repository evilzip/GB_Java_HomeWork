import java.util.*;

public class find_solutions {
    private static List<List<Integer>> allWinCombinations = new ArrayList();
    public static List<List<String>> allWinCombinationsUnique = new ArrayList();


    //Мтод для поиска решений. Основная идея поиска решения - случайный перебор позиций ферзей на шахматной доске,
    //до тех пор пока не найдется комбинация из 8ми фигур (winCombination). Первые пять ферзей ставятся случайным
    //образом, а последние три - просто перебором оставшихся "не битых" клеток. Это очень сильно ускоряет решение,
    //потому, что с каждой новой фигурой найти случайным образом не битое поле становится все трудней.
    //Найденные решения в виде списка целочисленных координат на шахматной доске переводтся на шахматный язык в методе
    // convertToChessLanguage,сортируются и добаляются в allWinCombinationsUnique список,
    // если такого решения там еще нет.

    public static void searchWinCombination() {
        int indexWinCombination = 0;//порядковый номер найденного решения
        int iter = 0;
        int k = 0;//текущее найдейнной количество ферзей
        while (iter < 100000) {
            Integer newFerzHorizontalPos = new Random().nextInt(8);
            Integer newFerzVerticalPos = new Random().nextInt(8);
            if (!logic.isCellKilled(newFerzHorizontalPos, newFerzVerticalPos)) {
                List<Integer> winCombination = new ArrayList<>();
                allWinCombinations.add(winCombination);
                logic.newFerz(newFerzHorizontalPos, newFerzVerticalPos);
                k++;
                //allWinCombinations.get(indexWinCombination).add(newFerzHorizontalPos);
                //allWinCombinations.get(indexWinCombination).add(newFerzVerticalPos);
                addWinPositionToWinCombination(newFerzHorizontalPos,newFerzVerticalPos,indexWinCombination);
                if (k > 4) {//позиции для 5го, 6го и 7го ферзя ищутся перебором не битых полей
                    System.out.println("k>4");
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (!logic.isCellKilled(i, j)) {
                                //allWinCombinations.get(indexWinCombination).add(i);
                                //allWinCombinations.get(indexWinCombination).add(j);
                                addWinPositionToWinCombination(i,j,indexWinCombination);
                                logic.newFerz(i, j);
                                k++;
                            }
                        }
                    }
                    if (k < 8) {//если перебор не помог найти место для последний трех фигур, то значит такая комбинация
                        //фигур не решаемая - чистим доску от от фигур и начинаем снала
                        logic.emptyBoard();
                        allWinCombinations.remove(indexWinCombination);
                        k = 0;
                    }
                }
                if (k > 7) {//если программа смогла расставить все 8мь фигур, то заносим эту комибинацию
                    // в allWinCombinationsUnique если ее там еще нет. Если есть - игнориуем.
                    System.out.println("k>8");
                    List<String> chessWinCombination = new ArrayList<>();
                    chessWinCombination = convertToChessLanguage(allWinCombinations.get(indexWinCombination));
                    if (!allWinCombinationsUnique.contains(chessWinCombination)) {
                        allWinCombinationsUnique.add(chessWinCombination);
                        indexWinCombination++;
                    }
                    logic.emptyBoard();
                    k = 0;
                }
                iter++;
                if (allWinCombinations.get(allWinCombinations.size() - 1).isEmpty()) {
                    allWinCombinations.remove(allWinCombinations.size() - 1);
                }
            }
        }
    }

    //Метода переводит решение в виде списка целочисленных координат на шахматной доске в шахматную форму записи.
    //Выходной список отсортирован по алфавиту для сравнения решений
    private static List<String> convertToChessLanguage(List<Integer> winCombination) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < 16; i += 2) {
            resultList.add(Character.toString(letters.charAt(winCombination.get(i + 1))) +
                    Character.toString(numbers.charAt(winCombination.get(i))));
        }
        Collections.sort(resultList);
        return resultList;
    }

    private static void addWinPositionToWinCombination(int horizontalPos, int verticalPos, int index){
        allWinCombinations.get(index).add(horizontalPos);
        allWinCombinations.get(index).add(verticalPos);
    }




}

