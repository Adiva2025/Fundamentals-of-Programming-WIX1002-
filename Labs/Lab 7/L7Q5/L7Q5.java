package lab.L7Q5;
import java.io.*;
public class L7Q5 {
    public static void main(String[] args) {
        try{
        ObjectInputStream r = new ObjectInputStream(new FileInputStream("person copy.dat"));
        int total = r.readInt();

        String[] name = new String[total];
        int[] age = new int[total];
        char[] gender = new char[total];    

        for(int i=0; i<total; i++){
            name[i] = r.readUTF();
            age[i] = r.readInt();
            gender[i] = r.readChar();
        }

        for(int i = 0; i<total ; i++){
            for(int j = 0; j<total -1 -i ; j++){
                if(name[j].compareToIgnoreCase(name[j+1]) > 0){
                    String tempName = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tempName;

                    int tempAge = age[j];
                    age[j] = age[j+1];
                    age[j+1] = tempAge;

                    char tempG = gender[j];        
                    gender[j] = gender[j+1];   
                    gender[j+1] = tempG;
                }
            }    
        }    

        for(int i=0; i<total; i++){
            System.out.println("Name: " + name[i]);
            System.out.println("Age: " + age[i]);
            if(gender[i] == 'M'){
                System.out.println("Male");
            }else{
                System.out.println("Female");
            }
        }    
        r.close();
        
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
    }
}
