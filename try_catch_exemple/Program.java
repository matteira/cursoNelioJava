package try_catch_exemple;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {

            String[] vect = leitor.nextLine().split(" ");
            int position = leitor.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid position !");

        } catch (InputMismatchException i) {

            System.out.println("Input error");

        }

        System.out.println("End of program");
        leitor.close();
    }
}
