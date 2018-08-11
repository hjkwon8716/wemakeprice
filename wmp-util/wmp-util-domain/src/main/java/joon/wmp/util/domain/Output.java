package joon.wmp.util.domain;

public class Output {
    //
    private String crossSortValue;
    private int condition;

    public Output(String crossSortValue, int condition){
        this.crossSortValue = crossSortValue;
        this.condition = condition;
    }

    public String getCrossSortValue() {
        return crossSortValue;
    }

    public String getShare(){
        int length = this.crossSortValue.length();
        if(condition > length) {
            return "";
        }

        int endIndex = (length / condition) * condition;
        return this.crossSortValue.substring(0, endIndex);
    }

    public String getBalance(){
        int length = this.crossSortValue.length();
        if(condition > length) {
            return this.crossSortValue;
        }

        if(condition == length){
            return "";
        }

        int startIndex = (length / condition) * condition;

        return this.crossSortValue.substring(startIndex);
    }
}
