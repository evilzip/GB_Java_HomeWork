import java.io.*;

public class FileWorks {

    public static String readFromFile(String filename) throws IOException
    {
        StringBuilder sb = new StringBuilder();
        File file = new File(filename);
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            line = br.readLine();
            sb.append(line);
            System.err.println("Файл считан успешно!");
        }
        catch (IOException e)
        {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
        return sb.toString();

    }
}
