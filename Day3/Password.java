package Day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        // this matches at least 1 special chracter and capital letter
        Pattern pattern = Pattern.compile("^(?=.*[@_#$%&])(?=.*[A-Z])[a-zA-Z0-9@_#$%&]{8,}$");
        // this matches at least 2 special chracter and capital letter
        // Pattern pattern =
        // Pattern.compile("^(?=(?:.*[@_#$%&]){2,})(?=.*[A-Z])[a-zA-Z0-9@_#$%&]{8,}$");
        Matcher match = pattern.matcher("Sathvik@3106");
        System.out.println(match.matches());
    }
}
