import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp1 {
    public static void main(String[] args) {
        String s = "edc ijnk nas Nhgf bhnu";
        Pattern p=Pattern.compile ("\\s[n|N][a-zA-Z]*");
        Matcher m =p.matcher(s);
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
}
