import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatinTranslator {

    private Character[] vowels = new Character[]{'a','e','i','o','u', 'y'};

    //{'a','e','i','o','u'}
    private boolean isVowel (char letter) {
        return Arrays.stream(vowels).anyMatch(vowel -> vowel == letter);
    }

    private boolean isXrYtException (String phrase) {
        return phrase.startsWith("xr") || phrase.startsWith("yt");
    }

    private boolean isQuNextConsonant (String phrase) {
        int indexOfQ = phrase.indexOf('q');
        if (indexOfQ >=0) {
            String newStart = phrase.substring(indexOfQ);
            return newStart.startsWith("qu");
        } else return false;
    }

    private boolean isBrainFuck (String phrase) {
        if (phrase.length() == 2 && phrase.charAt(1) == 'y') return true;
        else {
            int indexY = phrase.charAt('y');
            String startWord = phrase.substring(indexY);
            if (startWord.contains(vowels.toString())) return false;
            return true;
        }
    }

    private String getFirstBeforeVowel (String phrase) {
        for (char c: phrase.toCharArray()) {
            if (isVowel(c)) return phrase.substring(0, phrase.indexOf(c));
        }
        return "";
    }

    private String getNextAfterVowel (String phrase) {
        for (char c: phrase.toCharArray()) {
            if (isVowel(c)) return phrase.substring(phrase.indexOf(c));
        }
        return "";
    }


    public String translate(String phrase) {
        if(isVowel(phrase.charAt(0))) return phrase.concat("ay");
        else if( isXrYtException(phrase)) return phrase.concat("ay");
        else if (isQuNextConsonant(phrase)) {
            int indexOfU = phrase.indexOf('u');
            String consonantCluster = phrase.substring(0,indexOfU + 1);
            String nextToConsonantCluster = phrase.substring(indexOfU +1);
            return  nextToConsonantCluster  + consonantCluster + "ay";
        } else if (phrase.startsWith("y")) {
            String startWord = phrase.substring(0,1);
            String endWord = phrase.substring(1 );
            return endWord + startWord + "ay";
        } else if (isBrainFuck(phrase)) {
            int indexOfY = phrase.indexOf("y");
            String startWord = phrase.substring(0,indexOfY);
            String endWord = phrase.substring(indexOfY + 1);
            return endWord + startWord + "ay";
        } else {
            String consonantCluster = getFirstBeforeVowel(phrase);
            String nextToConsonantCluster = getNextAfterVowel(phrase);
            return nextToConsonantCluster + consonantCluster + "ay";
        }
    }
    /*
    public String translate(String phrase) {

        if (isVowel(phrase.charAt(0))) {
            return phrase.concat("ay");
        } else {
            if (isXrXtException(phrase))  return phrase.concat("ay");
            else if (phrase.length() == 2 && phrase.charAt(1) == 'y') {
                int index = phrase.indexOf('y');
                String firstSection = phrase.substring(0, index );
                String endSection = phrase.substring(index+1);
                String result = endSection + firstSection;
                return "y" + result.replaceFirst("y", "ay");
            } else if (isQuNextConsonant(phrase)) {
                int index = phrase.indexOf('u');
                String firstSection = phrase.substring(0, index );
                String endSection = phrase.substring(index+1);
                return endSection.concat(firstSection + "ay");
            } else {
                String consonantCluster = getConsonantCluster(phrase);
                String nextToConsonantCluster = getNextToConsonantCluster(phrase);

                return nextToConsonantCluster.concat(consonantCluster + "ay");
            }
        }
    }*/
}