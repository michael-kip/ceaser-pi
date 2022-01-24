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
            System.out.println("Enter: decrypt to decode message, encrypt to encode message and exit to terminate program");
            String optionSelected = myBufferedReader.readLine();

            if (optionSelected.equals("encrypt")){
                System.out.println("Enter a message to encrypt");
                String inputReceived = myBufferedReader.readLine();
                System.out.println("Enter an encryption key");
                int providedKey = myScanner.nextInt();
                Encrypt myEncrypt = new Encrypt(inputReceived, providedKey);
                String encryptedChar = myEncrypt.Encrypt(inputReceived, providedKey);
                System.out.println("The encrypted message is: " + encryptedChar);
            } else if (optionSelected.equals("decrypt")){
                System.out.println("Enter a message to decrypt");
                String inputToDecrypt = myBufferedReader.readLine();
                System.out.println("Enter a decryption key");
                int providedKey = myScanner.nextInt();
                Decrypt myDecrypt = new Decrypt(inputToDecrypt, providedKey);
                String encryptedChar = myDecrypt.Decrypt(inputToDecrypt, providedKey);
                System.out.println("The decrypted message is: " + encryptedChar);
            } else  if (optionSelected.equals("exit")){
                isRunCipherApp = false;
            } else {
                System.out.println("Error, invalid input!");
            }
        }
    }
}

