import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader myBufferedReader = new BufferedReader( new InputStreamReader(System.in));
        Scanner myScanner = new Scanner(System.in);
        boolean isRunCipherApp = true;

        while (isRunCipherApp){
            System.out.println("Caesar Cipher");
            System.out.println("Enter decrypt/encrypt or exit");
            String optionSelected = myBufferedReader.readLine();

            if (optionSelected.equals("encrypt")){
                System.out.println("Enter a message to encrypt");
                String inputReceived = myBufferedReader.readLine();
                System.out.println("Enter an encryption key");
                int providedKey = myScanner.nextInt();
                Encrypt myEncrypt = new Encrypt(inputReceived, providedKey);
                String encryptedChar = myEncrypt.Encrypt(inputReceived, providedKey);
                System.out.println("The encrypted message is: " + encryptedChar);
            }
        }
    }
}

