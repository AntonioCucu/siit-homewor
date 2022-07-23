package siit.homework06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckEquationFormat {
    public boolean checkEq(String input) {
        Pattern pattern = Pattern.compile("(\\d+\\s\\w+\\s[+-]\\s\\d+\\s\\w+(\\s?(\\+|-)?\\s?\\d+\\s\\w+\\s?)*)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
