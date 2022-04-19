package poo;

import java.util.Scanner;

public class pooNelio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Valores do triangulo X: ");
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();
        System.out.println("Valores do triangulo Y: ");
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();

        double areaX = x.calculo();
        double areaY = y.calculo();

        if (areaX > areaY){
            System.out.println("Area do triangulo X é o maior");
        }else{
            System.out.println("Area do  triangulo Y é o maior");
        }
        leitor.close();
    }
}
