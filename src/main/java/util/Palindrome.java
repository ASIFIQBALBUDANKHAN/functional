package util;

public class Palindrome {

    static boolean isPalindrome(int num) {
        int sum = 0, rem, temp;
        temp = num;
        while(num > 0) {
           rem =  num%10;
           sum = (sum * 10) + rem;
           num = num / 10;
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
      //  System.out.println("Is palindrome "+ "," + isPalindrome(44));

        String name = "Adam";
        String temp = "";
        for (int i = name.length()-1; i >= 0; i--) {
            temp = temp + name.charAt(i);
        }
        System.out.println(temp.equals(name));
    }
}
