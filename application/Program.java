package application;

import entities.Account;
import entities.AccountBussines;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static Scanner sc = new Scanner(System.in);
    public static List<Account> accounts = new ArrayList<>();;

    public static void main(String[] args) {

        mainMenu();
    }

    public static void mainMenu(){
        int option;
        do {
            System.out.println("SELECIONE O TIPO DE CONTA:");
            System.out.println("(1) - Conta Comum");
            System.out.println("(2) - Conta Empresarial");
            System.out.println("(3) - Conta Poupança");
            System.out.println("(4) - Listar Contas");
            System.out.println("(0) - sair");
            System.out.print(">>:");

            option = sc.nextInt();
            sc.nextLine();
        }while (option > 4 || option < 0);

        switch (option){
            case 0:
                System.out.println("Até a próxima.");
                System.exit(0);
                break;
            case 1:
                System.out.println("CONTA COMUM");
                createAccount(1);
                break;
            case 2:
                System.out.println("CONTA EMPRESARIAL");
                createAccount(2);
                break;
            case 3:
                System.out.println("CONTA POUPANÇA");
                createAccount(3);
            case 4:
                System.out.println("LISTAGEM");
                listAccounts();
            default:
                break;
        }
    }

    //
    public static void createAccount(int option){

        System.out.print("Número da conta:");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do proprietário:");
        String holder = sc.nextLine();

        System.out.print("Depósito inicial:");
        Double balance = sc.nextDouble();
        sc.nextLine();

        Account account = null;

        if (option == 1){
            account = new Account(number, holder, balance);
        }

        else if (option == 2) {
            System.out.print("Limite de empréstimo:");
            double loanLimit = sc.nextDouble();
            sc.nextLine();

            account = new AccountBussines(number,holder,balance, loanLimit);
        }

        else if (option == 3) {
            System.out.print("Taxa de juros(valor inteiro)%:");
            double interestRate = sc.nextDouble();

            interestRate = interestRate / 100;

            account = new SavingsAccount(number,holder,balance,interestRate);
        }

        accounts.add(account);
        jumpXlines();
        mainMenu();
    }

    public static void listAccounts(){
        for(Account account : accounts){
            System.out.println(account);
        }

        System.out.println("ENTER PARA PROSSEGUIR.");
        sc.nextLine();

        jumpXlines();
        mainMenu();
    }

    public static void jumpXlines(){
        for (int l = 0; l < 20; l++){
            System.out.println();
        }
    }
}
