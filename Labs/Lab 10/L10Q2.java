package lab;
import java.io.*;

interface MessageEncoder {
    String encode(String plainText);
    String decode(String cipherText);;
}

class SubstitutionCipher implements MessageEncoder{
    private String inputFileName;
    private String outputFileName;
    private int shift;

    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }

     public String encode(String plainText) {
        String result = "";

        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);

            if (Character.isLetter(ch)) {
                ch = (char) (ch + shift);
            }
            result = result + ch;
        }
        return result;
    }
    public String decode(String cipherText) {
        String result = "";

        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);

            if (Character.isLetter(ch)) {
                ch = (char) (ch - shift);
            }
            result = result + ch;
        }
        return result;
    }
    public void encodeFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));

        String line = br.readLine();
        String encoded = encode(line);

        bw.write(encoded);

        br.close();
        bw.close();
    }

    // Read from file, decode, write to file
    public void decodeFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));

        String line = br.readLine();
        String decoded = decode(line);

        bw.write(decoded);

        br.close();
        bw.close();
    }
}
public class L10Q2 {
    public static void main(String[] args) {

        try {
        SubstitutionCipher encoder =
                    new SubstitutionCipher("lab/input.txt", "lab/encoded.txt", 2);
            encoder.encodeFile();

            // Decoding
            SubstitutionCipher decoder =
                    new SubstitutionCipher("lab/encoded.txt", "lab/decoded.txt", 2);
            decoder.decodeFile();

            System.out.println("Encoding and Decoding done successfully.");

        } catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}