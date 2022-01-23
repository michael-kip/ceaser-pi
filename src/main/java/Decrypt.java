public class Decrypt {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String inputForEncryption;
    private int encryptionKey;

    public String getInputForEncryption(){
        return inputForEncryption;
    }
    public int getEncryptionKey(){
        return encryptionKey;
    }

    public Decrypt(String inputForEncryption, int encryptionKey){
        this.inputForEncryption = inputForEncryption;
        this.encryptionKey = encryptionKey;
    }

    public String Decrypt(String inputForEncryption, int encryptionKey){
        inputForEncryption = inputForEncryption.toUpperCase();
        String decryptionResults = "";
        for (int i=0; i<inputForEncryption.length(); i++){
            int characterIndex = alphabet.indexOf(inputForEncryption.charAt(i));
            int newCharIndex = (characterIndex - encryptionKey) % 26;
            if (newCharIndex < 0){
                newCharIndex = alphabet.length() + newCharIndex;
            }
            char decryptedChar = alphabet.charAt(newCharIndex);
            inputForEncryption = inputForEncryption + decryptedChar;
        }
        return decryptionResults;

    }
}
