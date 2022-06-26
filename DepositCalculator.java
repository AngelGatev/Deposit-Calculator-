package PbJavaNovember.src.FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double finalSum = deposit + period * deposit * interest / 1200;

        System.out.println(finalSum);
    }
}
