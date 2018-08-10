package joon.wmp.util.domain;

public class Sort {

    private RegularExpression regularExpression;

    public Sort(RegularExpression regularExpression){
        this.regularExpression = regularExpression;
    }

    public String getNumSort(){
        String num = this.regularExpression.getNum();
        return this.asceSort(num, num.length());
    }

    public String getAlphabetSort(){
        String alphabet = this.regularExpression.getAlphabet();
        return this.asceSort(alphabet, alphabet.length());
    }

    public String getCrossSort(){

        String alphabet = this.getAlphabetSort();
        String num = this.getNumSort();

        int alphaLength = alphabet.length();
        int numLength = num.length();
        if(alphaLength == 0 || numLength == 0){
            return this.getAlphabetSort() + this.getNumSort();
        }

        return this.crossSort(alphabet, num);
    }

    private String asceSort(String before,int size){
        //
        char str[] = before.toCharArray();
        for (int i = 0; i < size-1; i++){
            for(int j = 1; j < size-i; j++){
                if(str[j-1]> str[j]) {
                    char temp = str[j-1];
                    str[j-1]=str[j];
                    str[j] = temp;
                }
            }
        }
        return new String(str);
    }

    private String crossSort(String alphabet, String num){
        //
        char alphabetChar[] = alphabet.toCharArray();
        char numChar[] = num.toCharArray();

        int alphaLength = alphabetChar.length;
        int numLength = numChar.length;

        char crossChar[] = new char[alphaLength+numLength];

        int index = 0;
        for(int i = 0; i < alphaLength; i++){
            if(i < numLength) {
                index = (i * 2);
            }else {
                if(i == numLength) {
                    index +=2;
                }else {
                    index ++;
                }

            }
            crossChar[index] = alphabetChar[i];
        }

        index = 0;
        for(int i = 0; i < numLength; i++){
            if(i < alphaLength) {
                index = (i * 2) + 1;
            }else {
                index ++;
            }
            crossChar[index] = numChar[i];
        }


        return new String(crossChar);
    }
}
