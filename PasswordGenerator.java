import java.util.*;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many length password you need:");
        int length = sc.nextInt();
        generatePassword(length);

    }

    public static void generatePassword(int length) {
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
        String number = "1234567890";
        String specialChar = "<,>.?/;:'{[|]}!@#$%^&*(_)-+=";
        String combination = upperCase + lowerCase + number + specialChar;
        Random rn = new Random();
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = combination.charAt(rn.nextInt(combination.length()));
        }
        System.out.println("Generated Password is :" + new String(password));

    }

}
