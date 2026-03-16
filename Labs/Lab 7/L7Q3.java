package lab;
import java.io.*;
import java.util.Scanner;

public class L7Q3 {
    public static void main(String[] args) {
    
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream("reverse.txt"));
            Scanner s = new Scanner(new FileInputStream("Integer.txt"));

            while(s.hasNextLine()){
                String line = s.nextLine();
                String reversed = "";

                for(int i=line.length()-1; i>=0; i--){
                   reversed = reversed + line.charAt(i);
                }
                pw.println(reversed);
            }
            s.close();
            pw.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}
