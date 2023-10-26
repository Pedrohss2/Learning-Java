package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static final double PI  = 3.14;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.println("Is there a initial deposit (y/n)?");
        char validate = sc.next().charAt(0);

        if(validate == 'y') {
            System.out.println("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            account = new Account(numberAccount, holder, deposit);

        } else {
            account = new Account(numberAccount, holder);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated account data: ");
        System.out.println(account);


        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(account);
        sc.close();
    }


}
