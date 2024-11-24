package model;

public class CreditCardAccount implements Account{
    private  Double balance = 0.0;
    @Override
    public void withdraw(Double amountOfCash) {
        if(amountOfCash<0){
            System.out.println("[+] Amount of cash must be greater than 0");
            return;
        }else if(amountOfCash>balance){
            System.out.println("[!] The account balance is not enough 😢");
            return;
        }
        balance = balance-amountOfCash;
        System.out.println("[+] You  have withdrawn " + amountOfCash + " $ from your saving account.");
    }
    @Override
    public void deposit(Double amountOfCash) {
        if(amountOfCash<0) {
            System.out.println("[+] Amount of cash must be greater than 0");
            return;
        }else {
            balance = balance + amountOfCash;
            System.out.println("[+] You have been deposited " + amountOfCash + " $ to your saving account.");
            return;
        }
    }
    @Override
    public void showBalance() {
        System.out.println("[+] Your saving account balance: " + balance +" $");
    }
}
