import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp2 {
    public static void main(String[] args) {
        String s = "edc ijnk naj Nhgf bhnJ ";
        Pattern p=Pattern.compile ("\\s[n|N][a-zA-Z]*[j|J]\\s");
        Matcher m =p.matcher(s);
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
}
