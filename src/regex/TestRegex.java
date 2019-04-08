package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("<a class=\"name_song\" href=\"nct.com\\/(.*?)\"\\>(.*?) - (.*?)<\\/a>");
        Matcher m1 = p1.matcher("<a class=\"name_song\" href=\"nct.com/song2\">Chúng ta không thuộc về nhau - Loc</a>");
        boolean matches = m1.matches();
        if(matches){
            System.out.println(m1.group(2));
        }
    }
}
