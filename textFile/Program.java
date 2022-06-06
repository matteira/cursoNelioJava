package textFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("c:\\temp\\in.txt");
        Scanner leitor = null;
        try {
            leitor = new Scanner(file);
            while (leitor.hasNextLine()){
                System.out.println(leitor.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (leitor != null){
                leitor.close();
            }
        }

    }
}
