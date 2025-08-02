package IntroPoo.Aplication8;

import IntroPoo.entities8.cadastro;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        cadastro[] cdt = new cadastro[10];

        System.out.print("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++){
                System.out.print("Rent #" + i + ":");
                System.out.print("\nName: ");
                String name = sc.next();
                System.out.print("Email: ");
                String email = sc.next();
                System.out.print("Room: ");
                int room = sc.nextInt();
                cdt[room] = new cadastro(name, email);
            }

        System.out.println();
        for (int i=1; i < 10; i++){
            if (cdt[i] != null){
                System.out.println("Busy rooms:");
                System.out.println(i + ": " + cdt[i]);
            }
        }

        sc.close();
    }
}
