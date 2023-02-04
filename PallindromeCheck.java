package Recursion;

import java.util.Scanner;

public class PallindromeCheck {
    public static void main(String[] args) {
        // 
        int gau=5;
        System.out.println(gau);
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(isPalindrome(str)){
            System.out.println("Is pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }

    }
    static boolean isPalindrome(String str){
        if(str.equals(""))return true;
        if(str.length()==1)return true;
        return (str.charAt(0)==str.charAt(str.length()-1))&&isPalindrome(str.substring(1,str.length()-2));
    }
}
