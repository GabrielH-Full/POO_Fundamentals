package IntroPoo.Aplication9;
import IntroPoo.entities9.register;
import java.util.*;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<register> list = new ArrayList<>();
        Set<Integer> userIds = new HashSet<>();

        System.out.print("How many employees will be registered?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Emplyoee #" + i + ":");

            int id;
            while (true) {
                System.out.print("\nId: ");
                id = sc.nextInt();
                if (!userIds.contains(id)) {
                    userIds.add(id);
                    break;
                } else {
                    System.out.println("ID already registered. Try another one.");
                }
            }
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new register(name, salary, id));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        register emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("\nThis id does not exist!");
        }
        else {
            System.out.print("\nEnter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        for (register x : list) {
            System.out.println("List of employees: \n" + x);
        }

        sc.close();
    }
}
