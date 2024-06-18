package cw4;

import java.util.Scanner;

public class Numbers {
    private int[] numberArray = new int[10];

    public void fillArray() {
        for (int i = 0; i < 10; i++) {
            try {
                numberArray[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                numberArray[i] = 0;
            }
        }
    }

    public void displayArray() {
        for (int number : numberArray) {
            System.out.println(number);
        }
    }

    private int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }
}
