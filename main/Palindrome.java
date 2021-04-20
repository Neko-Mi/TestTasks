package main;

public class Palindrome {
    private String number;
    private boolean isPalindrome;

    public Palindrome(String number) {
        this.number = number;
        checkIsPalindrome();
    }

    public Palindrome(){}

    public Palindrome(Object number){
        this.number = number.toString();
        checkIsPalindrome();
    }

    private void checkIsPalindrome(){
        char [] charNumber = this.number.toCharArray();
        this.isPalindrome = true;

        for(int i = 0; i < charNumber.length / 2; i++){
            if(charNumber[i] != charNumber[charNumber.length - 1 - i]){
                this.isPalindrome = false;
                break;
            }
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
        checkIsPalindrome();
    }

    public void setNumber(Object number) {
        this.number = number.toString();
        checkIsPalindrome();
    }

    public boolean isPalindrome() {
        return isPalindrome;
    }
}
