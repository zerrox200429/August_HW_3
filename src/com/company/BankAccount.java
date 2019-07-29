package com.company;


public class BankAccount {
    double wallet = 10000;





    public void deposit(double sum) {

        wallet = wallet + sum;
        System.out.println("Деньги в кошелке  " + wallet);


    }

    public void withDraw(double sum) throws Exception {
        wallet = wallet - sum;

        if (wallet < 0)
            throw new LimitException("запращиваемая сумма на снятие больше чем остаток денег на счете",wallet);




    }


    public void getAmount() {
    }

    }








