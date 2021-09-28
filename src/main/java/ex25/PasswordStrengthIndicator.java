package ex25;

import java.util.Scanner;

public class PasswordStrengthIndicator {

    static public void main (String[] args){

        Scanner input = new Scanner(System.in);

        String password, result;

        System.out.println("Create password: ");
        password = input.next();

        int strength = passwordStrength (password);

        System.out.println("hellllooo im here"+strength);

        switch (strength){
            case 1: result = "very weak";
                    break;
            case 2: result = "weak";
                    break;
            case 3: result = "strong";
                    break;
            case 4: result = "very strong";
                    break;
            default: result = "invalid";
        }

        System.out.println("The password '"+ password+"' is a "+result+ " password.");


    }

    static int passwordStrength(String password){

        char passArr[] = password.toCharArray();
        String specialCharacters = " !@#$%^&*()_+=-,<.>?/:;\"\'\\[{]}|";
        int strength = 1;

        if (password.length() < 8){
            for (int i = 0; i < password.length(); i++){
                if (Character.isDigit(passArr[i])) continue;
                else strength = 2;
            }
        }
        else {

            for (int i = 0; i < password.length(); i++){
                if (Character.isDigit(passArr[i])) strength = 3;

                if (specialCharacters.contains(Character.toString(passArr[i]))) strength = 4;
            }

        }

        return strength;
    }
}
