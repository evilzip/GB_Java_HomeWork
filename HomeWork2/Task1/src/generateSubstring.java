import java.io.IOException;

public class generateSubstring {
    public static String generatePostfix(String filename) throws IOException
    {
        StringBuilder sb = new StringBuilder();
        try
        {
            String stringFromFile = FileWorks.readFromFile(filename);
            System.out.println(stringFromFile);
            if (stringFromFile.length() !=0 )
            {
                String StringFromFile = stringFromFile.substring(1,stringFromFile.length()-1);
                String[] pairs = StringFromFile.split(", ");
                for (String pair : pairs)
                {
                    String[] parts = pair.split(":");
                    String left = parts[0].substring(1, parts[0].length() - 1);
                    String right = parts[1].substring(1, parts[1].length() - 1);
                    if (!(right.equals("null"))) {
                        sb.append(left);
                        sb.append("=");
                        sb.append("'").append(right).append("'");
                        sb.append(" and ");
                    }
                }
                return sb.substring(0, sb.length()-5);
            }


        }
        catch (IOException e)
        {
            System.err.println("Ошибка чтения файла: " + e.getMessage());

        }
        return null;


    }
}
