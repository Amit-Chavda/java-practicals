import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String regex = "[0-9]{10}";
        Pattern pattern = Pattern.compile(regex);
        String[] inputs = new String[] { "12345", "1234567890", "a1254485298" };

        for (String string : inputs) {
            Matcher matcher = pattern.matcher(string);
            System.out.println(string + " matches " + regex + " : " + matcher.matches());
        }

    }
}
