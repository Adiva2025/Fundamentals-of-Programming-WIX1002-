package lab;
import java.io.*;

class ShuffleCipher implements MessageEncoder{

    private String inputFileName;
    private String outputFileName;
    private int N;

    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }

    @Override
    public String encode(String plainText) {

        String text = plainText;

        for (int k = 0; k < N; k++) {
            int mid = text.length() / 2;
            String first = text.substring(0, mid);
            String second = text.substring(mid);
            String result = "";

            int i = 0;
            while (i < first.length() || i < second.length()) {
                if (i < first.length()) 
                    result += first.charAt(i);
                if (i < second.length()) 
                    result += second.charAt(i);
                i++;
            }
            text = result;
        }
        return text;
    }

    @Override
    public String decode(String cipherText) {

        String text = cipherText;

        for (int k = 0; k < N; k++) {
            String first = "";
            String second = "";
            for (int i = 0; i < text.length(); i++) {
                if (i % 2 == 0)
                     first += text.charAt(i);
                else 
                    second += text.charAt(i);
            }
            text = first + second;
        }
        return text;
    }

    public void encodeFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
        String line = br.readLine();
        bw.write(encode(line));
        br.close();
        bw.close();
    }

    public void decodeFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
        String line = br.readLine();
        bw.write(decode(line));
        br.close();
        bw.close();
    }
    
}
public class L10Q3 {
    public static void main(String[] args) {
        try {
            // Substitution Cipher Test
            SubstitutionCipher sc = new SubstitutionCipher("lab/input.txt", "lab/encoded.txt", 2);
            sc.encodeFile();   
            sc = new SubstitutionCipher("lab/encoded.txt", "lab/decoded.txt", 2);
            sc.decodeFile();   
            System.out.println("Substitution Cipher Done");

            // Shuffle Cipher Test
            ShuffleCipher sh = new ShuffleCipher("lab/input.txt", "lab/shuffleEncoded.txt", 1);
            sh.encodeFile();  
            sh = new ShuffleCipher("lab/shuffleEncoded.txt", "lab/shuffleDecoded.txt", 1);
            sh.decodeFile();  
            System.out.println("Shuffle Cipher Done");

        } catch (IOException e) {
            System.out.println("File Error Occurred");
        }
    }
}
