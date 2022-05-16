package exercicio_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employee: ");
        int num = leitor.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = leitor.next().charAt(0);

            System.out.print("Name: ");
            leitor.nextLine();
            String name = leitor.nextLine();

            System.out.print("Hours: ");
            int hours = leitor.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = leitor.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = leitor.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }

            System.out.println(" ");
            System.out.println("PAYMENTS: ");

            for (Employee emp : list) {
                System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
            }
            
        }

        leitor.close();
    }
}
