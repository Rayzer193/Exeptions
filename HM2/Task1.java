package HM2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите дробное число: ");
        Scanner sc = new Scanner(System.in);
        float number;

        while (true) {
            try {
                number = sc.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Неверный формат ввода, пожалуйста, повторите: ");
                sc.nextLine(); 
            }
        }

        System.out.println("Ваше число: " + number);
    }
}