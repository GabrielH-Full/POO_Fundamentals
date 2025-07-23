package IntroPoo.Aplication;

import IntroPoo.entities.triangle;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       // double xA, xB, xC, yA, yB, yC;

        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("Digite o valor de X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Area X: " + areaX);
        System.out.println("Area Y: " + areaY);

        if (areaX > areaY) {
            System.out.println("Maior area e o X: " + areaX);
        }
        else{
            System.out.println("Menor area e o y: " + areaX);
        }
        sc.close();
    }
}

