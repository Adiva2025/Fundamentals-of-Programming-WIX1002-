package lab;
import java.io.*;

interface Searchable{

   boolean search(int day, int month, int year, int startTime, int endTime);
}
class Appointment implements Searchable{
    private int day, month, year;
    private int startTime, endTime;
    private String fileName;

    public Appointment(int day, int month, int year, int startTime, int endTime, String fileName) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
        this.fileName = fileName;
    }

    public void saveAppointment() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
        bw.write(day + "," + month + "," + year + "," + startTime + "," + endTime);
        bw.newLine();
        bw.close();
        System.out.println("Appointment saved successfully.");
    }

    // Search if appointment is available
    @Override
    public boolean search(int sDay, int sMonth, int sYear, int sStart, int sEnd) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                return true; // No file yet, all slots available
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int fDay = Integer.parseInt(parts[0]);
                int fMonth = Integer.parseInt(parts[1]);
                int fYear = Integer.parseInt(parts[2]);
                int fStart = Integer.parseInt(parts[3]);
                int fEnd = Integer.parseInt(parts[4]);

                // Check same date
                if (fDay == sDay && fMonth == sMonth && fYear == sYear) {
                    // Check overlapping time
                    if (!(sEnd <= fStart || sStart >= fEnd)) {
                        br.close();
                        return false; 
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File error.");
        }
        return true; 
    }
}
public class L10Q4 {
    public static void main(String[] args) {

      
        Appointment appt1 = new Appointment(10, 1, 2026, 10, 12, "lab/appointments.txt");

        if (appt1.search(10, 1, 2026, 10, 12)) {
            try {
                appt1.saveAppointment();
            } catch (IOException e) {
                System.out.println("Error saving appointment.");
            }
        } else {
            System.out.println("Time slot not available.");
        }

        // Example 2: Another appointment on same date overlapping
        Appointment appt2 = new Appointment(10, 1, 2026, 11, 13,"lab/appointments.txt");

        if (appt2.search(10, 1, 2026, 11, 13)) {
            try {
                appt2.saveAppointment();
            } catch (IOException e) {
                System.out.println("Error saving appointment.");
            }
        } else {
            System.out.println("Time slot not available.");
        }

        // Example 3: Non-overlapping appointment
        Appointment appt3 = new Appointment(10, 1, 2026, 13, 14, "lab/appointments.txt");

        if (appt3.search(10, 1, 2026, 13, 14)) {
            try {
                appt3.saveAppointment();
            } catch (IOException e) {
                System.out.println("Error saving appointment.");
            }
        } else {
            System.out.println("Time slot not available.");
        }
    }
}
