package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account wallet = new Account();
        wallet.deposit(10000);
        wallet.withdraw(2000);
        wallet.withdraw(100000);
        wallet.showAmount();
    }
}
