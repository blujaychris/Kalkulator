import javax.swing.*;
import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();
        calculator2.startMainLoop();
    }

    Scanner scanner = new Scanner(System.in);

    private void startMainLoop() {
        do {
            printMenu();
            parseUserChoice(getNumberFromUser());

        } while (true);

    }

    private void printMenu() {
        System.out.println("0 - Wyłączenie kalkulatora");
        System.out.println("1 - Dodawanie");
        System.out.println("2 - Odejmowanie");
        System.out.println("3 - Suma cyfr");
        System.out.println("4 - Potęga");
        System.out.println("5 - Przelicz na postać binarną");
    }

    private void parseUserChoice(int userChoice) {
        switch (userChoice) {
            case 1: {
                printInteger(add(getNumberFromUser(), getNumberFromUser()));
                break;
            }
            case 2: {
                printInteger(substract(getNumberFromUser(), getNumberFromUser()));
                break;
            }
            case 3: {
                printInteger(adddigits(getNumberFromUser()));
                break;
            }
            case 4: {
                printInteger(powerof(getNumberFromUser()));
                break;
            }
            case 5: {
                printString(makebinarynumber(getNumberFromUser()));
                break;
            }
        }
    }

    private int getNumberFromUser() {
        System.out.println("Podaj liczbę: ");
        return scanner.nextInt();
    }

    private void printInteger(int result) {
        JOptionPane.showMessageDialog(null, String.valueOf(result));
    }

    private void printString(String result) {
        JOptionPane.showMessageDialog(null, (result));
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int substract(int a, int b) {
        return a - b;
    }

    private int adddigits(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return a;
    }

    private int powerof(int a) {
        System.out.println("Do której potęgi chcesz podnieść licbę?");
        int b = scanner.nextInt();
        for (int i = 0; i < b; i++) {
            a = a * a;
        }
        return a;
    }

    private String makebinarynumber(int a) {
        StringBuilder stringBuilder = new StringBuilder();
        while (a != 0){
            stringBuilder.append(a % 2);
            a /= 2;
        }

        return stringBuilder.reverse().toString();
    }
}
