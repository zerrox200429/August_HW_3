package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double cash = 10000;
        BankAccount bank = new BankAccount();

        bank.deposit(5000);

        while (true) {
            try {

                System.out.println("Сумма вывода:");
                String wallet = scanner.nextLine();

                bank.withDraw(5000);
                if (bank.wallet >= 0) {

                    cash = bank.wallet - cash;
                    bank.wallet = cash;

                }
            } catch (LimitException e) {
                e.printStackTrace();
            }
        }


    }
}
