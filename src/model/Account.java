package model;

public interface Account {
    void withdraw(Double amountOfCash);
    void deposit(Double amountOfCash);
    void showBalance();
}
