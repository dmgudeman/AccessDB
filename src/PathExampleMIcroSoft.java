import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;


public class PathExampleMIcroSoft
{

    public static void main(String[] args)
    {
       
        Path file = Paths.get("C:\\Users\\dmg36\\Desktop\\HelloThere.txt");
        try {
            BufferedReader reader = Files.newBufferedReader(file, Charset.defaultCharset());
            
            String line;
            while((line = reader.readLine()) != null) 
            {
                System.out.println(line);
                StringTokenizer tokenizer = new StringTokenizer(line,  " ");
                while((line = reader.readLine()) != null)
                {
                    System.out.println(line);
                }
                
            }
            reader.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}