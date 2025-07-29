package IntroPoo.Aplication6;

import IntroPoo.entities6.dataBank;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        dataBank databank;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double depositMoney= sc.nextDouble();
            databank = new dataBank(accountHolder, accountNumber, depositMoney);
        }
        else
        {
            databank = new dataBank(accountHolder, accountNumber);
        }

        /**
          switch(response) {
            case 'y' -> {
                System.out.print("Enter initial deposit value: ");
                double depositMoney = sc.nextDouble();
                databank = new dataBank(accountHolder, accountNumber, depositMoney);
            }
            default -> databank = new dataBank(accountHolder, accountNumber);
        }
        **/

        System.out.println("\nAccount data:");
        System.out.println(databank);

        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        databank.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(databank);

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        databank.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.println(databank);

        sc.close();
    }
}