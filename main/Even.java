package main;

public class Even {
    private String number;
    private boolean isEven;

    public Even() {}

    public Even(String number) {
        this.number = number;
        checkIsEven();
    }

    public Even(Object number) {
        this.number = number.toString();
        checkIsEven();
    }

    public void checkIsEven(){
        char [] charNumber = this.number.toCharArray();
        int intNumber = 0;
        isEven = true;

        for (char el: charNumber){
            intNumber += (int)el;
        }

        if (intNumber % 2 > 0){
            isEven = false;
        }
    }

    public String getNumber() {
        return number;
    }

    public boolean isEven() {
        return isEven;
    }

    public void setNumber(String number) {
        this.number = number;
        checkIsEven();
    }
}
