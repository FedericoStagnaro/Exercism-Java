import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReverseString {

    String reverse(String inputString) {
        if (inputString.length() == 0) return "";

        String result = "";
        ArrayList<Character> list = new ArrayList<>();
        int count = inputString.length();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            result = result.concat(inputString.substring(i,i + 1));

        }

        return  result;
    }
}
