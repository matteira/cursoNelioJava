package try_catch_exemple;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlockWithFinally {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner leitor = null;
        try {
            leitor = new Scanner(file);
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Eror opening file " + e.getMessage());
        } finally {
            if (leitor != null) {
                leitor.close();
            }
        }
    }
}
