package lab;

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Step 1: Input year and first day
        System.out.print("Enter the year: ");
        int year = s.nextInt();
        System.out.print("Enter the first day of the year (0=Sun, 1=Mon, ..., 6=Sat): ");
        int firstDay = s.nextInt();

        // Step 2: Days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};

        // Adjust February for leap year
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[1] = 29;
        }

        // Find the starting day of each month
        int currentStartDay = firstDay;
        for (int i = 0; i < 12; i++) {

            if (i == 4 || i == 7) {
                System.out.println("       " + monthNames[i] + " " + year);
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");

                // Print initial blanks
                for (int j = 0; j < currentStartDay; j++) {
                    System.out.print("    ");
                }

                // yahan hm har particular month ke fdays print karte hain joh ki 1 se start hoga
                for (int day = 1; day <= daysInMonth[i]; day++) {
                    System.out.printf("%3d ", day);

                    // New line after Saturday
                    if ((day + currentStartDay) % 7 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
            }

            // outer loop toh start hoga month vise but yahan next month ka start calculate hoga jiska value phir 
            //currentStartDay me store hoga ya also firtday mai
            currentStartDay = (currentStartDay + daysInMonth[i]) % 7;
        }

        s.close();
    }
}

