package main;

public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome("123");

        System.out.println(palindrome.getNumber());
        System.out.println(palindrome.isPalindrome());

        palindrome.setNumber(1111111111);
        System.out.println(palindrome.getNumber());
        System.out.println(palindrome.isPalindrome());

        Even even = new Even(123);
        System.out.println(even.getNumber());
        System.out.println(even.isEven());

        even.setNumber("23123213");
        System.out.println(even.getNumber());
        System.out.println(even.isEven());
    }
}
