package EnumeracaoComposicaoPOO.Aplication;

import EnumeracaoComposicaoPOO.Entities.Department;
import EnumeracaoComposicaoPOO.Entities.HourContract;
import EnumeracaoComposicaoPOO.Entities.Worker;
import EnumeracaoComposicaoPOO.Entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class program{
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

        System.out.print("Enter department's name:");
        String department = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker1 = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        System.out.println("How many Contracts to this worker? ");
        int n = sc.nextInt();

        Date contractDate;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + ": data:");
            System.out.print("Date (DD/MM/YYYY): ");
            contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double salaryHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int durationHours = sc.nextInt();
            HourContract contract = new HourContract (contractDate, salaryHour, durationHours);
            worker1.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker1.getName());
        System.out.println("Department: " + worker1.getDepartment().getNome());
        System.out.println("Income for " +  monthAndYear + ":" + String.format("%.2f", worker1.income(month, year)));

    }
}
