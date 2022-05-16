package metodo_abstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = leitor.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c) ? ");
            char ch = leitor.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(leitor.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = leitor.nextDouble();
                System.out.print("Heigth: ");
                double heigth = leitor.nextDouble();
                list.add(new Rectangle(color, width, heigth));
            } else {
                System.out.print("Radius: ");
                double radius = leitor.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println(" ");
        System.out.println("Shape area");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        leitor.close();
    }
}
