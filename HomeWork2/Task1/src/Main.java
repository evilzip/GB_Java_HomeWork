import java.io.IOException;
import java.io.StringBufferInputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1) Дана строка sql-запроса "select * from students where ".
        // Сформируйте часть WHERE этого запроса, используя StringBuilder.
        // Данные для фильтрации приведены ниже в виде json-строки.
        //Если значение null, то параметр не должен попадать в запрос.
        //Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        String path = "src/data.txt";
        String addToQuery = null;
        try {
            addToQuery = generateSubstring.generatePostfix(path);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
        StringBuilder sb= new StringBuilder();
        if (addToQuery != null && !addToQuery.isEmpty())
        {
            String stringSQL =  "select * from students where " + addToQuery;
            System.out.println("Строка запроса: " + stringSQL);
        }
        else {
            System.err.println("Строка запроса не создана");
        }





    }





    }
