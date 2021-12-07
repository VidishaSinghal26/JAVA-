import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialChars {
    public static void main(String[] args) {
        String target = "vidishasinghal";
        Pattern p = Pattern.compile("\\W");
        Matcher m = p.matcher(target);
        int ctr = 0;
        while (m.find()) {
            ctr++;
        }
        System.out.println(ctr);
        if (ctr >= 1) {
            System.out.println("String Contains Special Charachters");
        } else {
            System.out.println("String dosen't contains special charachters");
        }
    }
}
