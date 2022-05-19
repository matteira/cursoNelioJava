package execepitions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bad {
    public static void main(String[] args) throws ParseException {
        Scanner leitor = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = leitor.nextInt();
        System.out.println("Check-in  date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(leitor.next());
        System.out.println("Check-out  date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(leitor.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println(" ");

            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in  date (dd/MM/yyyy): ");
            checkIn = sdf.parse(leitor.next());
            System.out.println("Check-out  date (dd/MM/yyyy): ");
            checkOut = sdf.parse(leitor.next());

            String error = reservation.updatesDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }

        }
        leitor.close();
    }
}
