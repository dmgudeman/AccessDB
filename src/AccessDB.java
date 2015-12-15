import java.sql.*;

public class AccessDB
{

    public static void main(String[] args)
    {
       Connection con;
       Statement st;
       ResultSet re;
       try 
       {
          // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           con = DriverManager.getConnection("jdbc:ucanaccess://HyperLink.mdb");
           st = con.createStatement();
           re=st.executeQuery("SELECT * FROM tblMain");
           while(re.next()) {
               System.out.println(re.getInt(1) + re.getString(2) + re.getString(3) + " " + re.getString(4));
           }
       } catch (Exception e) {
           System.out.println(e);
       }
    }

}
