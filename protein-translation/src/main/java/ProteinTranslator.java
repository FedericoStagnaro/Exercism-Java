import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    private String getProtein (String word) {
        if (word.equals("AUG")) {
            return "Methionine";
        } else if (word.equals("UUU") || word.equals("UUC") ) {
            return "Phenylalanine";
        } else if (word.equals("UUA") || word.equals("UUG") ) {
            return "Leucine";
        } else if (word.equals("UCU") || word.equals("UCC") || word.equals("UCA") || word.equals("UCG") ) {
            return "Serine";
        } else if (word.equals("UAU") || word.equals("UAC") ) {
            return "Tyrosine";
        } else if (word.equals("UGU") || word.equals("UGC")) {
            return "Cysteine";
        } else if (word.equals("UGG")) {
            return "Tryptophan";
        } else if (word.equals("UAA") || word.equals("UAG") || word.equals("UGA") ) {
            return "STOP";
        }
        return "";
    }


    List<String> translate(String rnaSequence) {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < rnaSequence.length(); i = i + 3) {
            String word = rnaSequence.substring(i ,i + 3);
            String protein = getProtein(word);

            if(protein.equals("STOP") ) return list; ;
            list.add(protein);
            }

            return  list;
        }

    }

