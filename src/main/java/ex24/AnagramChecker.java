package ex24;

import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String first, second;

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string: ");
        first = input.next();
        System.out.println("Enter the second string: ");
        second = input.next();

        if (isAnagram(first,second))
            System.out.println("\""+ first+"\" and \""+second+"\" are anagrams.");
        else
            System.out.println("\""+ first+"\" and \""+second+"\" are not anagrams.");

    }

    static boolean isAnagram(String firstWord, String secondWord) {

        int length1 = 0;
        int length2 = 0;

        char charFirst [] = firstWord.toCharArray();
        char charSecond [] = secondWord.toCharArray();

        for (char c : charFirst) length1++;
        for (char c : charSecond) length2++;


        if (length1 == length2){

            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < length1; i++){
                sum1 = sum1 + charFirst[i];
                sum2 = sum2 + charSecond[i];
            }

            if (sum1 == sum2) return true;
        }

        return false;

    }
}

