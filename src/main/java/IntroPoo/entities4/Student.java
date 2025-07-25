package IntroPoo.entities4;

public class Student {
    public String name;
    public double note1;
    public double note2;
    public double note3;


    public double sun() {
        return note1 + note2 + note3;
    }

    public double missingPoints() {
            if (sun() < 60.0){
                return 60.0 - sun();
            }
            else {
                return 0.0;
            }
    }
}
