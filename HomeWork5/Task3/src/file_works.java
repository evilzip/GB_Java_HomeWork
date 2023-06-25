import java.io.*;
import java.util.List;

public class file_works {
    public static void printToFileSolutions(List<List<String>> solutions) throws IOException {
        File file = new File("src/uniqueAllSolutions.txt");
        try(FileWriter fw = new FileWriter(file);
            BufferedWriter bf = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bf)){
            for (List<String> solution: solutions){
                pw.println(solution);
            }
            System.out.print("Файл с решениями успешно создан!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
