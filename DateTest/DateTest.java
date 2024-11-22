package DateTest;

import java.time.DayOfWeek;
import java.time.LocalDate;
// import java.sql.Date; // this package is specifically for SQL
import java.util.Date;

public class DateTest {

  // String date = new Date();
 public static void main(String[] args) {
    Date date = new Date();
    date.toString();
    System.out.println(date); // Thu Nov 21 09:59:24 CET 2024
    System.out.println(date.toString()); // Thu Nov 21 09:59:24 CET 2024

    // You don't use constructor fro LocalDate class, instead call .now()
    LocalDate date2 = LocalDate.now();
    System.out.println(date2); // 2024-11-21
    LocalDate date3 = LocalDate.of(1994,01,19);
    System.out.println(date3);

    int day = date3.getDayOfMonth();
    int day2 = date3.getDayOfYear();
    DayOfWeek day4 = date3.getDayOfWeek();
    int monthValue = date3.getDayOfMonth();
    int year = date3.getYear();

    //  The original object remains unchanged. We say that the plusDays method does not mutate the object on which it is invoked
    LocalDate plus100 =  date3.plusDays(100);
    System.out.println(plus100);
    System.out.println(date3);

    // Print calendar with a current date
    LocalDate datE = LocalDate.now();
    int month = datE.getMonthValue();
    int today = datE.getDayOfMonth();

 }
}
