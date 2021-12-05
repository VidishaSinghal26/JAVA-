import java.sql.*;

public class database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","");
       // System.out.println("connection done");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from stu");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"  "+rs.getString("name"));
        }
        con.close();

    }
}
