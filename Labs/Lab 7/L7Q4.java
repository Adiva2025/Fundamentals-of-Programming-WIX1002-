package lab;
import java.io.*;
import java.util.Scanner;

public class L7Q4 {
    public static void main(String[] args) {
        int lcount = 0;
        int wcount = 0;
        int ccount = 0;
        try{
            Scanner s = new Scanner(new FileInputStream("file.txt"));

            while(s.hasNextLine()){
                String line = s.nextLine();
                lcount++;
                wcount = wcount + line.split(" ").length;

                for(int i=0; i<line.length(); i++){
                    ccount++;
                }
            }
            s.close();
            System.out.println("Line count: " + lcount);
            System.out.println("Word count: " + wcount);
            System.out.println("Character count: " + ccount);

        }catch (IOException e){
            System.out.println("Problem with file input");
        }

    }
}
