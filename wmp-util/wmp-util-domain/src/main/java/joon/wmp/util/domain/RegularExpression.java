package joon.wmp.util.domain;

public class RegularExpression {
    //
    private static final String NUM_REG = "[^0-9]";
    private static final String ALPHABET_REG = "[^a-zA-Z]";

    private String inputValue;

    public RegularExpression(String inputValue){
        //
        this.inputValue = inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    public String getNum() {
        return this.inputValue.replaceAll(NUM_REG, "");
    }

    public String getAlphabet() {
        return this.inputValue.replaceAll(ALPHABET_REG, "");
    }
}
