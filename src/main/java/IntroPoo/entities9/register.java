package IntroPoo.entities9;

public class register {
    String name;
    double salary;
    int id;

    public register(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "ID: " + id + ", " + "NAME: " + name + ", " + "SALARY: " + String.format("%.2f", salary);
    }
}
