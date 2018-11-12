import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber;

        System.out.println("Witaj w super kalkulatorze! ");

        int userType;
        do{

            System.out.println("1 - Dodawanie");
            System.out.println("2 - Odejmowanie");
            System.out.println("3 - Suma cyfr");
            System.out.println("4 - Potęga");
            System.out.println("5 - Na system binarny");

            System.out.print("Podaj wybór: ");
            userType = scanner.nextInt();

            System.out.print("Podaj liczbe 1: ");
            firstNumber = scanner.nextInt();



            switch (userType){
                case 1: {
                    System.out.print("Podaj liczbe 2: ");
                    secondNumber = scanner.nextInt();

                    int result = firstNumber + secondNumber;
                    System.out.println("Wynik to: " + result);
                    break;
                }

                case 2: {
                    System.out.print("Podaj liczbe 2: ");
                    secondNumber = scanner.nextInt();

                    int result = firstNumber - secondNumber;
                    System.out.println("Wynik to: " + result);
                    break;
                }

                case 3: {
                    int sum = 0;
                    while (firstNumber != 0){
                        sum += firstNumber % 10;
                        firstNumber /= 10;
                    }


                    System.out.println("Wynik to: " + sum);
                    break;
                }

                case 4: {
                    System.out.print("Do ktorej potegi?: ");
                    secondNumber = scanner.nextInt();

                    int result = firstNumber;
                    for (int i = 0; i < secondNumber; i++) {
                        result *= firstNumber;
                    }


                    System.out.println("Wynik to: " + result);
                    break;
                }

                case 5: {
                    StringBuilder stringBuilder = new StringBuilder();
                    while (firstNumber != 0){
                        stringBuilder.append(firstNumber % 2);
                        firstNumber /= 2;
                    }

                    System.out.println("Wynik to: " + stringBuilder.reverse().toString());
                    break;
                }

                case 6: {
                    System.out.printf("Byebye");
                    System.exit(0);
                }

                default: {
                    System.out.println("Nie znam takiej komendy!");
                }
            }


        }while (true);

    }
}
