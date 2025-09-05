package Calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("Operation that can be performed are:\n1. Addition (+)\n2. Subtraction (-)\n3. " +
                "Multiplication (*)\n4. Division (/)\n");
        int input = 1;
        while(input != 0){
            System.out.print("Enter your Two Numbers: ");
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            System.out.print("Enter Operation to be performed: ");
            String opreation = in.next();
            switch (opreation) {
                case "+" -> {
                    double sum = add(num1, num2);

                    System.out.println("The Addition of " + num1 + " and " + num2 + " is " + sum);
                }
                case "-" -> {
                    double sub1 = sub(num1, num2);
                    System.out.println("The Subtraction of " + num1 + " and " + num2 + " is " + sub1);
                }
                case "*" -> {
                    double mul1 = mul(num1, num2);
                    System.out.println("The Multiplication of " + num1 + " and " + num2 + " is " + mul1);
                }
                case "/" -> {
                    if (num2 == 0)
                        System.out.println("Enter Correct Number. Invalid Result");
                    else {
                        double div1 = div(num1, num2);
                        System.out.println("The Division of " + num1 + " and " + num2 + " is " + div1);
                    }
                }
                default -> System.out.println("Invalid Opreation");
            }
            System.out.println("-------------------------------------------");
            System.out.print("Enter 1 to continue or 0 to Exit: ");
            input = in.nextInt();
        }
        System.out.println("Thank you for using Calculator");
    }
    public static double add(double num1, double num2){
        return num1+num2;
    }
    static double sub(double num1, double num2){
        return num1-num2;
    }
    static  double mul(double num1, double num2){
        return num1*num2;
    }
    static double div(double num1, double num2){
        return num1/num2;
    }
}