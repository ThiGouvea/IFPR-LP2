package aula240423;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC = 0;

        System.out.println("Digite o valor dos lados do primeiro triangulo");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite o valor dos lados do segundo triangulo");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        if (areaX > areaY) {
            System.out.println("A area do primeiro triangulo é maior que o segundo");
        } else if (areaX == areaY) {
            System.out.println("A area do primeiro triangulo é igual a do segundo");
        } else {
            System.out.println("A area do segundo triangulo é maior que a do primeiro");
        }
    }
}