package aula240423;

import aula240423.entidade.Triangulo;

import java.util.Scanner;
public class exe1comclass {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Digite o valor dos lados do primeiro triangulo");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite o valor dos lados do segundo triangulo");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.CalculoArea;
        double areaY = y.CalculoArea;

        if (areaX > areaY) {
            System.out.println("A area do primeiro triangulo é maior que o segundo");
        } else if (areaX == areaY) {
            System.out.println("A area do primeiro triangulo é igual a do segundo");
        } else {
            System.out.println("A area do segundo triangulo é maior que a do primeiro");
        }
    }
}