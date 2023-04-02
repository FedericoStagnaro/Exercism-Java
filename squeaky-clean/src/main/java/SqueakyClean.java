import java.util.regex.Pattern;

class SqueakyClean {

    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean kebabFlag = false;

        for (char c : identifier.toCharArray()) {
            if (c == ' ') result.append('_');
            else if (c == '\0' || c == '\r' || c == '\u007F') result.append("CTRL");
            else if (c == '-' ) kebabFlag = true;

            else if (Character.isAlphabetic(c) && !(c >= 'α' && c <= 'ω')) {
                if (kebabFlag) {
                    result.append(Character.toUpperCase(c));
                    kebabFlag = false;
                } else {
                    result.append(c);
                }
            }

        }
        return result.toString();
    }
}
