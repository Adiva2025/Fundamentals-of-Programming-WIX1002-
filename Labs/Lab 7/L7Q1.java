package lab;
import java.io.*;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        String[] courseCode = {"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
        String[] courseNames = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};

       //Table store karana file ke andar
       try 
        (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("courses.dat"))) {
        for(int i = 0; i<courseCode.length; i++){
            oos.writeUTF(courseCode[i]);
            oos.writeUTF(courseNames[i]);  
        }
        
       }catch(IOException e){
        System.out.println("Problem with file output");
        return;
       }

        Scanner s = new Scanner(System.in);
        System.out.println("Enter course code: ");
        String inputCode = s.nextLine();
        boolean found = false;

        try
            (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("courses.dat"))){
            while(true){
                String code = ois.readUTF();
                String name = ois.readUTF();

                if(code.equalsIgnoreCase(inputCode)){
                    System.out.println("Course Name: " + name);
                    found = true;
                    break;
                }
            }
        }catch(EOFException e){

        }catch (IOException a){
        System.out.println("Problem with file input");
        }  
         if(!found){
        System.out.println("Course code not found.");
        }
    } 
}
   

