package lab;
import java.util.Scanner; 
import java.net.URL;
import java.io.*; 
import java.net.URLConnection;

public class L7Q2 {
    public static void main(String[] args) {
        try{
        URL u = new URL("https://www.fsktm.um.edu.my");
        URLConnection cnn = u.openConnection();

        InputStream stream = cnn.getInputStream();
        Scanner s = new Scanner(stream);

        PrintWriter pw = new PrintWriter(new FileOutputStream("index.htm"));

        while(s.hasNextLine()){
            String line = s.nextLine();
            pw.println(line);
        }

        pw.close();
        s.close();

    }catch (IOException e){
        System.out.println("Problem with URL or connection");
    }
}
}