package ex26;

import java.util.Scanner;

public class MonthsToPayOffCC {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        PaymentCalculator account1 = new PaymentCalculator();

        System.out.println("What is your balance?");
        account1.setB(input.nextInt());

        System.out.println("What is your APR on the card (as a percent)?");
        account1.setApr(input.nextInt());

        System.out.println("What is the monthly payment you make?");
        account1.setP(input.nextInt());

        System.out.println("It will take you "+account1.calculateMonthsUntilPaidOff()+" months to pay off this card");

    }
}
