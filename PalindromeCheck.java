/*
!To run the code follow use the following lines of code in a terminal
*javac PalindromeCheck.java
*java PalindromeCheck
* 
*/


import java.util.Scanner;



//Main Class

//To test code just follow the prompt after running
//
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to check if its a palindrome");

        // Get the user input and convert it to lowercase
        String s = sc.nextLine().toLowerCase();

        boolean isPalindrome = true;
        int n = s.length();

        // Check if the string is a palindrome
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                isPalindrome = false;
                break;
            }
        }

        // Output whether the string is a palindrome or not
        if (isPalindrome) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
