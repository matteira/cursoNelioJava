package try_catch_exemple;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteWithMethod {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("Start METHOD1");
        method2();
        System.out.println("END METHOD1");
    }

    public static void method2() {
        System.out.println("Start METHOD2 ");
        Scanner leitor = new Scanner(System.in);

        try {

            String[] vect = leitor.nextLine().split(" ");
            int position = leitor.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid position !");

            e.printStackTrace();
            leitor.next();

        } catch (InputMismatchException i) {

            System.out.println("Input error");

        }

        System.out.println("END METHOD2 ");

        leitor.close();
    }


}
