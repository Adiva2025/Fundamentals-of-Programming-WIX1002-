package lab;
import java.io.*;

class PersonProfile{
    private String name;
    private String gender;
    private String dob;

    PersonProfile(){}
    PersonProfile(String name, String gender, String dob){
        this.name = name;   
        this.gender = gender;
        this.dob = dob;
    }
    public void displayProfile(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);    
    }  
}    
class Student extends PersonProfile{
   
    String[] courseNames = new String[10];
    String[] courseCodes = new String[10];   
    String[] semesters = new String[10];
    int[] sessions = new int[10];
    int[] marks = new int[10];
    int courseCount = 0;
    
    Student(String name, String gender, String dob, String fileName){
        super(name, gender, dob);
        readCourseData(fileName);
    }
    public void readCourseData(String fileName){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String cCode, cName, sem, session, mark;
            while ((cCode = br.readLine()) != null && courseCount < 10) {
                cName = br.readLine();
                session = br.readLine();
                sem = br.readLine();
                mark = br.readLine();

                courseCodes[courseCount] = cCode;
                courseNames[courseCount] = cName;
                sessions[courseCount] = Integer.parseInt(session);
                semesters[courseCount] = sem;
                marks[courseCount] = Integer.parseInt(mark);
                courseCount++;
            }
            br.close();
        }catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public String getGrade(int mark){
        
        if (mark >= 85) return "A";
        else if (mark >= 75) return "A-";
        else if (mark >= 70) return "B+";
        else if (mark >= 65) return "B";
        else if (mark >= 60) return "B-";
        else if (mark >= 55) return "C+";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 35) return "E";
        else return "F";
    }
    public void displayStudent() {
        displayProfile();
        System.out.println("Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courseCodes[i] + " - " + courseNames[i] + " (Semester " +
                   semesters[i] + ", Session " + sessions[i] + ") - Mark: " +
                   marks[i] + ", Grade: " + getGrade(marks[i]));}
    }
}
public class L9Q2 {
    public static void main(String[] args) {
        Student s = new Student("Alice", "Female", "2000-05-10", "/Users/adivakar/Desktop/course.txt");
        s.displayStudent();

    }
}
