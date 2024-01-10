import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a short date
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        try {
            // Parse the short date
            SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdfInput.parse(shortDate);

            // Extract year, month, and day
            SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
            SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
            SimpleDateFormat sdfDay = new SimpleDateFormat("dd");

            int year = Integer.parseInt(sdfYear.format(date));
            int month = Integer.parseInt(sdfMonth.format(date));
            int day = Integer.parseInt(sdfDay.format(date));

            // Convert month number to month name
            String monthName = getMonthName(month);

            // Display the full date representation
            System.out.println("Full Date: " + monthName + " " + day + ", " + year);

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use the format YYYY-MM-DD.");
        } finally {
            scanner.close();
        }
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};
        if (month >= 1 && month <= 12) {
            return monthNames[month];
        } else {
            return "Invalid Month";
        }
    }
}