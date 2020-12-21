import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {

        //--------------------Display current time--------------------
        LocalTime timeObj = LocalTime.now();
        //System.out.println(timeObj);

        //--------------------Display current date--------------------
        LocalDate dateObj = LocalDate.now();
        //System.out.println(dateObj);

        //--------------------Display current date and current time together--------------------
        //LocalDateTime dateTimeObj = LocalDateTime.now();
        //System.out.println(dateTimeObj);

        //--------------------Formatting date and time--------------------
        LocalDateTime dateTimeObj = LocalDateTime.now();
        System.out.println("Before we format = " + dateTimeObj);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd ");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("E,MMM dd yyyy");

        String formattedDateTime1 = dateTimeObj.format(formatter1);
        String formattedDateTime2 = dateTimeObj.format(formatter2);
        String formattedDateTime3 = dateTimeObj.format(formatter3);
        String formattedDateTime4 = dateTimeObj.format(formatter4);

        System.out.println("After we format = "+formattedDateTime1);
        System.out.println("After we format = "+formattedDateTime2);
        System.out.println("After we format = "+formattedDateTime3);
        System.out.println("After we format = "+formattedDateTime4);
    }
}
