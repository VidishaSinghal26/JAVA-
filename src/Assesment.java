import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assesment {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internalmarks","root","");
        PreparedStatement ps = con.prepareStatement("insert into info values (?,?)");
        String phoneno = "9652147890  9632587412";
        String name = " aryan radhe tilu";
        Pattern p1= Pattern.compile("(0|91)?" + "[7-9][0-9]{9}");
        Pattern p2=Pattern.compile("\\s[a | r][a-zA-Z]*");
        Matcher m1= p1.matcher(phoneno);
        Matcher m2 = p2.matcher(name);
//        int c=0;
//        while(m1.find())
//        {
//            c++;
//            System.out.println(m1.group());
//        }
//        System.out.println(c);
//        int c1=0;
//        while(m2.find())
//        {
//            c1++;
//            System.out.println(m2.group());
//        }
//        System.out.println(c1);
       int ctr=0;
        try {
            while (m1.find() && m2.find()) {
                ctr++;
                ps.setString(1, m1.group());
                ps.setString(2, m2.group());
                ps.executeUpdate();
            }
            if (ctr ==0 )
            {
                throw new InvalidDataException("NO input name is correct");
            }

    ResultSet rs = ps.executeQuery("select * from info");
        while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString("name"));
            }

            con.close();
        }
        catch(InvalidDataException s)
        {
            System.out.println("Exception occurs"+s);
        }
        

    }
}
class InvalidDataException extends Exception
{
    public InvalidDataException(String a)
    {
        super(a);
    }
}