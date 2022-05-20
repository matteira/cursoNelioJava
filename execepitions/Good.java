package execepitions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Good {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = leitor.nextInt();
            System.out.println("Check-in  date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(leitor.next());
            System.out.println("Check-out  date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(leitor.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println(" ");

            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in  date (dd/MM/yyyy): ");
            checkIn = sdf.parse(leitor.next());
            System.out.println("Check-out  date (dd/MM/yyyy): ");
            checkOut = sdf.parse(leitor.next());

            reservation.updatesDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid data format");
        } catch (DomainExeception e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        
        leitor.close();
    }
}
