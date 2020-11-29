// Chelsea Vuata
// COMP163
// This program gives you the name of the date you input along with which day of the year it is.
import java.util.Scanner;

class DayOfTheYear {
  public static void main(String[] args) {
    // These are the names of the twelve months.
    String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December" };
    // This is the number of days in each month, in order by month.
    int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the date as two integers: month day");
    // Scanning user's input
    int month = scan.nextInt();
    int day = scan.nextInt();
    int numOfDays = 0;

    for (int i = 0; i < (month - 1); i++) {
      if (month == 1) {
        numOfDays = numOfDays + day; // If the year is January, the number of days equals the input day.
      } else {
        numOfDays = numOfDays + days[i]; // Adds up the days from previous months.
      }
    }
    numOfDays = numOfDays + day; // Adds up the total number of days.

    System.out.println(months[month - 1] + " " + day + " is day " + numOfDays + " of the year.");
  }
}