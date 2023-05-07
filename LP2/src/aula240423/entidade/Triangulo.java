package aula240423.entidade;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double CalculoArea; {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
