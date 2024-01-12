package testModule;

import entities.Account;
import entities.AccountBussines;
import entities.SavingsAccount;

import java.util.Scanner;

public class AccountTests {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        Account account = new Account(2234, "Matheus", 2000.0);

        SavingsAccount account2 = new SavingsAccount(2234, "Matheus", 2000.0, 10.0);

        while(true){
            System.out.println(account2);

            Double saque = 0.0;
            do {
                System.out.print("Entre com o valor de saque(taxa de R$7):");
                saque = get.nextDouble();
                get.nextLine();

                if (saque <= account2.getBalance()){
                    account2.withDraw(saque);

                    System.out.println("Saldo: R$" + account2.getBalance());
                    System.out.println("Saque: R$" + saque);
                }
                else {
                    System.out.println("Saldo insuficiente.");
                }
            }while(saque >= account2.getBalance());
        }
    }
}
