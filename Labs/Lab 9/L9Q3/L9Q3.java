package lab;
import java.io.*;

class Lecturer extends PersonProfile{
    String[] courseNames = new String[10];
    String[] courseCodes = new String[10];   
    String[] semesters = new String[10];
    String[] sessions = new String[10];
    double[] creditHours = new double[10];
    int[] numStudents = new int[10];
    int courseCount = 0;

    Lecturer(String name, String gender, String dob, String fileName){
        super(name, gender, dob);
        readLecturerData(fileName);
    }

public void readLecturerData(String fileName) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String cCode;
            while ((cCode = br.readLine()) != null) {
                String cName = br.readLine();
                String sessionStr = br.readLine();
                String semStr = br.readLine();
                String creditStr = br.readLine();
                String numStudStr = br.readLine();

            
                courseCodes[courseCount] = cCode;
                courseNames[courseCount] = cName;
                sessions[courseCount] = sessionStr;
                semesters[courseCount] = semStr;
                creditHours[courseCount] = Double.parseDouble(creditStr.trim());
                numStudents[courseCount] = Integer.parseInt(numStudStr.trim());

                courseCount++;
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
           
        }
    }
    public double computeCreditHour(double ch, int students) {
        if (students >= 150) return ch * 3;
        else if (students >= 100) return ch * 2;
        else if (students >= 50) return ch * 1.5;
        else return ch;
    }
    public void displayLecturer() {
        displayProfile();
        System.out.println("Courses:");
        for (int i = 0; i < courseCount; i++) {
            double updatedCH = computeCreditHour(creditHours[i], numStudents[i]);
            System.out.println(courseCodes[i] + " - " + courseNames[i] +
                               " (Semester " + semesters[i] + ", Session " + sessions[i] + ")" +
                               " - Credit Hour: " + updatedCH + ", Students: " + numStudents[i]);
        }
    }
}
public class L9Q3 {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("Dr. Bob", "Male", "1980-12-15", "lecturer.txt");
        l.displayLecturer();
    }
      
}

