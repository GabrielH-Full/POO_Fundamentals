package IntroPoo.Aplication4;

import IntroPoo.entities4.Student;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("name: ");
        student.name = sc.nextLine();

        System.out.print("First trimester note: ");
        student.note1 = sc.nextDouble();
        System.out.print("Second trimester note: ");
        student.note2 = sc.nextDouble();
        System.out.print("Third trimester note: ");
        student.note3 = sc.nextDouble();

        System.out.println();
        System.out.print("FINAL NOTE: " + student.sun());

        if(student.sun() < 60.0){
            System.out.println("\nFAILED");
            System.out.printf("MISSING: %.2f POINTS%n", student.missingPoints());
        }
        else{
            System.out.println("\nPASS");
        }
        sc.close();
    }
}
