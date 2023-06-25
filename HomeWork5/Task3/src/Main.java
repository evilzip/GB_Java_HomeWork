import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        logic.emptyBoard();
        find_solutions.searchWinCombination();
        file_works.printToFileSolutions(find_solutions.allWinCombinationsUnique);
    }
}