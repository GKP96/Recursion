package Recursion;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String newStr = reverseString(str);
        System.out.println(newStr);

    }
    // Yha kya ho rha hai.
    // Nothing is new in this so everyone can leanrn it.
    static String reverseString(String str){
        if(str.equals(""))return "";
       return reverseString(str.substring(1))+str.charAt(0);
    }
}
