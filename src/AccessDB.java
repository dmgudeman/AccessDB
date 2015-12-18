import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.StringTokenizer;

public class AccessDB
{

    public static Path makeAPath()
    {
        Path file = null;
        try {
          file = Paths.get("M:\\Q_FILES\\Q_DATABASES\\Test.mdb");
//            BufferedReader reader = Files.newBufferedReader(file, Charset.defaultCharset());
//            
//            String line;
//            while((line = reader.readLine()) != null) 
//            {
//                System.out.println(line);
//                StringTokenizer tokenizer = new StringTokenizer(line,  " ");
//                while((line = reader.readLine()) != null)
//                {
//                    System.out.println(line);
//                }
//                
//            }
//            reader.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return file;
    }
    public static void main(String[] args)
    {
       Connection con;
       Statement st;
       ResultSet re;
       try 
       {
        
       //    con = DriverManager.getConnection("jdbc:ucanaccess://HyperLink.mdb");
           con = DriverManager.getConnection("jdbc:ucanaccess://" + makeAPath());
           st = con.createStatement();
           re=st.executeQuery("SELECT * FROM tblOne");
           while(re.next()) {
               System.out.println(re.getInt(1) + re.getString(2));
           }
       } catch (Exception e) {
           System.out.println(e);
       }
    }

}
