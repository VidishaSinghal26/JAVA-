import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args) {
       // String target ="09876543218 gla919876543218";
       // Pattern p= Pattern.compile("(0|91)?[7-9][0-9]{9}");
        String target = "9&9 8q 87* &ab";
        Pattern p= Pattern.compile("\\W");
        int ctr=0;
        Matcher m= p.matcher(target);
        while(m.find())
        {
            ctr++;
            System.out.println(m.start()+"  "+m.end()+"  "+m.group());

        }
        System.out.println(ctr);
       // String s1="9876543218";
        //System.out.println(s1.matches("(0|91)?[7-9][0-9]{9}"));
    }
}
