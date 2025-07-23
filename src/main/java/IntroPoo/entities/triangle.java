package IntroPoo.entities;

public class triangle {
    public double a;
    public double b;
    public double c;

    public double area() {
      double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - b) * (p - c));
    };
}

