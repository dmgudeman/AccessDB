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
          file = Paths.get("M:\\Q_FILES\\Q_DATABASES\\DeskTop.mdb");

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
           re=st.executeQuery("SELECT REPLACE(Hyper, '..', 'M:/dmgdcg2') FROM tblHyperLinksOnly ");  //WHERE Hyper LIKE '%..%'");
           while(re.next()) {
               System.out.println(re.getString(1) + " " + re.getString(2));
           }
       } catch (Exception e) {
           System.out.println(e);
       }
    }

}
