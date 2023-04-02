class Scrabble {
    public String word;
    private String value1 = "aeioulnrst";
    private String value2 = "dg";
    private String value3 = "bcmp";
    private String value4 = "fhvwy";
    private String value5 = "k";
    private String value6 = "jx";
    private String value7 = "qz";


    Scrabble(String word) {
        this.word = word;
    }

    public int getScore() {
        int count = 0;
        if (word.length()>0){
            for (String letter : word.toLowerCase().split("")) {
                if (value1.contains(letter)) count = count + 1;
                if (value2.contains(letter)) count = count + 2;
                if (value3.contains(letter)) count = count + 3;
                if (value4.contains(letter)) count = count + 4;
                if (value5.contains(letter)) count = count + 5;
                if (value6.contains(letter)) count = count + 8;
                if (value7.contains(letter)) count = count + 10;
            }
        }
        return count;
    }

}
