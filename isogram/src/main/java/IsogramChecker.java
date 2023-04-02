import java.util.ArrayList;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        String[] copy = phrase.toLowerCase().replaceAll("-","").replaceAll(" ","").split("");
        if (phrase.length() > 0) {
            ArrayList<String> letters = new ArrayList<String>();
            for (String letter : copy) {
                if (!letters.contains(letter)) {
                    letters.add(letter);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
