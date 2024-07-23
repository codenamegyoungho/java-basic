package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금 후 잔고 : " + balance);
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 인출합니다. 인출 후 잔고:" + balance);
        }
    }

    void showAmount() {
        System.out.println("현재 잔액은: " + balance + "원입니다.");
    }
}
